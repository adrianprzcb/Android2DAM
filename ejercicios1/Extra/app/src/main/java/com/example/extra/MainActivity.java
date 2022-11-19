package com.example.extra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button barajar;
    AppCompatButton bt1, bt2 , bt3, bt4, bt5, bt6, bt7, bt8, bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        barajar = findViewById(R.id.barajar);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt = findViewById(R.id.bt);

        barajar.setOnClickListener(view -> {

         for (int i = 0; i < 49; i++) {
               barajar();
            }
        });
    }


    public void barajar(){
        Random random = new Random();
        int[] array = new int[9];
        int num = random.nextInt(9) + 1;
        array[0] = num;
        bt1.setText(String.valueOf(num));
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0]) {
                bt2.setText(String.valueOf(num));
                array[1] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0] && num != array[1]) {
                bt3.setText(String.valueOf(num));
                array[2] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0] && num != array[1] && num != array[2]) {
                bt4.setText(String.valueOf(num));
                array[3] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0] && num != array[1] && num != array[2] && num != array[3]) {
                bt5.setText(String.valueOf(num));
                array[4] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0] && num != array[1] && num != array[2] && num != array[3] && num != array[4]) {
                bt6.setText(String.valueOf(num));
                array[5] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0] && num != array[1] && num != array[2] && num != array[3] && num != array[4] && num != array[5]) {
                bt7.setText(String.valueOf(num));
                array[6] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while(true) {
            if (num != array[0] && num != array[1] && num != array[2] && num != array[3] && num != array[4] && num != array[5] && num != array[6]) {
                bt8.setText(String.valueOf(num));
                array[7] = num;
                break;
            }else{
                num = random.nextInt(9) + 1;
            }
        }
        num = random.nextInt(9) + 1;
        while (true) {
            if (num != array[0] && num != array[1] && num != array[2] && num != array[3] && num != array[4] && num != array[5] && num != array[6] && num != array[7]) {
                bt.setText(String.valueOf(num));
                array[8] = num;
                break;
            } else {
                num = random.nextInt(9) + 1;
            }
        }
    }



}