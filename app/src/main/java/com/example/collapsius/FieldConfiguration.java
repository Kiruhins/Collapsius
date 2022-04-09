package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FieldConfiguration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_configuration);

        Intent intent=getIntent();
        Integer mode;
        mode=intent.getIntExtra("mode",0);
        Log.d("ggg", String.valueOf(mode));

    }
}