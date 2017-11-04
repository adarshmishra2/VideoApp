package com.example.abhishekpc.videoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get video view
        VideoView videoView=(VideoView) findViewById(R.id.videoView);
        //point to video resource
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sidebyside);

        //add media controller
        MediaController mediaController=new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);
        //run it
        videoView.start();
    }
}
