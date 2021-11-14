package com.example.intent_filters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_Time, btn_Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Time = findViewById(R.id.btnTime);
        btn_Date = findViewById(R.id.btnDate);

        btn_Time.setOnClickListener(this);
        btn_Date.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent;

        switch (v.getId()){
            case R.id.btnTime:
                intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}