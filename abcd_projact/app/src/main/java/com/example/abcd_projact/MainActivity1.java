package com.example.abcd_projact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity1 extends AppCompatActivity {
    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

    }

    public void A(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","1");
        startActivity(intent);

    }

    public void B(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","2");
        startActivity(intent);


    }

    public void C(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","3");
        startActivity(intent);

    }


    public void d(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","4");
        startActivity(intent);
    }

    public void E(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","5");
        startActivity(intent);
    }

    public void F(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","6");
        startActivity(intent);
    }

    public void G(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","7");
        startActivity(intent);
    }

    public void H(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","8");
        startActivity(intent);
    }

    public void I(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","9");
        startActivity(intent);
    }

    public void J(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","10");
        startActivity(intent);
    }

    public void K(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","11");
        startActivity(intent);
    }

    public void L(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","12");
        startActivity(intent);
    }

    public void M(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","13");
        startActivity(intent);
    }

    public void N(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","14");
        startActivity(intent);
    }

    public void O(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","15");
        startActivity(intent);
    }

    public void P(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","16");
        startActivity(intent);
    }

    public void Q(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","17");
        startActivity(intent);
    }

    public void R(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","18");
        startActivity(intent);
    }

    public void S(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","19");
        startActivity(intent);
    }

    public void T(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","20");
        startActivity(intent);
    }

    public void U(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","21");
        startActivity(intent);
    }

    public void V(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","22");
        startActivity(intent);
    }

    public void W(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","23");
        startActivity(intent);
    }

    public void X(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","24");
        startActivity(intent);
    }

    public void Y(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","25");
        startActivity(intent);
    }

    public void Z(View view) {
        Intent intent=new Intent(this,show.class);
        intent.putExtra("A","26");
        startActivity(intent);
    }
    public void showvideo(View view) {
        Intent intent=new Intent(this,show_video.class);
        startActivity(intent);

    }
}