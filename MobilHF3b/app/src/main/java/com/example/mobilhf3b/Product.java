package com.example.mobilhf3b;

import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Product {

    private EditText code;
    private EditText name;
    private EditText price;

    public Product(EditText pcode, EditText pname, EditText pprice){
        code=pcode;
        name=pname;
        price=pprice;
    }

}
