package com.example.clase26_tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lvwMenu;
    private TextView lblSelectedDrink;
    private ImageView imgSelectedDrink;
    private String cafe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvwMenu = (ListView) findViewById(R.id.lvwMenu);
        lblSelectedDrink = (TextView) findViewById(R.id.lblSelectedDrink);
        imgSelectedDrink = (ImageView) findViewById(R.id.imgSelectedDrink);

        lvwMenu.setOnItemClickListener((parent, view, position, id) -> {
            switch(position) {
                case 0:
                    Intent intent = new Intent(MainActivity.this, DrinksActivity.class);
                    startActivity(intent);
                    break;
            }
        });

        // Capturamos variables de retorno
        cafe = getIntent().getStringExtra("posicion");
        if (cafe != null) {
            lblSelectedDrink.setText(Drink.drinks[Integer.parseInt(cafe)].getName());
            imgSelectedDrink.setImageResource(Drink.drinks[Integer.parseInt(cafe)].getImageId());
        }
    }
}