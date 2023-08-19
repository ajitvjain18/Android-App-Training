package com.example.android_app_training;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;

public class BasicActivity extends AppCompatActivity  {

    private static final String TAG = "BasicActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        super.onStart();
    }

    @Override
    protected void onResume() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }
}
