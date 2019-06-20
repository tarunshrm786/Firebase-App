package com.example.parknow;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity implements Runnable{


    public ActionBar actionBar;
    public Handler handler;
    public TextView textView;
    public ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView=findViewById(R.id.textView);
        imageView=findViewById(R.id.img);

        actionBar=getSupportActionBar();  //will return reference of ActionBar.
        //action bar hide code below.
        actionBar.hide();


        handler=new Handler();
        handler.postDelayed((Runnable) this,3000);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        textView.startAnimation(animation);

        Animation animations = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        imageView.startAnimation(animations);

    }

    @Override
    public void run() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        handler.removeCallbacks(this);   //It remove activity whe user cacel screen.
    }
}
