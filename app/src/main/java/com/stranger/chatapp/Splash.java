package com.stranger.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this, StartActivity.class);

                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}
