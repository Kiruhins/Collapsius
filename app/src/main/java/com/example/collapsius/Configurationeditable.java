package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

public class Configurationeditable extends Activity {

    private ImageButton bt_Nexts;
    private ImageButton bt_backs;
    private ImageButton bbt_2players;
    private ImageButton bbt_3players;
    private ImageButton bbt_4players;
    private ImageButton bt_portal;
    private ImageButton bt_esc;
    private ImageButton bt_time;
    private ImageButton bt_wall;

    Integer player=2;

    boolean check1 = true;
    boolean check2 = true;
    boolean check3 = true;
    boolean check4 = true;

    Integer Gametime = 0;
    Integer Portal = 0;
    Integer Mountain = 0;
    Integer Infinity = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration_editable);

        bt_backs=findViewById(R.id.bt_backks);
        bbt_2players=findViewById(R.id.bt_player2_2);
        bbt_3players=findViewById(R.id.bt_player3_3);
        bbt_4players=findViewById(R.id.bt_player4_4);
        bt_portal=findViewById(R.id.bt_portal);
        bt_wall=findViewById(R.id.bt_wall);
        bt_esc=findViewById(R.id.bt_esc);
        bt_time=findViewById(R.id.bt_time);
        bt_Nexts=findViewById(R.id.bt_nextts);

        bbt_2players.setImageResource(R.drawable.tackpl);

        bbt_2players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = 2;
                // меняем изображение на кнопке
                bbt_2players.setImageResource(R.drawable.tackpl);
                bbt_3players.setImageResource(R.drawable.pusto);
                bbt_4players.setImageResource(R.drawable.pusto);
            }
        });

        bbt_3players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = 3;
                // меняем изображение на кнопке
                bbt_2players.setImageResource(R.drawable.pusto);
                bbt_3players.setImageResource(R.drawable.tackpl);
                bbt_4players.setImageResource(R.drawable.pusto);
            }
        });

        bbt_4players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = 4;
                bbt_3players.setImageResource(R.drawable.pusto);
                bbt_2players.setImageResource(R.drawable.pusto);
                bbt_4players.setImageResource(R.drawable.tackpl);
            }
        });

        bt_portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check1){
                    bt_portal.setImageResource(R.drawable.portaltk);
                    check1 = !check1;
                    Portal = 1;
                }
                else{
                    bt_portal.setImageResource(R.drawable.animportal1);
                    check1 = true;
                    Portal = 0;

                }

            }
        });

        bt_wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
                    Mountain = 1;
                }
                else{
                    bt_wall.setImageResource(R.drawable.animwall1);
                    check2 = true;
                    Mountain = 0;

                }
            }
        });

        bt_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check3){
                    bt_time.setImageResource(R.drawable.timetk);
                    check3 = !check3;
                    Gametime = 1;
                }
                else{
                    bt_time.setImageResource(R.drawable.time);
                    check3 = true;
                    Gametime = 0;
                }

            }
        });

        bt_esc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check4){
                    bt_esc.setImageResource(R.drawable.esctk);
                    check4 = !check4;
                    Infinity = 1;
                }
                else{
                    bt_esc.setImageResource(R.drawable.animescape1);
                    check4 = true;
                    Infinity = 0;
                }
            }
        });

        bt_Nexts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Configurationeditable.this, playing_field_editable.class);
                intent.putExtra("player", player);
                intent.putExtra("Gametime", Gametime);
                intent.putExtra("Portal", Portal);
                intent.putExtra("Mountain", Mountain);
                intent.putExtra("Infinity", Infinity);
                startActivity(intent);


            }
        });
        bt_backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Configurationeditable.this,SelectMode.class);
                startActivity(intent);
            }
        });
    }
}

