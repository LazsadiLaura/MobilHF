package com.example.mobilhf3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText productcode = findViewById(R.id.productcode);
       EditText productname = findViewById(R.id.productname);
       EditText productprice = findViewById(R.id.productprice);
        Button addproduct=findViewById(R.id.add);
        Button cancel = findViewById(R.id.cancel);
        Button show = findViewById(R.id.showproduct);
        TextView lista = findViewById(R.id.show);
        ArrayList<Product> productlist= new ArrayList<Product>();

        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Product products =  new Product(productcode,productname,productprice);
                productlist.add(products);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productcode.getText().clear();
                productname.getText().clear();
                productprice.getText().clear();
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder builder = new StringBuilder();
                for (Product product:productlist) {
                        builder.append(product);
                        builder.append(", ");
                    }

                    show.setText(builder.toString());


            }
        });






    }
}