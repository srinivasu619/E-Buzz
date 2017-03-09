package com.example.rachit.projectmovie.movies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.rachit.projectmovie.R;
import com.squareup.picasso.Picasso;


public class ImageListAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] imageUrls;
    public ImageListAdapter(Context context, String[] imageUrls) {
        super(context, R.layout.list_item_poster, imageUrls);

        this.context = context;
        this.imageUrls = imageUrls;



        inflater = LayoutInflater.from(context);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.list_item_poster, parent, false);
        }

        Picasso
                .with(context)
                .load(imageUrls[position])
                .fit()
                .into((ImageView) convertView);


        return convertView;
    }
}

