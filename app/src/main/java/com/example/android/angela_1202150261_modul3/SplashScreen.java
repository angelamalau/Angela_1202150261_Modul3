package com.example.android.angela_1202150261_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private static int splashInterval = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //menghubungkan SplashScreen ke LoginActivity menggunakan intent
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);

                //jeda selesai SplashScreen
                this.finish();
            }

            private void finish(){

            }
        }, splashInterval);
    }
}
