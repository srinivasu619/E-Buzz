package com.example.rachit.projectmovie.Trailer;


import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rachit.projectmovie.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;


public class Maardari extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    public static final String API_KEY = "Enter Your Api Key";


    public static String VIDEO_ID = "";
    TextView tv;
   // private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /** attaching layout xml **/

        setContentView(R.layout.trailer);

        Bundle maindata = getIntent().getExtras();
        if (maindata == null) {
            return;

        }
        VIDEO_ID = maindata.getString("VIDEO_ID");
        tv = (TextView) findViewById(R.id.textView);

        if (VIDEO_ID.equals("j4s3JmLGLCA")) {
            tv.setText(R.string.Maardari);
        }
        if ((VIDEO_ID.equals("wPxqcq6Byq0")))
            tv.setText(R.string.sultan);
        if (VIDEO_ID.equals("QsCkty3mpg0"))
            tv.setText(R.string.Akira);
        if (VIDEO_ID.equals("DU6IdS2gVog"))
            tv.setText(R.string.Dishoom);
        if (VIDEO_ID.equals("v5r6FrEgg5M"))
            tv.setText(R.string.Legend);
        if (VIDEO_ID.equals("L83qMnbJ198"))
            tv.setText(R.string.rustom);
        if (VIDEO_ID.equals("jxPEwJNeA"))
            tv.setText(R.string.Sing);


        /** Initializing YouTube player view **/
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {

        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }
}
