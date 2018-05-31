package com.example.dalsa.battaglianavale;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static final int DELAY_TIME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // nascondo la Support Action Bar se c'è
        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


    }


}


