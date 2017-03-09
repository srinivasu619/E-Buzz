package com.example.rachit.projectmovie.Trailer;


import android.app.Activity;
import android.app.ProgressDialog;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rachit.projectmovie.R;

public class MainActivity extends Activity {
    String VIDEO_ID;
    ProgressDialog ringProgressDialog;
    Handler updateBarHandler;
    ListView list;
    String[] web = {
            "Sultan",
            "Akira",
            "Dishoom",
            "The Legend of Tarzan",
            "Rustom",
            "Sing",
            "Madaari"
    } ;

    String[] gener={"Drama","Crime/Drama film","Crime film/Action","Action/Adventure","Real Drama","Music/Comedy","Crime /Drama film"};
    String[] years={"06-07-2016","02-09-2016","29-07-2016"," 01.07.2016","12.08.2016","21.12.2016","22.07.2016"};
    Integer[] imageId = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtubemain);
        if(getResources().getDisplayMetrics().widthPixels>getResources().getDisplayMetrics().heightPixels){
            Toast.makeText(getApplicationContext(),"LANDSCAPE",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"PORTRAIT",Toast.LENGTH_SHORT).show();
        }
        updateBarHandler = new Handler();

        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId,gener,years);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this,  web[+ position], Toast.LENGTH_SHORT).show();
                switch (web[+position]){
                    case "Sultan":
                        ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {

                                    Thread.sleep(4000);
                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent i=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="wPxqcq6Byq0";
                        i.putExtra("VIDEO_ID",VIDEO_ID);
                        startActivity(i);
                        break;
                    case "Akira":  ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {

                                    Thread.sleep(5000);
                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent j=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="QsCkty3mpg0";
                        j.putExtra("VIDEO_ID",VIDEO_ID);

                        startActivity(j);
                        break;
                    case "Dishoom":  ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {

                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent k=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="DU6IdS2gVog";
                        k.putExtra("VIDEO_ID",VIDEO_ID);

                        startActivity(k);
                        break;
                    case "The Legend of Tarzan":   ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent l=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="Aj7ty6sViiU";
                        l.putExtra("VIDEO_ID",VIDEO_ID);

                        startActivity(l);
                        break;
                    case "Rustom":  ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent m=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="L83qMnbJ198";
                        m.putExtra("VIDEO_ID",VIDEO_ID);

                        startActivity(m);
                        break;
                    case "Sing":  ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {

                                    Thread.sleep(5000);
                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent n=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="guztEQ7DkaE";
                        n.putExtra("VIDEO_ID",VIDEO_ID);

                        startActivity(n);
                        break;
                    case "Madaari":  ringProgressDialog = ProgressDialog.show(MainActivity.this, "Please wait ...",	"Loading ...", true);
                        ringProgressDialog.setCancelable(true);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                } catch (Exception e) {

                                }
                                ringProgressDialog.dismiss();
                            }
                        }).start();
                        Intent o=new Intent(MainActivity.this,Maardari.class);
                        VIDEO_ID="j4s3JmLGLCA";
                        o.putExtra("VIDEO_ID",VIDEO_ID);

                        startActivity(o);

                }

            }
        });

    }

}