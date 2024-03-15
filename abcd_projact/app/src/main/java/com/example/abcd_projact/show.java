package com.example.abcd_projact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class show extends AppCompatActivity {
    ImageView imageView,imageView2;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        imageView=findViewById(R.id.imageView2);
        imageView2=findViewById(R.id.imageg);
        Intent intent=getIntent();
         num= Integer.parseInt(intent.getStringExtra("A"));
       switch (num){
           case 1:
               imageView.setImageResource(R.drawable.a);
               imageView2.setImageResource(R.drawable.apple);
               final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.a);
               mediaPlayer.start();
           break;
           case 2:
               imageView.setImageResource(R.drawable.b);
               imageView2.setImageResource(R.drawable.ba);
               final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.b);
               mediaPlayer1.start();
               break;
           case 3:
               imageView.setImageResource(R.drawable.c);
               imageView2.setImageResource(R.drawable.ch);
               final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.c);
               mediaPlayer2.start();
               break;
           case 4:
               imageView.setImageResource(R.drawable.d);
               imageView2.setImageResource(R.drawable.dr);
               final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.d);
               mediaPlayer3.start();
               break;
           case 5:
               imageView.setImageResource(R.drawable.e);
               imageView2.setImageResource(R.drawable.er);
               final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.e);
               mediaPlayer4.start();
               break;
           case 6:
               imageView.setImageResource(R.drawable.f);
               imageView2.setImageResource(R.drawable.fe);
               final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.f);
               mediaPlayer5.start();
               break;
           case 7:
               imageView.setImageResource(R.drawable.g);
               imageView2.setImageResource(R.drawable.gr);
               final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.g);
               mediaPlayer6.start();
               break;
           case 8:
               imageView.setImageResource(R.drawable.h);
               imageView2.setImageResource(R.drawable.hu);
               final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.h);
               mediaPlayer7.start();
               break;
           case 9:
               imageView.setImageResource(R.drawable.i);
               imageView2.setImageResource(R.drawable.it);
               final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.i);
               mediaPlayer8.start();
               break;
           case 10:
               imageView.setImageResource(R.drawable.j);
               imageView2.setImageResource(R.drawable.ja);
               final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.j);
               mediaPlayer9.start();
               break;
           case 11:
               imageView.setImageResource(R.drawable.k);
               imageView2.setImageResource(R.drawable.ki);
               final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.k);
               mediaPlayer10.start();
               break;
           case 12:
               imageView.setImageResource(R.drawable.l);
               imageView2.setImageResource(R.drawable.le);
               final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.l);
               mediaPlayer11.start();
               break;
           case 13:
               imageView.setImageResource(R.drawable.m);
               imageView2.setImageResource(R.drawable.ma);
               final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.m);
               mediaPlayer12.start();
               break;
           case 14:
               imageView.setImageResource(R.drawable.n);
               imageView2.setImageResource(R.drawable.ne);
               final MediaPlayer mediaPlayer13 = MediaPlayer.create(this, R.raw.n);
               mediaPlayer13.start();
               break;
           case 15:
               imageView.setImageResource(R.drawable.o);
               imageView2.setImageResource(R.drawable.or);
               final MediaPlayer mediaPlayer14 = MediaPlayer.create(this, R.raw.o);
               mediaPlayer14.start();
               break;
           case 16:
               imageView.setImageResource(R.drawable.p);
               imageView2.setImageResource(R.drawable.pa);
               final MediaPlayer mediaPlayer15 = MediaPlayer.create(this, R.raw.p);
               mediaPlayer15.start();
               break;
           case 17:
               imageView.setImageResource(R.drawable.q);
               imageView2.setImageResource(R.drawable.qu);
               final MediaPlayer mediaPlayer16 = MediaPlayer.create(this, R.raw.q);
               mediaPlayer16.start();
               break;
           case 18:
               imageView.setImageResource(R.drawable.r);
               imageView2.setImageResource(R.drawable.re);
               final MediaPlayer mediaPlayer17 = MediaPlayer.create(this, R.raw.r);
               mediaPlayer17.start();
               break;
           case 19:
               imageView.setImageResource(R.drawable.s);
               imageView2.setImageResource(R.drawable.st);
               final MediaPlayer mediaPlayer18 = MediaPlayer.create(this, R.raw.s);
               mediaPlayer18.start();
               break;
           case 20:
               imageView.setImageResource(R.drawable.t);
               imageView2.setImageResource(R.drawable.ta);
               final MediaPlayer mediaPlayer19 = MediaPlayer.create(this, R.raw.t);
               mediaPlayer19.start();
               break;
           case 21:
               imageView.setImageResource(R.drawable.u);
               imageView2.setImageResource(R.drawable.uq);
               final MediaPlayer mediaPlayer20 = MediaPlayer.create(this, R.raw.u);
               mediaPlayer20.start();

               break;
           case 22:
               imageView.setImageResource(R.drawable.v);
               imageView2.setImageResource(R.drawable.vo);
               final MediaPlayer mediaPlayer21 = MediaPlayer.create(this, R.raw.v);
               mediaPlayer21.start();
               break;
           case 23:
               imageView.setImageResource(R.drawable.w);
               imageView2.setImageResource(R.drawable.wa);
               final MediaPlayer mediaPlayer22 = MediaPlayer.create(this, R.raw.w);
               mediaPlayer22.start();
               break;
           case 24:
               imageView.setImageResource(R.drawable.x);
               imageView2.setImageResource(R.drawable.xc);
               final MediaPlayer mediaPlayer23 = MediaPlayer.create(this, R.raw.x);
               mediaPlayer23.start();
               break;
           case 25:
               imageView.setImageResource(R.drawable.y);
               imageView2.setImageResource(R.drawable.yam);
               final MediaPlayer mediaPlayer24 = MediaPlayer.create(this, R.raw.y);
               mediaPlayer24.start();
               break;
           case 26:
               imageView.setImageResource(R.drawable.z);
               imageView2.setImageResource(R.drawable.zx);
               final MediaPlayer mediaPlayer25 = MediaPlayer.create(this, R.raw.z);
               mediaPlayer25.start();
               break;

       }
    }
    public void drawing(View view) {
        Intent inte=new Intent(this,draw.class);
        inte.putExtra("B",""+num);
        startActivity(inte);
    }
}