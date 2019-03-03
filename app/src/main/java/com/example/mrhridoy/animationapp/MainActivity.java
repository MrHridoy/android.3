package com.example.mrhridoy.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView flag1= (ImageView) findViewById(R.id.flag1);
        flag1.animate().translationX(10000f).setDuration(4000);
        ImageView flag2=(ImageView) findViewById(R.id.flag2);
        flag2.animate().scaleX(.2f).translationX(.2f).setDuration(4000);
        TextView txt1= (TextView) findViewById(R.id.txt_view1);
        txt1.animate().alpha(-1).setDuration(3500);
        TextView txt2= (TextView) findViewById(R.id.txt_view2);
        txt2.animate().alpha(-1).setDuration(3500);


    }
}
