package at.fh.swengb.clotheslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.clotheslist.model.Clothes;
import at.fh.swengb.clotheslist.model.Shirt;
import at.fh.swengb.clotheslist.model.Shoes;
import at.fh.swengb.clotheslist.model.Trousers;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Clothes> listClothes;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myCustomerList);

        listClothes = new ArrayList<>();
        listClothes.add(new Shoes("Nike", 38, "black", "w", "Sneaker", true));
        listClothes.add(new Shoes("Adidas", 39, "green", "w", "Sneaker", true));
        listClothes.add(new Trousers("Nike", 40, "blue", "m", "L40", true));
        listClothes.add(new Trousers("Nike", 40, "blue", "m", "L40", true));
        listClothes.add(new Shirt("Nike", 38, "red", "w", "polyester", true));
        listClothes.add(new Shirt("Adidas", 40, "yellow", "w", "polyester", true));

        myAdapter = new CustomAdapter(this,listClothes);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Clothes selectedClothes;
        selectedClothes = listClothes.get(i);
        Intent intent = new Intent(view.getContext(), ShowClothesActivity.class);

        intent.putExtra("listClothes",selectedClothes);
        startActivity(intent);
    }
}
