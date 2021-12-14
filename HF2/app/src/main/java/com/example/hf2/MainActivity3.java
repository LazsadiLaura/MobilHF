package com.example.hf2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button gomb3=findViewById(R.id.button3);
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void startActivity(View v){
        Intent intent=new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}