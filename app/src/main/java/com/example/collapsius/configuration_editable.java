package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class configuration_editable extends AppCompatActivity {

    private ImageButton bt_Nexts;
    private ImageButton bt_backs;
    private ImageButton bt_2players;
    private ImageButton bt_3players;
    private ImageButton bt_4players;
    private ImageButton bt_portal;
    private ImageButton bt_esc;
    private ImageButton bt_time;
    private ImageButton bt_wall;

    Integer player=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration_editable);

        bt_backs=findViewById(R.id.bt_backs);
        bt_2players=findViewById(R.id.bt_2players);
        bt_3players=findViewById(R.id.bt_3players);
        bt_4players=findViewById(R.id.bt_4players);
        bt_portal=findViewById(R.id.bt_map1);
        bt_wall=findViewById(R.id.bt_map2);
        bt_esc=findViewById(R.id.bt_map3);
        bt_time=findViewById(R.id.bt_time);
        bt_Nexts=findViewById(R.id.bt_Nexts);

        bt_2players.setImageResource(R.drawable.tackpl);

        Intent intent=getIntent();

        Integer mode=intent.getIntExtra("mode",0);

        Integer Gametime=intent.getIntExtra("Gametime",0);
        Integer Roundtime=intent.getIntExtra("Roundtime",0);
        Integer Mountain=intent.getIntExtra("Mountain",0);
        Integer Infinity=intent.getIntExtra("Infinity",0);

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

        bt_portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean check1;
                check1 = true;
                if (check1){
                    bt_portal.setImageResource(R.drawable.portaltk);
                    check1 = !check1;
                }
                else{
                    bt_portal.setImageResource(R.drawable.animportal1);
                }

            }
        });

        bt_wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean check2;
                check2 = true;
                if (check2){
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            bt_wall.setImageResource(R.drawable.animwall2);
                        }
                    },0);

                    handler.postDelayed(new Runnable() {
                        public void run() {
                            bt_wall.setImageResource(R.drawable.animwall3);

                        }
                    },400);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            bt_wall.setImageResource(R.drawable.walltk);

                        }
                    },800);
                    check2 = !check2;
                }
                else{
                    bt_wall.setImageResource(R.drawable.animwall1);
                }
            }
        });

        bt_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean check3;
                check3 = true;
                if (check3){
                    bt_time.setImageResource(R.drawable.timetk);
                    check3 = !check3;
                }
                else{
                    bt_time.setImageResource(R.drawable.time);
                }

            }
        });

        bt_esc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean check4;
                check4 = true;
                if (check4){
                    bt_esc.setImageResource(R.drawable.esctk);
                    check4 = !check4;
                }
                else{
                    bt_esc.setImageResource(R.drawable.animescape1);
                }
            }
        });

        bt_Nexts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mode == 1) {
                    Intent intent = new Intent(configuration_editable.this, PlayingField.class);
                    //intent.putExtra("map", map);
                    intent.putExtra("player", player);
                    intent.putExtra("mode", mode);
                    startActivity(intent);
                }
                if (mode == 2) {
                    Intent intent = new Intent(configuration_editable.this, playing_field_peklo.class);

                    //intent.putExtra("map", map);
                    intent.putExtra("player", player);
                    intent.putExtra("mode", mode);
                    startActivity(intent);
                }
                if (mode == 3) {
                    Intent intent = new Intent(configuration_editable.this, playing_field_5in1.class);

                    //intent.putExtra("map", map);
                    intent.putExtra("player", player);
                    intent.putExtra("mode", mode);
                    startActivity(intent);
                }
                if (mode == 4) {
                    Intent intent = new Intent(configuration_editable.this, playing_field_editable.class);

                    //intent.putExtra("map", map);
                    intent.putExtra("player", player);
                    intent.putExtra("mode", mode);

                    intent.putExtra("Gametime", Gametime);
                    intent.putExtra("Roundtime", Roundtime);
                    intent.putExtra("Mountain", Mountain);
                    intent.putExtra("Infinity", Infinity);
                    startActivity(intent);
                }

            }
        });
        bt_backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(configuration_editable.this,SelectMode.class);
                startActivity(intent);
            }
        });
    }
}