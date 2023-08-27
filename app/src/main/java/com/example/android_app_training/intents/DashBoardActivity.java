package com.example.android_app_training.intents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.android_app_training.BasicActivity;
import com.example.android_app_training.R;

public class DashBoardActivity extends BasicActivity {
    TextView displaytext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dashboard_activity);
        displaytext = findViewById(R.id.displayUserInput);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        displaytext.setText(data);
    }
}
