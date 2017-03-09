package com.example.rachit.projectmovie.Theatres;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rachit.projectmovie.R;


/**
 * Created by rachit on 12/7/16.
 */
public class Theatre extends   AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theatres);
    }
    public void north(View v){
        Intent i=new Intent(Theatre.this,North.class);
        startActivity(i);
    }
    public void south(View v){
        Intent i=new Intent(Theatre.this,South.class);
        startActivity(i);
    }
    public void east(View v){
        Intent i=new Intent(Theatre.this,East.class);
        startActivity(i);
    }
    public void west(View v){
        Intent i=new Intent(Theatre.this,West.class);
        startActivity(i);
    }
}
