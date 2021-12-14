package com.example.hf2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button gomb2=findViewById(R.id.button2);
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

    }

    public void startActivity(View v){
        Intent intent=new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }
}