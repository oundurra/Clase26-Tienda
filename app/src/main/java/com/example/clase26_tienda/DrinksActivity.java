package com.example.clase26_tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksActivity extends AppCompatActivity {
    ListView lvwDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        lvwDrinks = (ListView) findViewById(R.id.lvwDrinks);
        ArrayAdapter<Drink> adapter = new ArrayAdapter<Drink>(
                this
                , android.R.layout.simple_list_item_1
                , Drink.drinks);
        lvwDrinks.setAdapter(adapter);
        lvwDrinks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DrinksActivity.this, MainActivity.class);
                intent.putExtra("posicion", String.valueOf(position));
                startActivity(intent);
            }
        });
    }
}