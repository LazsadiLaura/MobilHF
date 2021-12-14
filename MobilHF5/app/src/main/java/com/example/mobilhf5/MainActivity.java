package com.example.mobilhf5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    ArrayAdapter<String> adapter;
    ArrayList<String> listaelemek = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaelemek.add("rozsa");
        listaelemek.add("gerbera");
        listaelemek.add("tulipan");
        listaelemek.add("kardvirag");
        listaelemek.add("boglarka");
        listaelemek.add("narcisz");
        listaelemek.add("szegfu");
        listaelemek.add("liliom");
        listaelemek.add("margareta");

        lista= findViewById(R.id.lista);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaelemek);
        registerForContextMenu(lista);
        lista.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.elrendez:
                listaelemek.sort(String.CASE_INSENSITIVE_ORDER);
                Toast.makeText(MainActivity.this, "Rendezes", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.torol:
                listaelemek.clear();
                Toast.makeText(MainActivity.this, "Torles" , Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View v = info.targetView;
        TextView szoveg= (TextView) v.findViewById(android.R.id.text1);
        switch (item.getItemId()) {
            case R.id.piros:
                szoveg.setTextColor(Color.RED);
                Toast.makeText(MainActivity.this, "Sikeres szinvaltas pirosra!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.zold:
                szoveg.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "Sikeres szinvaltas zoldre!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sarga:
                szoveg.setTextColor(Color.YELLOW);
                Toast.makeText(MainActivity.this, "Sikeres szinvaltas sargara!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);

        }


    }
}