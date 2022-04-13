package com.thannasorn.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(SecondActivity.this, " Welcome to Second Actity ", Toast.LENGTH_SHORT).show();
        backBtn = (Button) findViewById(R.id.backButton);
        backBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(SecondActivity.this, " Finish SecondActivity ", Toast.LENGTH_SHORT).show();
        finish();
    }
}