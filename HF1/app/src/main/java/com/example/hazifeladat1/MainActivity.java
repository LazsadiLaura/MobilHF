package com.example.hazifeladat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button osszead=findViewById(R.id.osszead);
        Button kivon=findViewById(R.id.kivon);
        Button szorzas=findViewById(R.id.szorzas);
        Button osztas=findViewById(R.id.osztas);
        EditText szam1=findViewById(R.id.szam1);
        EditText szam2=findViewById(R.id.szam2);
        TextView eredmeny=findViewById(R.id.eredmeny);

        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double megoldas = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(megoldas));
            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double megoldas=Double.parseDouble(szam1.getText().toString())-Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(megoldas));
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double megoldas=Double.parseDouble(szam1.getText().toString())*Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(megoldas));
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Double.parseDouble(szam2.getText().toString())==0)
                {
                    eredmeny.setText("Hiba");
                }else{
                    double megoldas = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());
                    eredmeny.setText(Double.toString(megoldas));
                }

            }
        });

    }
}