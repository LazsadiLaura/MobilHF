package com.example.hf7;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListViewAdapter extends ArrayAdapter {


    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] nameArray;
    
    private final String[] infoArray;



    public CustomListViewAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam){

        super(context, R.layout.listview_row2, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row2, null,true);

        TextView nev = rowView.findViewById(R.id.nev2);
        TextView leiras=rowView.findViewById(R.id.leiras2);
        ImageView kep= rowView.findViewById(R.id.imageView2);


        nev.setText(nameArray[position]);
        leiras.setText(infoArray[position]);
        kep.setImageResource(imageIDarray[position]);

        return rowView;
    }
}
