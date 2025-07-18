package com.example.collapsius;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class playing_field_5in1 extends AppCompatActivity implements View.OnTouchListener {


    int[][] cellsmas = new int[7][7];
    int[][] player = new int[7][7];

    private ImageButton bt_back5;

    Cells cell;

    boolean lost1 = false;
    boolean lost2 = false;
    boolean lost3 = false;
    boolean lost4 = false;

    Integer shot = 0;
    Integer shotp = -1;
    Boolean trigger = false;
    Integer clickbuttonn = 0;
    Boolean speed = false;
    Integer num = 0;
    Integer nump = 0;
    Integer playerp = 0;
    Integer clickbutton = 0;
    Integer startid;
    Integer razm = 7;
    Boolean paintcells = false;
    Integer players=2;

    int[][] mas = new int[7][7];
    int[][] vision = new int[7][7];


    boolean FromBackToProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION //скрываем нижнюю панель
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); // нижняя панель появляется поверх игры и исчезает
        setContentView(R.layout.activity_playing_field);

        Intent intent = getIntent();
        Integer mode = intent.getIntExtra("mode", 0);
        players = intent.getIntExtra("player", 0);
        Integer map = intent.getIntExtra("map", 0);

        bt_back5 = findViewById(R.id.bt_back5);

        cell = new Cells(cellsmas, player);

        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                cell.cellsmas[i][j] = 0;
                cell.player[i][j] = 0;

            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                vision[i][j] = 1;
            }
        }

        if (map == 2) {
            vision[0][3] = 0;
            vision[0][4] = 0;
            vision[0][2] = 0;
            vision[6][2] = 0;
            vision[6][3] = 0;
            vision[6][4] = 0;
            vision[2][0] = 0;
            vision[3][0] = 0;
            vision[4][0] = 0;
            vision[2][6] = 0;
            vision[3][6] = 0;
            vision[4][6] = 0;
            vision[1][3] = 0;
            vision[5][3] = 0;
            vision[3][1] = 0;
            vision[3][5] = 0;
        }

        if (map == 3) {
            vision[0][3] = 0;
            vision[1][3] = 0;
            vision[5][3] = 0;
            vision[6][3] = 0;
            vision[3][3] = 0;
            vision[3][0] = 0;
            vision[3][1] = 0;
            vision[3][5] = 0;
            vision[3][6] = 0;
        }

        if (map == 4) {
            vision[0][3] = 0;
            vision[2][3] = 0;
            vision[3][3] = 0;
            vision[4][3] = 0;
            vision[6][3] = 0;
            vision[3][0] = 0;
            vision[3][2] = 0;
            vision[3][4] = 0;
            vision[3][6] = 0;
        }

        if (map == 5) {
            vision[0][0] = 0;
            vision[0][2] = 0;
            vision[0][3] = 0;
            vision[0][4] = 0;
            vision[0][5] = 0;
            vision[0][6] = 0;
            vision[1][5] = 0;
            vision[1][6] = 0;
            vision[2][6] = 0;
            vision[3][6] = 0;
            vision[4][6] = 0;
            vision[6][6] = 0;
            vision[2][0] = 0;
            vision[3][0] = 0;
            vision[4][0] = 0;
            vision[5][0] = 0;
            vision[6][0] = 0;
            vision[5][1] = 0;
            vision[6][1] = 0;
            vision[6][2] = 0;
            vision[6][3] = 0;
            vision[6][4] = 0;
            vision[6][6] = 0;
        }

        if (map == 6) {
            vision[0][0] = 0;
            vision[6][6] = 0;
            vision[5][0] = 0;
            vision[6][0] = 0;
            vision[4][1] = 0;
            vision[5][1] = 0;
            vision[6][1] = 0;
            vision[4][2] = 0;
            vision[5][2] = 0;
            vision[0][5] = 0;
            vision[0][6] = 0;
            vision[1][4] = 0;
            vision[1][5] = 0;
            vision[1][6] = 0;
            vision[2][4] = 0;
            vision[2][5] = 0;
        }



        MyAsyncTask thread = new MyAsyncTask();
        thread.execute();

        ImageButton b1;
        ImageButton b2;
        ImageButton b3;
        ImageButton b4;
        ImageButton b5;
        ImageButton b6;
        ImageButton b7;
        ImageButton b8;
        ImageButton b9;
        ImageButton b10;
        ImageButton b11;
        ImageButton b12;
        ImageButton b13;
        ImageButton b14;
        ImageButton b15;
        ImageButton b16;
        ImageButton b17;
        ImageButton b18;
        ImageButton b19;
        ImageButton b20;
        ImageButton b21;
        ImageButton b22;
        ImageButton b23;
        ImageButton b24;
        ImageButton b25;
        ImageButton b26;
        ImageButton b27;
        ImageButton b28;
        ImageButton b29;
        ImageButton b30;
        ImageButton b31;
        ImageButton b32;
        ImageButton b33;
        ImageButton b34;
        ImageButton b35;
        ImageButton b36;
        ImageButton b37;
        ImageButton b38;
        ImageButton b39;
        ImageButton b40;
        ImageButton b41;
        ImageButton b42;
        ImageButton b43;
        ImageButton b44;
        ImageButton b45;
        ImageButton b46;
        ImageButton b47;
        ImageButton b48;
        ImageButton b49;

        b1 = findViewById(R.id.b1);
        mas[0][0] = b1.getId();
        b1.setOnTouchListener(this);

        b2 = findViewById(R.id.b2);
        mas[0][1] = b2.getId();
        b2.setOnTouchListener(this);

        b3 = findViewById(R.id.b3);
        mas[0][2] = b3.getId();
        b3.setOnTouchListener(this);

        b4 = findViewById(R.id.b4);
        mas[0][3] = b4.getId();
        b4.setOnTouchListener(this);

        b5 = findViewById(R.id.b5);
        mas[0][4] = b5.getId();
        b5.setOnTouchListener(this);

        b6 = findViewById(R.id.b6);
        mas[0][5] = b6.getId();
        b6.setOnTouchListener(this);

        b7 = findViewById(R.id.b7);
        mas[0][6] = b7.getId();
        b7.setOnTouchListener(this);

        b8 = findViewById(R.id.b8);
        mas[1][0] = b8.getId();
        b8.setOnTouchListener(this);

        b9 = findViewById(R.id.b9);
        mas[1][1] = b9.getId();
        b9.setOnTouchListener(this);

        b10 = findViewById(R.id.b10);
        mas[1][2] = b10.getId();
        b10.setOnTouchListener(this);

        b11 = findViewById(R.id.b11);
        mas[1][3] = b11.getId();
        b11.setOnTouchListener(this);

        b12 = findViewById(R.id.b12);
        mas[1][4] = b12.getId();
        b12.setOnTouchListener(this);

        b13 = findViewById(R.id.b13);
        mas[1][5] = b13.getId();
        b13.setOnTouchListener(this);

        b14 = findViewById(R.id.b14);
        mas[1][6] = b14.getId();
        b14.setOnTouchListener(this);

        b15 = findViewById(R.id.b15);
        mas[2][0] = b15.getId();
        b15.setOnTouchListener(this);

        b16 = findViewById(R.id.b16);
        mas[2][1] = b16.getId();
        b16.setOnTouchListener(this);

        b17 = findViewById(R.id.b17);
        mas[2][2] = b17.getId();
        b17.setOnTouchListener(this);

        b18 = findViewById(R.id.b18);
        mas[2][3] = b18.getId();
        b18.setOnTouchListener(this);

        b19 = findViewById(R.id.b19);
        mas[2][4] = b19.getId();
        b19.setOnTouchListener(this);

        b20 = findViewById(R.id.b20);
        mas[2][5] = b20.getId();
        b20.setOnTouchListener(this);

        b21 = findViewById(R.id.b21);
        mas[2][6] = b21.getId();
        b21.setOnTouchListener(this);

        b22 = findViewById(R.id.b22);
        mas[3][0] = b22.getId();
        b22.setOnTouchListener(this);

        b23 = findViewById(R.id.b23);
        mas[3][1] = b23.getId();
        b23.setOnTouchListener(this);

        b24 = findViewById(R.id.b24);
        mas[3][2] = b24.getId();
        b24.setOnTouchListener(this);

        b25 = findViewById(R.id.b25);
        mas[3][3] = b25.getId();
        b25.setOnTouchListener(this);

        b26 = findViewById(R.id.b26);
        mas[3][4] = b26.getId();
        b26.setOnTouchListener(this);

        b27 = findViewById(R.id.b27);
        mas[3][5] = b27.getId();
        b27.setOnTouchListener(this);

        b28 = findViewById(R.id.b28);
        mas[3][6] = b28.getId();
        b28.setOnTouchListener(this);

        b29 = findViewById(R.id.b29);
        mas[4][0] = b29.getId();
        b29.setOnTouchListener(this);

        b30 = findViewById(R.id.b30);
        mas[4][1] = b30.getId();
        b30.setOnTouchListener(this);

        b31 = findViewById(R.id.b31);
        mas[4][2] = b31.getId();
        b31.setOnTouchListener(this);

        b32 = findViewById(R.id.b32);
        mas[4][3] = b32.getId();
        b32.setOnTouchListener(this);

        b33 = findViewById(R.id.b33);
        mas[4][4] = b33.getId();
        b33.setOnTouchListener(this);

        b34 = findViewById(R.id.b34);
        mas[4][5] = b34.getId();
        b34.setOnTouchListener(this);

        b35 = findViewById(R.id.b35);
        mas[4][6] = b35.getId();
        b35.setOnTouchListener(this);

        b36 = findViewById(R.id.b36);
        mas[5][0] = b36.getId();
        b36.setOnTouchListener(this);

        b37 = findViewById(R.id.b37);
        mas[5][1] = b37.getId();
        b37.setOnTouchListener(this);

        b38 = findViewById(R.id.b38);
        mas[5][2] = b38.getId();
        b38.setOnTouchListener(this);

        b39 = findViewById(R.id.b39);
        mas[5][3] = b39.getId();
        b39.setOnTouchListener(this);

        b40 = findViewById(R.id.b40);
        mas[5][4] = b40.getId();
        b40.setOnTouchListener(this);

        b41 = findViewById(R.id.b41);
        mas[5][5] = b41.getId();
        b41.setOnTouchListener(this);

        b42 = findViewById(R.id.b42);
        mas[5][6] = b42.getId();
        b42.setOnTouchListener(this);

        b43 = findViewById(R.id.b43);
        mas[6][0] = b43.getId();
        b43.setOnTouchListener(this);

        b44 = findViewById(R.id.b44);
        mas[6][1] = b44.getId();
        b44.setOnTouchListener(this);

        b45 = findViewById(R.id.b45);
        mas[6][2] = b45.getId();
        b45.setOnTouchListener(this);

        b46 = findViewById(R.id.b46);
        mas[6][3] = b46.getId();
        b46.setOnTouchListener(this);

        b47 = findViewById(R.id.b47);
        mas[6][4] = b47.getId();
        b47.setOnTouchListener(this);

        b48 = findViewById(R.id.b48);
        mas[6][5] = b48.getId();
        b48.setOnTouchListener(this);

        b49 = findViewById(R.id.b49);
        mas[6][6] = b49.getId();
        b49.setOnTouchListener(this);


        // TODO Меняем поля в зависимости от выбранного режима

        for (int i = 0; i < 7; i ++) {
            for (int j = 0; j < 7; j++) {
                if (vision[i][j] == 0) {
                    ImageButton bt = (ImageButton) findViewById(mas[i][j]);
                    bt.setVisibility(View.INVISIBLE);
                }
            }
        }

        //Resources res = getResources();
        //Drawable bblue1 = ResourcesCompat.getDrawable(res, R.drawable.bblue1, null);

        Log.d("mode", String.valueOf(mode));
        Log.d("players", String.valueOf(players));
        Log.d("map", String.valueOf(map));

    }

    Integer NumOut(int xx,int yy){
        return xx*8+yy;
    }

    // просто нажимаем любую кнопку + находим по тегу
    @Override
    public boolean onTouch(View v, MotionEvent event) {



        if (paintcells == false) {
            ImageButton bt = (ImageButton) findViewById(v.getId());
            /*
            ImageButton bt_1 = (ImageButton) findViewById(mas[0][0]);
            bt_1.setX(3000);
            */
            // String num= String.valueOf(bt.getTag());
            try {
                String numm = (String) bt.getTag();
                num = Integer.valueOf(numm) - 1;
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            // Log.d("ggg", String.valueOf(num));
            System.out.println("номер клетки " + String.valueOf(num));

            int xx = 0;
            int yy = 0;
            if (num <= 6) {
                xx = num;
                yy = 0;
            } else if ((num > 6) && (num <= 13)) {
                xx = num - 7;
                yy = yy + 1;
            } else if ((num <= 20) && (num > 13)) {
                xx = num - 14;
                yy = yy + 2;
            } else if ((num <= 27) && (num > 20)) {
                xx = num - 21;
                yy = yy + 3;
            } else if ((num <= 34) && (num > 27)) {
                xx = num - 28;
                yy = yy + 4;
            } else if ((num <= 41) && (num > 34)) {
                xx = num - 35;
                yy = yy + 5;
            } else if ((num <= 48) && (num > 41)) {
                xx = num - 42;
                yy = yy + 6;
            }
            // Log.d("ggg", "xx- " + xx + " yy- " + yy);
            // System.out.println("player " + String.valueOf(cell.player[xx][yy]));

            System.out.println("shot после пересчёта" + shot);

            if (players == 3) {
                if ((shot % 3 == 0) && (lost1 == true)) {
                    shot ++;
                }
                if ((shot % 3 == 1) && (lost2 == true)) {
                    shot ++;
                }
                if ((shot % 3 == 2) && (lost3 == true)) {
                    shot ++;
                }
                /*
                if ((shot % 3 == 0) && (lost1 == true)) {
                    shot ++;
                }
                */
            }
            if (players == 4) {
                if ((shot % 4 == 0) && (lost1 == true)) {
                    shot ++;
                }
                if ((shot % 4 == 1) && (lost2 == true)) {
                    shot ++;
                }
                if ((shot % 4 == 2) && (lost3 == true)) {
                    shot ++;
                }
                if ((shot % 4 == 3) && (lost4 == true)) {
                    shot ++;
                }
                if ((shot % 4 == 0) && (lost1 == true)) {
                    shot ++;
                }
            }

            System.out.println("shot после пересчёта" + shot);

            // TODO Для остальных случаев (1,2,3,4)
            //Прописываем изменения кнопки
            if (((players==2)&&(cell.player[yy][xx] == 1) && (shot % 2 == 0))
                    ||((players==3)&&(cell.player[yy][xx] == 1) && (shot % 3 == 0))
                    ||((players==4)&&(cell.player[yy][xx] == 1) && (shot % 4 == 0))) {
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
                if (cell.cellsmas[yy][xx] == 1) {
                    bt.setImageResource(R.drawable.bblue2);
                    cell.cellsmas[yy][xx] = 2;
                    //cell.lastcellsmas[yy][xx] = 2;
                    System.out.println("shot при втором ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);

                } else if (cell.cellsmas[yy][xx] == 2) {
                    bt.setImageResource(R.drawable.bblue3);
                    cell.cellsmas[yy][xx] = 3;
                    //cell.lastcellsmas[yy][xx] = 3;
                    System.out.println("shot при третьем ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                } else if (cell.cellsmas[yy][xx] == 3) {
                    cell.cellsmas[yy][xx] = 4;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("shot при третьем ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.bblue4);
                    //paintobjects();
                    //doWork();
                } else if (cell.cellsmas[yy][xx] == 4) {
                    cell.cellsmas[yy][xx] = 5;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("shot при третьем ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.bblue5);
                    //paintobjects();
                    paintcells = true;
                    speed = true;
                    //doWork();

                }
            }
            if (((players==2)&&(cell.player[yy][xx] == 2) && (shot % 2 == 1))
                    ||((players==3)&&(cell.player[yy][xx] == 2) && (shot % 3 == 1))
                    ||((players==4)&&(cell.player[yy][xx] == 2) && (shot % 4 == 1))) {
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
                if (cell.cellsmas[yy][xx] == 1) {
                    bt.setImageResource(R.drawable.bgreen2);
                    cell.cellsmas[yy][xx] = 2;
                    //cell.lastcellsmas[yy][xx] = 2;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                } else if (cell.cellsmas[yy][xx] == 2) {
                    bt.setImageResource(R.drawable.bgreen3);
                    cell.cellsmas[yy][xx] = 3;
                    //cell.lastcellsmas[yy][xx] = 3;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                } else if (cell.cellsmas[yy][xx] == 3) {
                    cell.cellsmas[yy][xx] = 4;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.bgreen4);
                    //paintobjects();
                    //doWork();
                } else if (cell.cellsmas[yy][xx] == 4) {
                    cell.cellsmas[yy][xx] = 5;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("shot при третьем ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.bgreen5);
                    //paintobjects();
                    paintcells = true;
                    speed = true;
                    //doWork();

                }
            }
            if (((players==3)&&(cell.player[yy][xx] == 3) && (shot % 3 == 2))
                    ||((players==4)&&(cell.player[yy][xx] == 3) && (shot % 4 == 2))) {
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
                if (cell.cellsmas[yy][xx] == 1) {
                    bt.setImageResource(R.drawable.wblue2);
                    cell.cellsmas[yy][xx] = 2;
                    //cell.lastcellsmas[yy][xx] = 2;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);

                } else if (cell.cellsmas[yy][xx] == 2) {
                    bt.setImageResource(R.drawable.wblue3);
                    cell.cellsmas[yy][xx] = 3;
                    //cell.lastcellsmas[yy][xx] = 3;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                } else if (cell.cellsmas[yy][xx] == 3) {
                    cell.cellsmas[yy][xx] = 4;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.wblue4);
                    //paintobjects();
                    //doWork();
                } else if (cell.cellsmas[yy][xx] == 4) {
                    cell.cellsmas[yy][xx] = 5;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("shot при третьем ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.wblue5);
                    //paintobjects();
                    paintcells = true;
                    speed = true;
                    //doWork();

                }
            }
            if ((cell.player[yy][xx] == 4) && (shot % 4 == 3)) {
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
                if (cell.cellsmas[yy][xx] == 1) {
                    bt.setImageResource(R.drawable.wgreen2);
                    cell.cellsmas[yy][xx] = 2;
                    //cell.lastcellsmas[yy][xx] = 2;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);

                } else if (cell.cellsmas[yy][xx] == 2) {
                    bt.setImageResource(R.drawable.wgreen3);
                    cell.cellsmas[yy][xx] = 3;
                    //cell.lastcellsmas[yy][xx] = 3;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                } else if (cell.cellsmas[yy][xx] == 3) {
                    cell.cellsmas[yy][xx] = 4;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.wgreen4);
                    //paintobjects();
                    //doWork();
                } else if (cell.cellsmas[yy][xx] == 4) {
                    cell.cellsmas[yy][xx] = 5;
                    //cell.lastcellsmas[yy][xx] = 4;
                    System.out.println("shot при третьем ходе-" + shot);
                    System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                    Log.d("ggg", "запустился paintobjects()");
                    bt.setImageResource(R.drawable.wgreen5);
                    //paintobjects();
                    paintcells = true;
                    speed = true;
                    //doWork();

                }
            }


            // TODO Для значения 0
            // shot определяем, кто будет начинать играть(после сделаем с Random)
            if ((cell.cellsmas[yy][xx] == 0) && (shot == 0)) {
                bt.setImageResource(R.drawable.bblue1);
                cell.cellsmas[yy][xx] = 1;
                //cell.lastcellsmas[yy][xx] = 1;
                System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                cell.player[yy][xx] = 1;
                System.out.println("shot при первом ходе-" + shot);
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
            }
            if ((cell.cellsmas[yy][xx] == 0) && (shot == 1)) {
                bt.setImageResource(R.drawable.bgreen1);
                cell.cellsmas[yy][xx] = 1;
                //cell.lastcellsmas[yy][xx] = 1;
                System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                cell.player[yy][xx] = 2;
                System.out.println("shot при первом ходе-" + shot);
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
            }
            if ((players>=3)&&(cell.cellsmas[yy][xx] == 0) && (shot == 2)) {
                bt.setImageResource(R.drawable.wblue1);
                cell.cellsmas[yy][xx] = 1;
                //cell.lastcellsmas[yy][xx] = 1;
                System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                cell.player[yy][xx] = 3;
                System.out.println("shot при первом ходе-" + shot);
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
            }
            if ((players>=4)&&(cell.cellsmas[yy][xx] == 0) && (shot == 3)) {
                bt.setImageResource(R.drawable.wgreen1);
                cell.cellsmas[yy][xx] = 1;
                //cell.lastcellsmas[yy][xx] = 1;
                System.out.println("cellmass[" + yy + "][" + xx + "] = " + cell.cellsmas[yy][xx]);
                cell.player[yy][xx] = 4;
                System.out.println("shot при первом ходе-" + shot);
                //cell.lastplayer[yy][xx] = cell.player[yy][xx];
            }

            // Log.d("ggg", "запустился paintobjects()");

            // TODO смена игроков
            //может ли  игрок походить на данную  клетку

            if (((players==2)&&(shot % 2 == 0) && (cell.player[yy][xx] == 1))
                    ||((players==3)&&(shot % 3 == 0) && (cell.player[yy][xx] == 1))
                    ||((players==4)&&(shot % 4 == 0) && (cell.player[yy][xx] == 1))) {

                if (clickbuttonn < 1) {  // TODO Надо будет как-то исправить
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    System.out.println("Первый ход темно-зеленного-" + shot);
                    clickbuttonn++;
                    shot++;
                    System.out.println("Какой игрок-" + shot);
                } else if ((cell.player[yy][xx] != 1) || (cell.cellsmas[yy][xx] == 0)) {

                } else {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    cell.player[yy][xx] = 1;
                    shot++;
                    clickbutton++;
                    System.out.println("Какой игрок-" + shot);
                }


            }
            if (((players==2)&&(shot % 2 == 1) && (cell.player[yy][xx] == 2))
                    ||((players==3)&&(shot % 3 == 1) && (cell.player[yy][xx] == 2))
                    ||((players==4)&&(shot % 4 == 1) && (cell.player[yy][xx] == 2))) {

                if (clickbuttonn < 2) {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    System.out.println("Первй ход темно-синего-" + shot);
                    clickbuttonn++;
                    shot++;
                    System.out.println("Какой игрок-" + shot);
                } else if ((cell.player[yy][xx] != 2) || (cell.cellsmas[yy][xx] == 0)) {

                } else {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    cell.player[yy][xx] = 2;
                    shot++;
                    clickbutton++;
                    System.out.println("Какой игрок-" + shot);
                }

            }
            if (((players==3)&&(shot % 3 == 2) && (cell.player[yy][xx] == 3))
                    ||((players==4)&&(shot % 4 == 2) && (cell.player[yy][xx] == 3))) {

                if (clickbuttonn < 3) {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    clickbuttonn++;
                    shot++;
                    System.out.println("Какой игрок-" + shot);
                } else if ((cell.player[yy][xx] != 3) || (cell.cellsmas[yy][xx] == 0)) {

                } else {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    cell.player[yy][xx] = 3;
                    shot++;
                    clickbutton++;
                    System.out.println("Какой игрок-" + shot);
                }

            }
            if ((shot % 4 == 3) && (cell.player[yy][xx] == 4)) {

                if (clickbuttonn < 4) {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    clickbuttonn++;
                    shot++;
                    System.out.println("Какой игрок-" + shot);
                } else if ((cell.player[yy][xx] != 4) || (cell.cellsmas[yy][xx] == 0)) {

                } else {
                    System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                    cell.player[yy][xx] = 4;
                    shot++;
                    clickbutton++;
                    System.out.println("Какой игрок-" + shot);
                }

            }
        }

        return true;


    }

    // для перерисовки после хода

    private class MyAsyncTask extends AsyncTask<Integer, Integer, Void> {
        private WeakReference<PlayingField> PlayingField;

        void setPlayingField(WeakReference<PlayingField> PlayingField) {
            this.PlayingField = PlayingField;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //ImageButton bt = findViewById(NumOut(0, 0, razm));
            //bt.setImageBitmap(R.drawable.settings);
            //bt.setImageResource(R.drawable.settings);
            Log.d("ggg", "запустился PreExecute");

        }

        @Override
        protected Void doInBackground(Integer... params) {
            //Integer values = 1;
            //publishProgress(values);

            bt_back5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cancel(true);

                    finish();
                    //onBackPressed();
                    Intent intent = new Intent(playing_field_5in1.this, SelectMode.class);
                    startActivity(intent);
                    System.exit(1);
                }
            });

            if (!isCancelled()) {
                while (true) {
                    publishProgress((int) (num));
                    try {
                        sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //Log.d("ggg", "запустился doInBackground");
                    while (paintcells == true) {
                        Log.d("ggg", "произошло деление");

                    /*
                    if (speed == false) {
                        int xx = 0;
                        int yy = 0;
                        if (num <= 7) {
                            xx = num;
                            yy = 0;
                        } else if ((num > 7) && (num <= 15)) {
                            xx = num - 8;
                            yy = yy + 1;
                        } else if ((num <= 23) && (num > 15)) {
                            xx = num - 16;
                            yy = yy + 2;
                        } else if ((num <= 31) && (num > 23)) {
                            xx = num - 24;
                            yy = yy + 3;
                        } else if ((num <= 39) && (num > 31)) {
                            xx = num - 32;
                            yy = yy + 4;
                        } else if ((num <= 47) && (num > 39)) {
                            xx = num - 40;
                            yy = yy + 5;
                        } else if ((num <= 55) && (num > 47)) {
                            xx = num - 48;
                            yy = yy + 6;
                        } else if (num > 55) {
                            xx = num - 56;
                            yy = yy + 7;
                        }
                        //System.out.println("x-" + xx + "  y-" + yy);
                        // shot - какой игрок ходит(нечетные- 1 игрок, четные- 2 игрок)
                        // num-номер кнопки, которая поделилась последней
                        // nump- номер кнопки, которая поделилась предпоследней
                        // clickbutton- переменная, которая увеличивается при каждом коллапсе
                        // Здесь мы увеличиваем значение клетки, которая поделилась до этого (зачем?)
                        System.out.println("AAAAAAAAAAAAAAAAA " + clickbutton);


                        if (((cell.player[yy][xx] == 1)) || ((cell.player[yy][xx] == 2))) {
                            if ((clickbutton <= 2) && (num != nump) && (shotp != shot)) {
                                clickbutton++;
                                System.out.println("clickbutton " + clickbutton);
                                // System.out.println();
                                //System.out.println("Кнопка    " + clickbutton);
                                cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;
                            } else if ((num == nump) || (cell.cellsmas[yy][xx] == 0) || (shotp == shot)) {

                                // System.out.println();
                                System.out.println("clickbutton2  " + clickbutton);
                            } else if (shotp != shot) {
                                cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;

                            }
                        }
                        return null;
                    }
                    trigger = false;

                    */

                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {

                                ImageButton bt = findViewById(mas[i][j]);
                                //Log.d("ggg" , "запустилось деление");

                                if (cell.cellsmas[i][j] >= 5) { // Значение 8 вроде не может быть

                                    try {
                                        sleep(500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    cell.cellsmas[i][j] = 1;

                                    //bt.setImageResource(R.drawable.emptycell);
                                    playerp = cell.player[i][j];
                                    //paintobjects();
                                    System.out.println("playerp " + playerp);


                                    if (playerp == 1) {
                                        if ((i > 0) && (vision[i - 1][j] == 1)){
                                            cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                            cell.player[i - 1][j] = 1;

                                        }
                                        if ((i < 6) && (vision[i + 1][j] == 1)) {
                                            cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                            cell.player[i + 1][j] = 1;
                                        }
                                        if ((j < 6) && (vision[i ][j+1] == 1)) {
                                            cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                            cell.player[i][j + 1] = 1;
                                        }
                                        if ((j > 0) && (vision[i][j-1] == 1)) {
                                            cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                            cell.player[i][j - 1] = 1;
                                        }
                                    }
                                    else if (playerp == 2) {
                                        if ((i > 0) && (vision[i - 1][j] == 1)){
                                            cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                            cell.player[i - 1][j] = 2;

                                        }
                                        if ((i < 6) && (vision[i + 1][j] == 1)) {
                                            cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                            cell.player[i + 1][j] = 2;
                                        }
                                        if ((j < 6) && (vision[i ][j+1] == 1)) {
                                            cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                            cell.player[i][j + 1] = 2;
                                        }
                                        if ((j > 0) && (vision[i][j-1] == 1)) {
                                            cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                            cell.player[i][j - 1] = 2;
                                        }
                                    }
                                    else if (playerp == 3) {
                                        if ((i > 0) && (vision[i - 1][j] == 1)){
                                            cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                            cell.player[i - 1][j] = 3;

                                        }
                                        if ((i < 6) && (vision[i + 1][j] == 1)) {
                                            cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                            cell.player[i + 1][j] = 3;
                                        }
                                        if ((j < 6) && (vision[i ][j+1] == 1)) {
                                            cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                            cell.player[i][j + 1] = 3;
                                        }
                                        if ((j > 0) && (vision[i][j-1] == 1)) {
                                            cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                            cell.player[i][j - 1] = 3;
                                        }
                                    }
                                    else if (playerp == 4) {
                                        if ((i > 0) && (vision[i - 1][j] == 1)){
                                            cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                            cell.player[i - 1][j] = 4;

                                        }
                                        if ((i < 6) && (vision[i + 1][j] == 1)) {
                                            cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                            cell.player[i + 1][j] = 4;
                                        }
                                        if ((j < 6) && (vision[i ][j+1] == 1)) {
                                            cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                            cell.player[i][j + 1] = 4;
                                        }
                                        if ((j > 0) && (vision[i][j-1] == 1)) {
                                            cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                            cell.player[i][j - 1] = 4;
                                        }
                                    }


                                    if (speed == true) {
                                        speed = false; // Эта переменная не дает программе считать очки, пока не пройдет рисовка
                                        System.out.println("speed " + speed);
                                    }
                                    //paintobjects();

                                    FromBackToProgress = true;
                                    publishProgress((int) (num));

                                }
                            }
                        }
                        //paintcells = false;
                        //FromBackToProgress = true;
                        //publishProgress((int) (num));

                    }


                }
            }
            else {
                return null;
            }

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //protected void onProgressUpdate(Integer... values) {
            //    super.onProgressUpdate(values);
            if (FromBackToProgress == true) {

                paintcells = false;
                //Log.d("ggg", "запустился onPostExecute");
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {


                        ImageButton bt = findViewById(mas[i][j]);

                        //Log.d("ggg", "начало покраски");


                        if (cell.cellsmas[i][j] == 0) {

                            //bt.setImageResource(R.drawable.emptycell);
                            bt.setImageResource(R.drawable.emptycell);
                            bt.setBackgroundColor(Color.green(100));
                            //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                            //Log.d("ggg", "перерисовка коллапса");
                        }
                        if (cell.cellsmas[i][j] == 1) {
                            if (cell.player[i][j] == 1) {

                                bt.setImageResource(R.drawable.bblue1);
                                //bt.setVisibility(View.INVISIBLE);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                            } else if (cell.player[i][j] == 2) {

                                //bt.setVisibility(View.INVISIBLE);
                                bt.setImageResource(R.drawable.bgreen1);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 3) {
                                //bt.setVisibility(View.INVISIBLE);
                                bt.setImageResource(R.drawable.wblue1);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 4) {
                                //bt.setVisibility(View.INVISIBLE);
                                bt.setImageResource(R.drawable.wgreen1);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            }


                        }
                        if (cell.cellsmas[i][j] == 2) {
                            if (cell.player[i][j] == 1) {

                                bt.setImageResource(R.drawable.bblue2);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                            } else if (cell.player[i][j] == 2) {

                                bt.setImageResource(R.drawable.bgreen2);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 3) {

                                bt.setImageResource(R.drawable.wblue2);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 4) {

                                bt.setImageResource(R.drawable.wgreen2);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            }
                        }
                        if (cell.cellsmas[i][j] == 3) {
                            if (cell.player[i][j] == 1) {

                                bt.setImageResource(R.drawable.bblue3);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                            } else if (cell.player[i][j] == 2) {

                                bt.setImageResource(R.drawable.bgreen3);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 3) {

                                bt.setImageResource(R.drawable.wblue3);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 4) {

                                bt.setImageResource(R.drawable.wgreen3);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            }
                        }
                        if (cell.cellsmas[i][j] == 4) {
                            if (cell.player[i][j] == 1) {

                                bt.setImageResource(R.drawable.bblue4);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                            } else if (cell.player[i][j] == 2) {

                                bt.setImageResource(R.drawable.bgreen4);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 3) {

                                bt.setImageResource(R.drawable.wblue4);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 4) {

                                bt.setImageResource(R.drawable.wgreen4);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            }
                        }
                        if (cell.cellsmas[i][j] >= 5) {
                            if (cell.player[i][j] == 1) {

                                bt.setImageResource(R.drawable.bblue5);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                            } else if (cell.player[i][j] == 2) {

                                bt.setImageResource(R.drawable.bgreen5);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 3) {

                                bt.setImageResource(R.drawable.wblue5);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            } else if (cell.player[i][j] == 4) {

                                bt.setImageResource(R.drawable.wgreen5);
                                //Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                            }
                            paintcells = true;
                            speed = true;

                        }

                    }
                }

                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //paintcells = false;
                FromBackToProgress = false;
                win();
            }
        }


    }

    void win() // Функция для выявления победителя
    {
        //System.out.println("AAAAAAAAAAAAAAAAA " + clickbutton);
        int k = 0;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (cell.player[i][j] == 1) {
                    k++;

                }
                if (cell.player[i][j] == 2) {
                    k1++;
                }
                if (cell.player[i][j] == 3) {
                    k2++;
                }
                if (cell.player[i][j] == 4) {
                    k3++;
                }
            }
        }
        //System.out.println("Сколько захватил кнопок 1 игрок "+k);
        //System.out.println("Сколько захватил кнопок 2 игрок "+k1);
        //System.out.println("Сколько захватил кнопок 3 игрок "+k2);
        //System.out.println("Сколько захватил кнопок 4 игрок "+k3);
        if (k == 0) {
            lost1 = true;
        }
        if (k1 == 0) {
            lost2 = true;
        }
        if (k2 == 0) {
            lost3 = true;
        }
        if (k3 == 0) {
            lost4 = true;
        }

        if ((k1 == 0) && (k2 == 0) && (k3 == 0)){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победил первый игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if ((k == 0) && (k2 == 0) && (k3 == 0)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победил второй игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if ((k == 0) && (k1 == 0) && (k3 == 0)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победил третий игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if ((k == 0) && (k1 == 0) && (k2 == 0)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победил четвертый игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

}





