package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonNewGame;

   // public int choosemode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION //скрываем нижнюю панель
        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); // нижняя панель появляется поверх игры и исчезает

        setContentView(R.layout.activity_main);

        buttonNewGame= findViewById(R.id.buttonNewGame);
        buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ggg","Right");
                Log.d("ggg","Mode- ");
               Intent intent = new Intent(MainActivity.this, SelectMode.class);
               startActivity(intent);
            }
        });


    }
}