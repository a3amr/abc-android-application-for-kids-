package com.example.abcd_projact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.abcd_projact.display.colorList;
import static com.example.abcd_projact.display.current_brush;
import static com.example.abcd_projact.display.pathList;

public class draw extends AppCompatActivity {
    public static Path path = new Path();
    public static Paint paint_brush = new Paint();
    int mm;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        imageView=findViewById(R.id.imageg);
        Intent intent=getIntent();
        mm= Integer.parseInt(intent.getStringExtra("B"));
        switch (mm){
            case 1:
                break;
            case 2:
                imageView.setImageResource(R.drawable.bf);break;
            case 3:
                imageView.setImageResource(R.drawable.cf);break;
            case 4:
                imageView.setImageResource(R.drawable.df);break;
            case 5:
                imageView.setImageResource(R.drawable.ef);break;
            case 6:
                imageView.setImageResource(R.drawable.ff);break;
            case 7:
                imageView.setImageResource(R.drawable.gf);break;
            case 8:
                imageView.setImageResource(R.drawable.hf);break;
            case 9:
                imageView.setImageResource(R.drawable.iii);break;
            case 10:
                imageView.setImageResource(R.drawable.jf);break;
            case 11:
                imageView.setImageResource(R.drawable.kf);break;
            case 12:
                imageView.setImageResource(R.drawable.lf);break;
            case 13:
                imageView.setImageResource(R.drawable.mf);break;
            case 14:
                imageView.setImageResource(R.drawable.nf);break;
            case 15:
                imageView.setImageResource(R.drawable.of);break;
            case 16:
                imageView.setImageResource(R.drawable.pf);break;
            case 17:
                imageView.setImageResource(R.drawable.qf);break;
            case 18:
                imageView.setImageResource(R.drawable.rf);break;
            case 19:
                imageView.setImageResource(R.drawable.sf);break;
            case 20:
                imageView.setImageResource(R.drawable.tf);break;
            case 21:
                imageView.setImageResource(R.drawable.uf);break;
            case 22:
                imageView.setImageResource(R.drawable.vf);break;
            case 23:
                imageView.setImageResource(R.drawable.wf);break;
            case 24:
                imageView.setImageResource(R.drawable.xf);break;
            case 25:
                imageView.setImageResource(R.drawable.yf);break;
            case 26:
                imageView.setImageResource(R.drawable.zf);break;

        }
    }
    public void eraser(View view){
        pathList.clear();
        colorList.clear();
        path.reset();
    }
    public void pencil(View view){
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }
    public void redColor(View view){
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }
    public void yellowColor(View view){
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }
    public void greenColor(View view){
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }

    public void blueColor(View view){
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }
    public void currentColor(int c){
        current_brush=c;
        path=new Path();
    }
}