package at.fh.swengb.clotheslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.clotheslist.model.Clothes;

/**
 * Created by Sabine on 18.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    List<Clothes> listClothes;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Clothes> listClothes) {
        this.context = applicationContext;
        this.listClothes= listClothes;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listClothes.size();
    }

    @Override
    public Object getItem(int i) {
        return listClothes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    //not the best solution
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }

        TextView viewBrand=(TextView)view.findViewById(R.id.textViewBrand);
        TextView viewColour=(TextView)view.findViewById(R.id.textViewColour);
        TextView viewGender=(TextView)view.findViewById(R.id.textViewGender);

        Clothes clothes = listClothes.get(i);
        viewBrand.setText(clothes.getBrand());
        viewColour.setText(clothes.getColour());
        viewGender.setText(clothes.getGender());

        return view;
    }

}
