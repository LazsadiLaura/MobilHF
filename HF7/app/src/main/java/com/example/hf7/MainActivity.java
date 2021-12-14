package com.example.hf7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit",
            "Snake","Spider","Spider","Spider","Spider" };

    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary",
            "Scary",
            "Scary",
            "Scary"
    };

    Integer[] imageArray = {R.drawable.cat,
            R.drawable.disznyo,
            R.drawable.dog,
            R.drawable.giraffe,
            R.drawable.horse,
            R.drawable.lion,
            R.drawable.octopus3,
            R.drawable.rabbit,
            R.drawable.sheep
    };



    RecyclerView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lista);
        CustomListViewAdapter egyszeruAdapter =new CustomListViewAdapter(this,nameArray, infoArray,imageArray);
        lista.setAdapter(egyszeruAdapter);


    }



}