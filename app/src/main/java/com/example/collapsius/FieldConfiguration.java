package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class FieldConfiguration extends AppCompatActivity {

    private ImageButton bt_Next;
    private ImageButton bt_back2;
    private ImageButton bt_2players;
    private ImageButton bt_3players;
    private ImageButton bt_4players;
    private ImageButton bt_map1;
    private ImageButton bt_map2;
    private ImageButton bt_map3;
    private ImageButton bt_map4;
    private ImageButton bt_map5;
    private ImageButton bt_map6;

    Integer player=2;
    Integer map=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.activity_field_configuration);

        bt_back2=findViewById(R.id.bt_back2);
        bt_2players=findViewById(R.id.bt_2players);
        bt_3players=findViewById(R.id.bt_3players);
        bt_4players=findViewById(R.id.bt_4players);
        bt_map1=findViewById(R.id.bt_map1);
        bt_map2=findViewById(R.id.bt_map2);
        bt_map3=findViewById(R.id.bt_map3);
        bt_map4=findViewById(R.id.bt_map4);
        bt_map5=findViewById(R.id.bt_map5);
        bt_map6=findViewById(R.id.bt_map6);
        bt_Next=findViewById(R.id.bt_Next);

        Intent intent=getIntent();
        Integer mode=intent.getIntExtra("mode",0);

        bt_2players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = 2;
                // меняем изображение на кнопке
                bt_2players.setImageResource(R.drawable.tackpl);
                bt_3players.setImageResource(R.drawable.pusto);
                bt_4players.setImageResource(R.drawable.pusto);
            }
        });

        bt_3players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = 3;
                // меняем изображение на кнопке
                    bt_2players.setImageResource(R.drawable.pusto);
                    bt_3players.setImageResource(R.drawable.tackpl);
                    bt_4players.setImageResource(R.drawable.pusto);
            }
        });

        bt_4players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = 4;
                bt_3players.setImageResource(R.drawable.pusto);
                bt_2players.setImageResource(R.drawable.pusto);
                bt_4players.setImageResource(R.drawable.tackpl);
            }
        });

        bt_map1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map = 1;
                bt_map1.setImageResource(R.drawable.choicemap1);
                bt_map2.setImageResource(R.drawable.map2);
                bt_map3.setImageResource(R.drawable.map3);
                bt_map4.setImageResource(R.drawable.map4);
                bt_map5.setImageResource(R.drawable.map5);
                bt_map6.setImageResource(R.drawable.map6);
            }
        });

        bt_map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map = 2;
                bt_map1.setImageResource(R.drawable.map1);
                bt_map2.setImageResource(R.drawable.choicemap2);
                bt_map3.setImageResource(R.drawable.map3);
                bt_map4.setImageResource(R.drawable.map4);
                bt_map5.setImageResource(R.drawable.map5);
                bt_map6.setImageResource(R.drawable.map6);
            }
        });

        bt_map3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map = 3;
                bt_map1.setImageResource(R.drawable.map1);
                bt_map2.setImageResource(R.drawable.map2);
                bt_map3.setImageResource(R.drawable.choicemap3);
                bt_map4.setImageResource(R.drawable.map4);
                bt_map5.setImageResource(R.drawable.map5);
                bt_map6.setImageResource(R.drawable.map6);
            }
        });

        bt_map4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map = 4;
                bt_map1.setImageResource(R.drawable.map1);
                bt_map2.setImageResource(R.drawable.map2);
                bt_map3.setImageResource(R.drawable.map3);
                bt_map4.setImageResource(R.drawable.choicemap4);
                bt_map5.setImageResource(R.drawable.map5);
                bt_map6.setImageResource(R.drawable.map6);
            }
        });

        bt_map5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map = 5;
                bt_map1.setImageResource(R.drawable.map1);
                bt_map2.setImageResource(R.drawable.map2);
                bt_map3.setImageResource(R.drawable.map3);
                bt_map4.setImageResource(R.drawable.map4);
                bt_map5.setImageResource(R.drawable.choicemap5);
                bt_map6.setImageResource(R.drawable.map6);
            }
        });

        bt_map6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                map = 6;
                bt_map1.setImageResource(R.drawable.map1);
                bt_map2.setImageResource(R.drawable.map2);
                bt_map3.setImageResource(R.drawable.map3);
                bt_map4.setImageResource(R.drawable.map4);
                bt_map5.setImageResource(R.drawable.map5);
                bt_map6.setImageResource(R.drawable.choicemap6);
            }
        });



        bt_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FieldConfiguration.this,PlayingField.class);
                intent.putExtra("map",map);
                intent.putExtra("player",player);
                intent.putExtra("mode",mode);
                startActivity(intent);
            }
        });
        bt_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FieldConfiguration.this,SelectMode.class);
                startActivity(intent);
            }
        });

    }
}