package com.wordpress.revelyusuf.tempconvapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int Run_TIME_OUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent=new Intent(MainActivity.this,AppActivity.class);
                Intent newIntent=new Intent(MainActivity.this,DevActivity.class);
                startActivity(homeIntent);
                startActivity(newIntent);

            }

        },Run_TIME_OUT);
    }
}
