package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FieldConfiguration extends AppCompatActivity {

    private Button bt_Next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field_configuration);

        Intent intent=getIntent();
        Integer mode=intent.getIntExtra("mode",0);
        //Integer player=intent.getIntExtra("player",0);
        //Log.d("ggg", String.valueOf(mode));

        bt_Next=findViewById(R.id.bt_Next);

        bt_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FieldConfiguration.this,PlayingField.class);
              //  intent.putExtra("mode",2);
                startActivity(intent);
            }
        });

    }
}