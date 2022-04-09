package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class SelectMode extends AppCompatActivity {

    private ImageButton bt_classic;
    private ImageButton bt_peklo;
    private ImageButton bt_editable;
    private ImageButton bt_5in1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);

        bt_classic=findViewById(R.id.bt_classic);
        bt_peklo=findViewById(R.id.bt_peklo);
        bt_editable=findViewById(R.id.bt_editable);
        bt_5in1=findViewById(R.id.bt_5in1);

        bt_classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                startActivity(intent);
            }
        });

        bt_peklo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                startActivity(intent);
            }
        });

        bt_editable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                startActivity(intent);
            }
        });

        bt_5in1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                startActivity(intent);
            }
        });


    }
}