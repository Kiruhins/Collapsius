package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Settings extends AppCompatActivity {
    private ImageButton BacktoMenu;
    Boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        checked = true;

        setContentView(R.layout.activity_settings);

        BacktoMenu = findViewById(R.id.BacktoMenu);
        BacktoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Settings.this,MainActivity.class);
                intent.putExtra("check",checked);
                startActivity(intent);
            }
        });

    }

}

