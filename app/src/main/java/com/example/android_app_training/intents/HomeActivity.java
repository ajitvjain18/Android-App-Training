package com.example.android_app_training.intents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.android_app_training.BasicActivity;
import com.example.android_app_training.R;

public class HomeActivity extends BasicActivity {

    Button submitButton;
    EditText userInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home_activity);

        userInput = findViewById(R.id.etUserInput);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(view -> {
            String data = userInput.getText().toString();
            Intent intent = new Intent(getApplicationContext(), DashBoardActivity.class);
            intent.putExtra("data", data);
            startActivity(intent);
        });
    }

}
