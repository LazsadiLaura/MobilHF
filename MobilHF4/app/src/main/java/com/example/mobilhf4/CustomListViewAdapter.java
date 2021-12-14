package com.example.mobilhf4;

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
    private final String[] nameArray;
    private final Integer[] imageIDarray;
    private final String[] infoArray;
    private final String[] buyArray;
    private final String[] sellArray;




    public CustomListViewAdapter(MainActivity context, String[] nameArray, String[] infoArray, Integer[] imageArray,String[] buyArray, String[] sellArray) {
        super(context,R.layout.listview_row2,nameArray);
        this.context= context;
        this.nameArray= nameArray;
        this.infoArray=infoArray;
        this.imageIDarray=imageArray;
        this.buyArray=buyArray;
        this.sellArray=sellArray;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row2, null,true);

        TextView nev = rowView.findViewById(R.id.name);
        TextView leiras=rowView.findViewById(R.id.info);
        ImageView kep= rowView.findViewById(R.id.image);
        TextView vetelar=rowView.findViewById(R.id.vetelar);
        TextView eladasiar=rowView.findViewById(R.id.eladasiar);


        nev.setText(nameArray[position]);
        leiras.setText(infoArray[position]);
        kep.setImageResource(imageIDarray[position]);
        vetelar.setText(buyArray[position]);
        eladasiar.setText(sellArray[position]);


        return rowView;
    }
}
