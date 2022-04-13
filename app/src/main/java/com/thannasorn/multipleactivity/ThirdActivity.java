package com.thannasorn.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{

    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(ThirdActivity.this, " Welcome to Third Actity ", Toast.LENGTH_SHORT).show();
        backBtn = (Button) findViewById(R.id.backButton);
        backBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(ThirdActivity.this, " Finish ThirdActivity ", Toast.LENGTH_SHORT).show();
        finish();
    }
}