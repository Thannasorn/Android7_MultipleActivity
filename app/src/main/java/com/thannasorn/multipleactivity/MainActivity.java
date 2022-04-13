package com.thannasorn.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button firstBtn, secondBtn, thridBtn, exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtn = (Button) findViewById(R.id.callFirst);
        secondBtn = (Button) findViewById(R.id.callSecond);
        thridBtn = (Button) findViewById(R.id.callThird);
        exitBtn = (Button) findViewById(R.id.callExit);
        firstBtn.setOnClickListener(this);
        secondBtn.setOnClickListener(this);
        thridBtn.setOnClickListener(this);
        exitBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.callFirst){
            startFirst();
        }
        else if (id == R.id.callSecond){
            startSecond();
        }
        else if (id == R.id.callThird){
            startThird();
        }
        else if (id == R.id.callExit){
            Toast.makeText(MainActivity.this, "EXit Main Activity", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void startFirst(){
        Intent launchFirst = new Intent(MainActivity.this, FirstActivity.class);
        startActivity(launchFirst);
    }

    public void startSecond(){
        Intent launchSecond = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(launchSecond);
    }

    public void startThird(){
        Intent launchFirst = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(launchFirst);
    }
}