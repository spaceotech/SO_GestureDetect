package com.spaceo.gesturedetectdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    TextView tvSwipDescription;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         initializeView();


        tvSwipDescription.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastTop), Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastRight), Toast.LENGTH_SHORT).show();
            }
            public void onSwipeLeft() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastLeft), Toast.LENGTH_SHORT).show();
            }
            public void onSwipeBottom() {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastBottom), Toast.LENGTH_SHORT).show();
            }

        });

    }

    private void initializeView() {

        tvSwipDescription=(TextView) findViewById(R.id.tvSwipDescription);
    }


}