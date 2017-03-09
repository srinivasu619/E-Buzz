package com.example.rachit.projectmovie.Trailer;

/**
 * Created by rachit on 12/7/16.
 */
import android.view.View;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rachit.projectmovie.R;

public class CustomList extends ArrayAdapter<String>{





    private final Activity context;
    private final String[] web;
    private  final String[] gener;

    private  final String[] years;


    private final Integer[] imageId;

    public CustomList(Activity context,
                      String[] web, Integer[] imageId,String[] gener,String[] years) {
        super(context, R.layout.list_single, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.gener=gener;

        this.years=years;


    }
    @Override

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View viewer= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) viewer.findViewById(R.id.txt);
        TextView rate=(TextView)viewer.findViewById(R.id.rating);
        TextView gene=(TextView)viewer.findViewById(R.id.genre);
        TextView year=(TextView)viewer.findViewById(R.id.releaseYear);

        ImageView imageView = (ImageView) viewer.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        year.setText(years[position]);
        gene.setText(gener[position]);


        imageView.setImageResource(imageId[position]);
        return viewer;
    }
}
