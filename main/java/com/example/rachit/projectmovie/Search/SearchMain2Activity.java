package com.example.rachit.projectmovie.Search;

import android.app.DownloadManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.rachit.projectmovie.R;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class SearchMain2Activity extends AppCompatActivity {
    TextView title, tv1, tv2, tv3, tv4,tv5,tv6,plot, plotdesc;
    ImageView imageView;
    String url,s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_main2);
        title = (TextView) findViewById(R.id.topic);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        imageView=(ImageView)findViewById(R.id.poster);
        //tv7 = (TextView) findViewById(R.id.tv7);
        plot = (TextView) findViewById(R.id.plot);
        plotdesc = (TextView) findViewById(R.id.desc);
        Intent intent=getIntent();
        url=intent.getStringExtra("url");
        //tv.setText(e1);
        RequestQueue requestQueue;
        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                try {
                    String title1 = jsonObject.getString("Title");
                    String genre = jsonObject.getString("Genre");
                    String runtime = jsonObject.getString("Runtime");
                    String actors = jsonObject.getString("Actors");
                    String country = jsonObject.getString("Country");
                    String desc = jsonObject.getString("Plot");
                    String rld=jsonObject.getString("Released");
                    String dir=jsonObject.getString("Director");
                    String poster = jsonObject.getString("Poster");
                    title.setText(title1);
                    tv1.setText("GENRE :"+genre);
                    tv2.setText("DURATION :"+runtime);
                    tv3.setText("CAST :"+actors);
                    tv4.setText("COUNTRY :"+country);
                    tv5.setText("RELEASE DATE :"+rld);
                    tv6.setText("DIRECTOR :"+dir);
                    plot.setText("PLOT");
                    Picasso.with(SearchMain2Activity.this)
                            .load(poster)
                            .placeholder(R.drawable.placeholder)   // optional
                            .error(R.drawable.error)
                            .resize(500,740)// optional
                            .into(imageView);
                    plotdesc.setText(desc);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        Volley.newRequestQueue(this).add(jsonObjectRequest);
    }

}

