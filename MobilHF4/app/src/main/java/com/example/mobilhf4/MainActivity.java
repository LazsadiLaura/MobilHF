package com.example.mobilhf4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"EUR", "USD", "GBR", "AUD", "CAD", "CHF", "DKK", "HUF" };

    String[] infoArray = {
            "Euro",
            "Dolar american",
            "Lira sterlina",
            "Dolar australian",
            "dolar canadian",
            "Franc elvetian",
            "Coroana daneza",
            "Forint maghiar"
    };

    Integer[] imageArray = {R.drawable.EU,
            R.drawable.US,
            R.drawable.GB,
            R.drawable.AU,
            R.drawable.CAD,
            R.drawable.chf,
            R.drawable.DK,
            R.drawable.HU
    };

   String[] buyArray = { "4.4100", "3.9750", "6.1250", "2.9600", "3.0950", "4.2300", "0.5850", "0.0136"};
   String[] sellArray = {"4.5500", "4.1450", "6.3550", "3.0600", "3.2650", "4.3300", "0.6150", "0.0146"};

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lista);
        CustomListViewAdapter egyszeruAdapter =new CustomListViewAdapter(this,nameArray, infoArray,imageArray,buyArray,sellArray);
        lista.setAdapter(egyszeruAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nev = nameArray[i];
                Toast.makeText(MainActivity.this,nev,Toast.LENGTH_SHORT).show();
            }
        });



    }
}