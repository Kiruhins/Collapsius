package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class SelectMode extends AppCompatActivity {

    private ImageButton bt_classic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);
        Log.d("ggg","M ");
        bt_classic=findViewById(R.id.bt_classic);
        Log.d("ggg","N ");

        bt_classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                startActivity(intent);
            }
        });



    }
}