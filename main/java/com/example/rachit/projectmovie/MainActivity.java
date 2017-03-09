package com.example.rachit.projectmovie;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


import com.example.rachit.projectmovie.Search.SearchMainActivity;
import com.example.rachit.projectmovie.Theatres.Theatre;
import com.example.rachit.projectmovie.movies.Contextmain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#5e9c00")));
        ImageButton IB1=(ImageButton)findViewById(R.id.ib1);
        ImageButton IB2=(ImageButton)findViewById(R.id.ib2);
        ImageButton IB3=(ImageButton)findViewById(R.id.ib3);
        ImageButton IB4=(ImageButton)findViewById(R.id.ib4);
    }
    public void Clickib1(View view)
    {
       // Toast.makeText(getApplicationContext(),"FIRST",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this, Contextmain.class);
        startActivity(i);
    }
    public void Clickib2(View view)
    {
       // Toast.makeText(getApplicationContext(),"SECOND",Toast.LENGTH_SHORT).show();
       Intent i=new Intent(this,Theatre.class);
        startActivity(i);
    }
    public void Clickib3(View view)
    {
        //Toast.makeText(getApplicationContext(),"THIRD",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this,SearchMainActivity.class);
        startActivity(i);
    }
    public void Clickib4(View view)
    {
      //  Toast.makeText(getApplicationContext(),"FOURTH",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(this, com.example.rachit.projectmovie.Trailer.MainActivity.class);
        startActivity(i);

    }
}


