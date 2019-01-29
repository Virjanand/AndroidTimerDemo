package com.virjanand.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {
            public void onTick(long milliSecondsUntilDone) {
                Log.i("Seconds left!", String.valueOf(milliSecondsUntilDone / 1000));
            }

            public void onFinish() {
                Log.i("We're done!", "No more countdown");
            }
        }.start();

//        final Handler handler = new Handler();
//
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                Log.i("Hey it's us", "A second passed by");
//
//                handler.postDelayed(this, 1000);
//            }
//        };
//
//        handler.post(run);


    }
}
