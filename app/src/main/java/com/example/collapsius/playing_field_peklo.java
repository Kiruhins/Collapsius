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
import android.widget.ImageButton;
import android.widget.Toast;

import java.lang.ref.WeakReference;
import java.util.Random;


public class playing_field_peklo extends AppCompatActivity implements View.OnTouchListener {

    int[][] cellsmas = new int[8][8];
    int[][] player = new int[8][8];

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
    Integer razm = 8;
    Boolean paintcells = false;
    Integer players=2;

    int[][] mas = new int[8][8];
    int[][] vision = new int[8][8];
    int[][] block = new int[8][8];

    boolean FromBackToProgress;

    // TODO для рандомных клеток

    boolean randomblock = false;
    boolean repaintblock = false;

    boolean EndOfAsynck = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_field);

        Intent intent = getIntent();
        Integer mode = intent.getIntExtra("mode", 0);
        players = intent.getIntExtra("player", 0);
        Integer map = intent.getIntExtra("map", 0);

        cell = new Cells(cellsmas, player);

        for (int i = 0; i < cell.cellsmas.length; ++i) {
            for (int j = 0; j < cell.cellsmas.length; ++j) {
                cell.cellsmas[i][j] = 0;
                cell.player[i][j] = 0;

            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                vision[i][j] = 1;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                block[i][j] = 0;
            }
        }

        if (map == 2) {
            vision[1][3] = 0;
            vision[1][4] = 0;
            vision[6][3] = 0;
            vision[6][4] = 0;
            vision[3][1] = 0;
            vision[4][1] = 0;
            vision[3][6] = 0;
            vision[4][6] = 0;
            for (int i = 0; i < 8; i ++) {
                vision[7][i] = 0;
                vision[i][7] = 0;
                vision[0][i] = 0;
                vision[i][0] = 0;
            }
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
            for (int i = 0; i < 8; i ++) {
                vision[7][i] = 0;
                vision[i][7] = 0;
            }
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
            for (int i = 0; i < 8; i ++) {
                vision[7][i] = 0;
                vision[i][7] = 0;
            }
        }

        if (map ==  5) {
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
            for (int i = 0; i < 8; i ++) {
                vision[7][i] = 0;
                vision[i][7] = 0;
            }
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
            for (int i = 0; i < 8; i ++) {
                vision[7][i] = 0;
                vision[i][7] = 0;
            }
        }

        MyAsyncTask thread = new MyAsyncTask();
        thread.execute();

        ImageButton bt_1;
        ImageButton bt_2;
        ImageButton bt_3;
        ImageButton bt_4;
        ImageButton bt_5;
        ImageButton bt_6;
        ImageButton bt_7;
        ImageButton bt_8;
        ImageButton bt_9;
        ImageButton bt_10;
        ImageButton bt_11;
        ImageButton bt_12;
        ImageButton bt_13;
        ImageButton bt_14;
        ImageButton bt_15;
        ImageButton bt_16;
        ImageButton bt_17;
        ImageButton bt_18;
        ImageButton bt_19;
        ImageButton bt_20;
        ImageButton bt_21;
        ImageButton bt_22;
        ImageButton bt_23;
        ImageButton bt_24;
        ImageButton bt_25;
        ImageButton bt_26;
        ImageButton bt_27;
        ImageButton bt_28;
        ImageButton bt_29;
        ImageButton bt_30;
        ImageButton bt_31;
        ImageButton bt_32;
        ImageButton bt_33;
        ImageButton bt_34;
        ImageButton bt_35;
        ImageButton bt_36;
        ImageButton bt_37;
        ImageButton bt_38;
        ImageButton bt_39;
        ImageButton bt_40;
        ImageButton bt_41;
        ImageButton bt_42;
        ImageButton bt_43;
        ImageButton bt_44;
        ImageButton bt_45;
        ImageButton bt_46;
        ImageButton bt_47;
        ImageButton bt_48;
        ImageButton bt_49;
        ImageButton bt_50;
        ImageButton bt_51;
        ImageButton bt_52;
        ImageButton bt_53;
        ImageButton bt_54;
        ImageButton bt_55;
        ImageButton bt_56;
        ImageButton bt_57;
        ImageButton bt_58;
        ImageButton bt_59;
        ImageButton bt_60;
        ImageButton bt_61;
        ImageButton bt_62;
        ImageButton bt_63;
        ImageButton bt_64;


        bt_1 = findViewById(R.id.bt1);
        mas[0][0] = bt_1.getId();
        //startid = bt_1.getId();

        bt_1.setOnTouchListener(this);
        bt_2 = findViewById(R.id.bt2);
        mas[0][1] = bt_2.getId();
        bt_2.setOnTouchListener(this);
        bt_3 = findViewById(R.id.bt3);
        mas[0][2] = bt_3.getId();
        bt_3.setOnTouchListener(this);
        bt_4 = findViewById(R.id.bt4);
        mas[0][3] = bt_4.getId();
        bt_4.setOnTouchListener(this);
        bt_5 = findViewById(R.id.bt5);
        mas[0][4] = bt_5.getId();
        bt_5.setOnTouchListener(this);
        bt_6 = findViewById(R.id.bt6);
        mas[0][5] = bt_6.getId();
        bt_6.setOnTouchListener(this);
        bt_7 = findViewById(R.id.bt7);
        mas[0][6] = bt_7.getId();
        bt_7.setOnTouchListener(this);
        bt_8 = findViewById(R.id.bt8);
        mas[0][7] = bt_8.getId();
        bt_8.setOnTouchListener(this);
        bt_9 = findViewById(R.id.bt9);
        mas[1][0] = bt_9.getId();
        bt_9.setOnTouchListener(this);
        bt_10 = findViewById(R.id.bt10);
        mas[1][1] = bt_10.getId();
        bt_10.setOnTouchListener(this);
        bt_11 = findViewById(R.id.bt11);
        mas[1][2] = bt_11.getId();
        bt_11.setOnTouchListener(this);
        bt_12 = findViewById(R.id.bt12);
        mas[1][3] = bt_12.getId();
        bt_12.setOnTouchListener(this);
        bt_13 = findViewById(R.id.bt13);
        mas[1][4] = bt_13.getId();
        bt_13.setOnTouchListener(this);
        bt_14 = findViewById(R.id.bt14);
        mas[1][5] = bt_14.getId();
        bt_14.setOnTouchListener(this);
        bt_15 = findViewById(R.id.bt15);
        mas[1][6] = bt_15.getId();
        bt_15.setOnTouchListener(this);
        bt_16 = findViewById(R.id.bt16);
        mas[1][7] = bt_16.getId();
        bt_16.setOnTouchListener(this);
        bt_17 = findViewById(R.id.bt17);
        mas[2][0] = bt_17.getId();
        bt_17.setOnTouchListener(this);
        bt_18 = findViewById(R.id.bt18);
        mas[2][1] = bt_18.getId();
        bt_18.setOnTouchListener(this);
        bt_19 = findViewById(R.id.bt19);
        mas[2][2] = bt_19.getId();
        bt_19.setOnTouchListener(this);
        bt_20 = findViewById(R.id.bt20);
        mas[2][3] = bt_20.getId();
        bt_20.setOnTouchListener(this);
        bt_21 = findViewById(R.id.bt21);
        mas[2][4] = bt_21.getId();
        bt_21.setOnTouchListener(this);
        bt_22 = findViewById(R.id.bt22);
        mas[2][5] = bt_22.getId();
        bt_22.setOnTouchListener(this);
        bt_23 = findViewById(R.id.bt23);
        mas[2][6] = bt_23.getId();
        bt_23.setOnTouchListener(this);
        bt_24 = findViewById(R.id.bt24);
        mas[2][7] = bt_24.getId();
        bt_24.setOnTouchListener(this);
        bt_25 = findViewById(R.id.bt25);
        mas[3][0] = bt_25.getId();
        bt_25.setOnTouchListener(this);
        bt_26 = findViewById(R.id.bt26);
        mas[3][1] = bt_26.getId();
        bt_26.setOnTouchListener(this);
        bt_27 = findViewById(R.id.bt27);
        mas[3][2] = bt_27.getId();
        bt_27.setOnTouchListener(this);
        bt_28 = findViewById(R.id.bt28);
        mas[3][3] = bt_28.getId();
        bt_28.setOnTouchListener(this);
        bt_29 = findViewById(R.id.bt29);
        mas[3][4] = bt_29.getId();
        bt_29.setOnTouchListener(this);
        bt_30 = findViewById(R.id.bt30);
        mas[3][5] = bt_30.getId();
        bt_30.setOnTouchListener(this);
        bt_31 = findViewById(R.id.bt31);
        mas[3][6] = bt_31.getId();
        bt_31.setOnTouchListener(this);
        bt_32 = findViewById(R.id.bt32);
        mas[3][7] = bt_32.getId();
        bt_32.setOnTouchListener(this);
        bt_33 = findViewById(R.id.bt33);
        mas[4][0] = bt_33.getId();
        bt_33.setOnTouchListener(this);
        bt_34 = findViewById(R.id.bt34);
        mas[4][1] = bt_34.getId();
        bt_34.setOnTouchListener(this);
        bt_35 = findViewById(R.id.bt35);
        mas[4][2] = bt_35.getId();
        bt_35.setOnTouchListener(this);
        bt_36 = findViewById(R.id.bt36);
        mas[4][3] = bt_36.getId();
        bt_36.setOnTouchListener(this);
        bt_37 = findViewById(R.id.bt37);
        mas[4][4] = bt_37.getId();
        bt_37.setOnTouchListener(this);
        bt_38 = findViewById(R.id.bt38);
        mas[4][5] = bt_38.getId();
        bt_38.setOnTouchListener(this);
        bt_39 = findViewById(R.id.bt39);
        mas[4][6] = bt_39.getId();
        bt_39.setOnTouchListener(this);
        bt_40 = findViewById(R.id.bt40);
        mas[4][7] = bt_40.getId();
        bt_40.setOnTouchListener(this);
        bt_41 = findViewById(R.id.bt41);
        mas[5][0] = bt_41.getId();
        bt_41.setOnTouchListener(this);
        bt_42 = findViewById(R.id.bt42);
        mas[5][1] = bt_42.getId();
        bt_42.setOnTouchListener(this);
        bt_43 = findViewById(R.id.bt43);
        mas[5][2] = bt_43.getId();
        bt_43.setOnTouchListener(this);
        bt_44 = findViewById(R.id.bt44);
        mas[5][3] = bt_44.getId();
        bt_44.setOnTouchListener(this);
        bt_45 = findViewById(R.id.bt45);
        mas[5][4] = bt_45.getId();
        bt_45.setOnTouchListener(this);
        bt_46 = findViewById(R.id.bt46);
        mas[5][5] = bt_46.getId();
        bt_46.setOnTouchListener(this);
        bt_47 = findViewById(R.id.bt47);
        mas[5][6] = bt_47.getId();
        bt_47.setOnTouchListener(this);
        bt_48 = findViewById(R.id.bt48);
        mas[5][7] = bt_48.getId();
        bt_48.setOnTouchListener(this);
        bt_49 = findViewById(R.id.bt49);
        mas[6][0] = bt_49.getId();
        bt_49.setOnTouchListener(this);
        bt_50 = findViewById(R.id.bt50);
        mas[6][1] = bt_50.getId();
        bt_50.setOnTouchListener(this);
        bt_51 = findViewById(R.id.bt51);
        mas[6][2] = bt_51.getId();
        bt_51.setOnTouchListener(this);
        bt_52 = findViewById(R.id.bt52);
        mas[6][3] = bt_52.getId();
        bt_52.setOnTouchListener(this);
        bt_53 = findViewById(R.id.bt53);
        mas[6][4] = bt_53.getId();
        bt_53.setOnTouchListener(this);
        bt_54 = findViewById(R.id.bt54);
        mas[6][5] = bt_54.getId();
        bt_54.setOnTouchListener(this);
        bt_55 = findViewById(R.id.bt55);
        mas[6][6] = bt_55.getId();
        bt_55.setOnTouchListener(this);
        bt_56 = findViewById(R.id.bt56);
        mas[6][7] = bt_56.getId();
        bt_56.setOnTouchListener(this);
        bt_57 = findViewById(R.id.bt57);
        mas[7][0] = bt_57.getId();
        bt_57.setOnTouchListener(this);
        bt_58 = findViewById(R.id.bt58);
        mas[7][1] = bt_58.getId();
        bt_58.setOnTouchListener(this);
        bt_59 = findViewById(R.id.bt59);
        mas[7][2] = bt_59.getId();
        bt_59.setOnTouchListener(this);
        bt_60 = findViewById(R.id.bt60);
        mas[7][3] = bt_60.getId();
        bt_60.setOnTouchListener(this);
        bt_61 = findViewById(R.id.bt61);
        mas[7][4] = bt_61.getId();
        bt_61.setOnTouchListener(this);
        bt_62 = findViewById(R.id.bt62);
        mas[7][5] = bt_62.getId();
        bt_62.setOnTouchListener(this);
        bt_63 = findViewById(R.id.bt63);
        mas[7][6] = bt_63.getId();
        bt_63.setOnTouchListener(this);
        bt_64 = findViewById(R.id.bt64);
        mas[7][7] = bt_64.getId();
        bt_64.setOnTouchListener(this);

        // TODO Меняем поля в зависимости от выбранного режима

        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j++) {
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

            randomblock = true;

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

            // TODO Для остальных случаев (1,2,3)
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

            if ((((players==2)&&(shot % 2 == 0) && (cell.player[yy][xx] == 1))
                    ||((players==3)&&(shot % 3 == 0) && (cell.player[yy][xx] == 1))
                    ||((players==4)&&(shot % 4 == 0) && (cell.player[yy][xx] == 1))) && (block[yy][xx] == 0)) {

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
            if ((((players==2)&&(shot % 2 == 1) && (cell.player[yy][xx] == 2))
                    ||((players==3)&&(shot % 3 == 1) && (cell.player[yy][xx] == 2))
                    ||((players==4)&&(shot % 4 == 1) && (cell.player[yy][xx] == 2))) && (block[yy][xx] == 0)) {

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
            if ((((players==3)&&(shot % 3 == 2) && (cell.player[yy][xx] == 3))
                    ||((players==4)&&(shot % 4 == 2) && (cell.player[yy][xx] == 3))) && (block[yy][xx] == 0)) {

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
            if (((shot % 4 == 3) && (cell.player[yy][xx] == 4)) && (block[yy][xx] == 0)) {

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


    public Integer IdOut(Integer i, Integer j, Integer razm) {
        Integer k = 0;
        if ((i + j * razm) >= 22) {
            k = 1;
        }
        if ((i + j * razm) >= 33) {
            k = 2;
        }
        if ((i + j * razm) >= 44) {
            k = 3;
        }
        if ((i + j * razm) >= 55) {
            k = 4;
        }
        return startid + j + (i * razm) + k;
    }


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

                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {

                            ImageButton bt = findViewById(mas[i][j]);
                            //Log.d("ggg" , "запустилось деление");

                            if (cell.cellsmas[i][j] >= 4) { // Значение 8 вроде не может быть

                                try {
                                    sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                cell.cellsmas[i][j] = 0;


                                //bt.setImageResource(R.drawable.emptycell);
                                playerp = cell.player[i][j];
                                //paintobjects();
                                System.out.println("playerp " + playerp);


                                cell.player[i][j] = 0;
                                if (playerp == 1) {
                                    if ((i > 0) && (vision[i - 1][j] == 1)){
                                        cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                        cell.player[i - 1][j] = 1;

                                    }
                                    if ((i < 7) && (vision[i + 1][j] == 1)) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 1;
                                    }
                                    if ((j < 7) && (vision[i ][j+1] == 1)) {
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
                                    if ((i < 7) && (vision[i + 1][j] == 1)) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 2;
                                    }
                                    if ((j < 7) && (vision[i ][j+1] == 1)) {
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
                                    if ((i < 7) && (vision[i + 1][j] == 1)) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 3;
                                    }
                                    if ((j < 7) && (vision[i ][j+1] == 1)) {
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
                                    if ((i < 7) && (vision[i + 1][j] == 1)) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 4;
                                    }
                                    if ((j < 7) && (vision[i ][j+1] == 1)) {
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

                }

                // рандомно выбераем 1 из 15 на вероятность, потом выбераем 1 клетку,
                // потом выбераем кол-во от 1 до 4.

                if (EndOfAsynck == true) {

                    Random random = new Random();
                    int probability = random.nextInt(16-1) + 1;
                    if (probability == 7) {

                        int randomcell = random.nextInt(64-0) + 0;
                        int numberofmoves = random.nextInt(6-2) + 2;

                        // ищем координаты рандомной точки

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

                        block[yy][xx] = numberofmoves;
                        player[yy][xx] = 0;

                    }

                    // Убавляем с каждым ходом в блокировке по 1

                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (block[i][j] > 0) {
                                block[i][j] -= 1;
                            }
                        }
                    }

                    repaintblock = true;
                    publishProgress((int) (num));

                }

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
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {

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
                        if (cell.cellsmas[i][j] >= 4) {
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
                            paintcells = true;
                            speed = true;
                            //win();
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

            // закончился пересчёт и перекраска, т.к. перекраска всегда последняя

            if ((paintcells == false) && (FromBackToProgress == false)) {
                EndOfAsynck = true;
            }

            if (repaintblock == true) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {

                        ImageButton bt = findViewById(mas[i][j]);

                        if (block[i][j] == 4) {
                            bt.setImageResource(R.drawable.lock);
                        }
                        else if (block[i][j] == 3){
                            bt.setImageResource(R.drawable.lock);
                        }
                        else if (block[i][j] == 2){
                            bt.setImageResource(R.drawable.lock);
                        }
                        else if (block[i][j] == 1){
                            bt.setImageResource(R.drawable.lock);
                        }
                        else if ((block[i][j] == 0) && (player[i][j] == 0)){
                            bt.setImageResource(R.drawable.emptycell);
                        }
                    }
                }
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
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
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
                    "Выйграл первый игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if ((k == 0) && (k2 == 0) && (k3 == 0)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Выйграл второй игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if ((k == 0) && (k1 == 0) && (k3 == 0)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Выйграл третий игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if ((k == 0) && (k1 == 0) && (k2 == 0)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Выйграл четвертый игрок!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}





