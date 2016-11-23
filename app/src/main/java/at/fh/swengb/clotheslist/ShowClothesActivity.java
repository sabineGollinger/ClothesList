package at.fh.swengb.clotheslist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.clotheslist.model.Clothes;
import at.fh.swengb.clotheslist.model.Shirt;
import at.fh.swengb.clotheslist.model.Shoes;
import at.fh.swengb.clotheslist.model.Trousers;

/**
 * Created by Sabine on 18.11.2016.
 */

public class ShowClothesActivity extends AppCompatActivity {

    private Clothes clothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_clothes);

        Intent intent = getIntent();
        clothes = (Clothes)intent.getExtras().get("listClothes");

        TextView viewBrand = (TextView) findViewById(R.id.textViewBrand);
        TextView viewColour = (TextView) findViewById(R.id.textViewColour);
        TextView viewGender = (TextView) findViewById(R.id.textViewGender);

        viewBrand.setText(clothes.getBrand());
        viewColour.setText(clothes.getColour());
        viewGender.setText(clothes.getGender());

    }

    public void showURL(View view) {
        // Map point based on address
        Uri search = Uri.parse("https://www.google.at/search?q=" + clothes.getBrand());
        Intent searchIntent = new Intent(Intent.ACTION_VIEW, search);
        startActivity(searchIntent);
    }

    public void showStores(View view) {
        Uri location = Uri.parse("geo:0,0?q="+clothes.getBrand());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

}
