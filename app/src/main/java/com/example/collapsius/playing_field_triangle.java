package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class playing_field_triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION //скрываем нижнюю панель
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); // нижняя панель появляется поверх игры и исчезает
        setContentView(R.layout.activity_playing_field_triangle);
    }
}