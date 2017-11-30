package com.fci.delite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hj on 11/27/2017.
 */

public class foodsAdapter extends ArrayAdapter {
    Context adapterContext;
    int adapterRes;
    foods [] adapterfood;


    public foodsAdapter(@NonNull Context context, int resource, @NonNull foods[] foodsData) {
        super(context, resource, foodsData);

        adapterContext=context;
        adapterRes=resource;
        adapterfood=foodsData;

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row;
        LayoutInflater rowInflater=LayoutInflater.from(adapterContext);
        row=rowInflater.inflate(adapterRes,parent,false);

        ImageView imagenamefood=(ImageView)row.findViewById(R.id.foodimage);
        TextView namejava=(TextView)row.findViewById(R.id.foodTypeView);
        ImageView imagenamenext=(ImageView)row.findViewById(R.id.foodNext);

        foods foo =adapterfood[position];

        int imageId=adapterContext.getResources().getIdentifier(foo.foodIconName,"drawable",adapterContext.getPackageName());

        imagenamefood.setImageResource(imageId);
                namejava.setText(foo.foodtypeName);
        imagenamenext.setImageResource(imageId);

        return row;

    }
}
