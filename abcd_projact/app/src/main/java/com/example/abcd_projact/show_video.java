package com.example.abcd_projact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class show_video extends AppCompatActivity {
  private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_video);
        videoView=findViewById(R.id.videoView);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abcd);
        videoView.setVideoURI(uri);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                              @Override
                                              public void onCompletion(MediaPlayer mp) {
                                                  // Perform the action you want when the video ends
                                                  doSomething();
                                              }
                                          });
        videoView.start();
    }
    private void doSomething() {
        Intent intent=new Intent(this, MainActivity1.class);
        startActivity(intent);
    }
}