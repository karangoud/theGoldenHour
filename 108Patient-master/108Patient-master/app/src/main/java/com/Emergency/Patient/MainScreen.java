package com.Emergency.Patient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    ImageView bgapp,emergency;
    LinearLayout menus;

    Animation bganim,clovernim,frombottom;
    public  void moveOn(View view){
        Intent intent = new Intent(getApplicationContext(),SimpleDirectionActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        bgapp=findViewById(R.id.imageView);
        emergency = findViewById(R.id.emergency);

        menus=(LinearLayout) findViewById(R.id.menus);

        bganim= AnimationUtils.loadAnimation(this,R.anim.bganim);
        clovernim= AnimationUtils.loadAnimation(this,R.anim.clovernim);
        frombottom=AnimationUtils.loadAnimation(this,R.anim.frombottom);



        bgapp.animate().translationY(-1500).setDuration(800).setStartDelay(300);
        emergency.setVisibility(View.VISIBLE);
        emergency.animate().translationX(1050).setDuration(800).setStartDelay(500);

        menus.startAnimation(frombottom);







    }
}


