package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
//import android.media.MediaPlayer;
//import {checked} from './Settings.java';

public class MainActivity<mPlayer> extends AppCompatActivity {

    private ImageButton buttonNewGame;
    private ImageButton Settings;
    //private MediaPlayer Click;

   // public int choosemode;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION //скрываем нижнюю панель
        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); // нижняя панель появляется поверх игры и исчезает

        setContentView(R.layout.activity_main);
        //Click = MediaPlayer.create(this, R.raw.click);

        buttonNewGame= findViewById(R.id.NewGame);
        //buttonNewGame = (ImageButton)findViewById(R.raw.click);
        buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ggg","Right");
                Log.d("ggg","Mode- ");
               Intent intent = new Intent(MainActivity.this, SelectMode.class);
               startActivity(intent);
                //if (checked) {
                    //soundPlay(Click);
                //}
            }
        });

        Settings = findViewById(R.id.Settings);
        //Settings = (ImageButton)findViewById(R.raw.click);
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                //if (checked) {
                    //soundPlay(Click);
                //}
            }
        });


    }
    //public void soundPlay (MediaPlayer sound){
        //sound.start();
    //}

}