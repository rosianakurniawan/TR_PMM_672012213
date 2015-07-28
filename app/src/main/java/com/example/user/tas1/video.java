package com.example.user.tas1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends ActionBarActivity {
    Button back, share;
    final Context context=this;
    VideoView mVideoView;
    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        mVideoView = (VideoView) findViewById(R.id.videoView1);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent i=getIntent();
        path=i.getStringExtra("path");
        Log.i("path of video file......", path);
        String videoURL = path;
        mVideoView.setMediaController(new MediaController(context));
        mVideoView.requestFocus();
        Uri vidUri = Uri.parse(videoURL);
        mVideoView.setVideoURI(vidUri);
        mVideoView.start();
    }
}

