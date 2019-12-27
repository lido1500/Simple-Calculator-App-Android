package com.example.tanveersalman.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

/**
 * Created by Tanveer Salman on 10/22/2016.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        CountDownTimer Timer = new CountDownTimer(7000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("there", "hello");
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        };
        Timer.start();

    }
}
