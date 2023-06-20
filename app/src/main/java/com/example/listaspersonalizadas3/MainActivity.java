package com.example.listaspersonalizadas3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView fruitsListView;
    private FruitAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        List<Fruit> fruits = new ArrayList<>(); // Aquí agregas las frutas a la lista
        ListAdapter adapter = (ListAdapter) new FruitAdapter(this, fruits);
        listView.setAdapter(adapter);


        fruitsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit selectedFruit = fruitAdapter.getItem(position);
                Toast.makeText(MainActivity.this, "Se ha agregado " + selectedFruit.getName() + " al carrito", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Fruit> generateFruits() {
        List<Fruit> fruits = new ArrayList<>();

        //frutas
        fruits.add(new Fruit("Manzana", 10, R.drawable.manzana));
        fruits.add(new Fruit("Mango", 10, R.drawable.mango));
        fruits.add(new Fruit("Piña", 25, R.drawable.pina));
        fruits.add(new Fruit("Sandía", 20, R.drawable.sandia));
        fruits.add(new Fruit("Pitaya", 15, R.drawable.pitay));

        return fruits;
    }}

