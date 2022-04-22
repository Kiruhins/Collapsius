package com.example.collapsius;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import java.lang.ref.WeakReference;

class Cells {
    public int[][] cellsmas;
    public int[][] player;
    public int[][] lastplayer;
    public int[][] lastcellsmas;


    public Cells(int[][] cellmass,int[][] player,int[][] lastplayer,int[][] lastcellsmas){
        this.cellsmas=cellmass;
        this.player=player;
        this.lastplayer = lastplayer;
        this.lastcellsmas = lastcellsmas;
    }

}


public class PlayingField extends AppCompatActivity implements View.OnTouchListener {

    int[][] cellsmas = new int[8][8];
    int[][] player = new int[8][8];
    int[][] lastcellsmas = new int[8][8];
    int[][] lastplayer = new int[8][8];

    Cells cell;


    Integer shot = 1;
    Integer shotp = 0;
    Boolean trigger = false;
    Integer clickbuttonn = 0;
    Boolean speed = false;
    Integer num = 0;
    Integer nump = 0;
    Integer playerp = 0;
    Integer clickbutton = 0;
    Integer startid;
    Integer razm = 8;
    Boolean paintcells= false;





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_field);

        cell = new Cells(cellsmas, player,lastplayer ,lastcellsmas );

        for (int i = 0; i < cell.cellsmas.length; ++i) {
            for (int j = 0; j < cell.cellsmas.length; ++j) {
                cell.cellsmas[i][j] = 0;
                cell.player[i][j] = 0;
                cell.lastplayer[i][j] = 0;
                cell.lastcellsmas[i][j] = 0;
            }
        }
        //Resources res = getResources();

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

        bt_1 = findViewById(R.id.bt_1);

        startid = bt_1.getId();

        bt_1.setOnTouchListener(this);
        bt_2 = findViewById(R.id.bt_2);
        bt_2.setOnTouchListener(this);
        bt_3 = findViewById(R.id.bt_3);
        bt_3.setOnTouchListener(this);
        bt_4 = findViewById(R.id.bt_4);
        bt_4.setOnTouchListener(this);
        bt_5 = findViewById(R.id.bt_5);
        bt_5.setOnTouchListener(this);
        bt_6 = findViewById(R.id.bt_6);
        bt_6.setOnTouchListener(this);
        bt_7 = findViewById(R.id.bt_7);
        bt_7.setOnTouchListener(this);
        bt_8 = findViewById(R.id.bt_8);
        bt_8.setOnTouchListener(this);
        bt_9 = findViewById(R.id.bt_9);
        bt_9.setOnTouchListener(this);
        bt_10 = findViewById(R.id.ct_10);
        bt_10.setOnTouchListener(this);
        bt_11 = findViewById(R.id.bt_11);
        bt_11.setOnTouchListener(this);
        bt_12 = findViewById(R.id.bt_12);
        bt_12.setOnTouchListener(this);
        bt_13 = findViewById(R.id.bt_13);
        bt_13.setOnTouchListener(this);
        bt_14 = findViewById(R.id.bt_14);
        bt_14.setOnTouchListener(this);
        bt_15 = findViewById(R.id.bt_15);
        bt_15.setOnTouchListener(this);
        bt_16 = findViewById(R.id.bt_16);
        bt_16.setOnTouchListener(this);
        bt_17 = findViewById(R.id.bt_17);
        bt_17.setOnTouchListener(this);
        bt_18 = findViewById(R.id.bt_18);
        bt_18.setOnTouchListener(this);
        bt_19 = findViewById(R.id.bt_19);
        bt_19.setOnTouchListener(this);
        bt_20 = findViewById(R.id.bt_20);
        bt_20.setOnTouchListener(this);
        bt_21 = findViewById(R.id.bt_21);
        bt_21.setOnTouchListener(this);
        bt_22 = findViewById(R.id.bt_22);
        bt_22.setOnTouchListener(this);
        bt_23 = findViewById(R.id.bt_23);
        bt_23.setOnTouchListener(this);
        bt_24 = findViewById(R.id.bt_24);
        bt_24.setOnTouchListener(this);
        bt_25 = findViewById(R.id.bt_25);
        bt_25.setOnTouchListener(this);
        bt_26 = findViewById(R.id.bt_26);
        bt_26.setOnTouchListener(this);
        bt_27 = findViewById(R.id.bt_2);
        bt_27.setOnTouchListener(this);
        bt_28 = findViewById(R.id.bt_3);
        bt_28.setOnTouchListener(this);
        bt_29 = findViewById(R.id.bt_4);
        bt_29.setOnTouchListener(this);
        bt_30 = findViewById(R.id.bt_5);
        bt_30.setOnTouchListener(this);
        bt_31 = findViewById(R.id.bt_6);
        bt_31.setOnTouchListener(this);
        bt_32 = findViewById(R.id.bt_7);
        bt_32.setOnTouchListener(this);
        bt_33 = findViewById(R.id.bt_8);
        bt_33.setOnTouchListener(this);
        bt_34 = findViewById(R.id.bt_34);
        bt_34.setOnTouchListener(this);
        bt_35 = findViewById(R.id.bt_35);
        bt_35.setOnTouchListener(this);
        bt_36 = findViewById(R.id.bt_36);
        bt_36.setOnTouchListener(this);
        bt_37 = findViewById(R.id.bt_37);
        bt_37.setOnTouchListener(this);
        bt_38 = findViewById(R.id.bt_38);
        bt_38.setOnTouchListener(this);
        bt_39 = findViewById(R.id.bt_39);
        bt_39.setOnTouchListener(this);
        bt_40 = findViewById(R.id.bt_40);
        bt_40.setOnTouchListener(this);
        bt_41 = findViewById(R.id.bt_41);
        bt_41.setOnTouchListener(this);
        bt_42 = findViewById(R.id.bt_42);
        bt_42.setOnTouchListener(this);
        bt_43 = findViewById(R.id.bt_43);
        bt_43.setOnTouchListener(this);
        bt_44 = findViewById(R.id.bt_44);
        bt_44.setOnTouchListener(this);
        bt_45 = findViewById(R.id.bt_45);
        bt_45.setOnTouchListener(this);
        bt_46 = findViewById(R.id.bt_46);
        bt_46.setOnTouchListener(this);
        bt_47 = findViewById(R.id.bt_47);
        bt_47.setOnTouchListener(this);
        bt_48 = findViewById(R.id.bt_48);
        bt_48.setOnTouchListener(this);
        bt_49 = findViewById(R.id.bt_49);
        bt_49.setOnTouchListener(this);
        bt_50 = findViewById(R.id.bt_50);
        bt_50.setOnTouchListener(this);
        bt_51 = findViewById(R.id.bt_51);
        bt_51.setOnTouchListener(this);
        bt_52 = findViewById(R.id.bt_52);
        bt_52.setOnTouchListener(this);
        bt_53 = findViewById(R.id.bt_53);
        bt_53.setOnTouchListener(this);
        bt_54 = findViewById(R.id.bt_54);
        bt_54.setOnTouchListener(this);
        bt_55 = findViewById(R.id.bt_55);
        bt_55.setOnTouchListener(this);
        bt_56 = findViewById(R.id.bt_56);
        bt_56.setOnTouchListener(this);
        bt_57 = findViewById(R.id.bt_57);
        bt_57.setOnTouchListener(this);
        bt_58 = findViewById(R.id.bt_58);
        bt_58.setOnTouchListener(this);
        bt_59 = findViewById(R.id.bt_59);
        bt_59.setOnTouchListener(this);
        bt_60 = findViewById(R.id.bt_60);
        bt_60.setOnTouchListener(this);
        bt_61 = findViewById(R.id.bt_61);
        bt_61.setOnTouchListener(this);
        bt_62 = findViewById(R.id.bt_62);
        bt_62.setOnTouchListener(this);
        bt_63 = findViewById(R.id.bt_63);
        bt_63.setOnTouchListener(this);
        bt_64 = findViewById(R.id.bt_64);
        bt_64.setOnTouchListener(this);



        System.out.println("номер клетки 1 " + String.valueOf(bt_1.getId()));
        System.out.println("номер клетки 2 " + String.valueOf(bt_2.getId()));
        System.out.println("номер клетки 3 " + String.valueOf(bt_3.getId()));
        System.out.println("номер клетки 4 " + String.valueOf(bt_4.getId()));
        System.out.println("номер клетки 5 " + String.valueOf(bt_5.getId()));
        System.out.println("номер клетки 6 " + String.valueOf(bt_6.getId()));
        System.out.println("номер клетки 7 " + String.valueOf(bt_7.getId()));
        System.out.println("номер клетки 8 " + String.valueOf(bt_8.getId()));
        System.out.println("номер клетки 9 " + String.valueOf(bt_9.getId()));

        System.out.println("номер клетки 10 " + String.valueOf(bt_10.getId()));
        System.out.println("номер клетки 11 " + String.valueOf(bt_11.getId()));
        System.out.println("номер клетки 12 " + String.valueOf(bt_12.getId()));
        System.out.println("номер клетки 13 " + String.valueOf(bt_13.getId()));
        System.out.println("номер клетки 14 " + String.valueOf(bt_14.getId()));
        System.out.println("номер клетки 15 " + String.valueOf(bt_15.getId()));
        System.out.println("номер клетки 16 " + String.valueOf(bt_16.getId()));
        System.out.println("номер клетки 17 " + String.valueOf(bt_17.getId()));
        System.out.println("номер клетки 18 " + String.valueOf(bt_18.getId()));
        System.out.println("номер клетки 19 " + String.valueOf(bt_19.getId()));

        System.out.println("номер клетки 20 " + String.valueOf(bt_20.getId()));
        System.out.println("номер клетки 21 " + String.valueOf(bt_21.getId()));
        System.out.println("номер клетки 22 " + String.valueOf(bt_22.getId()));
        System.out.println("номер клетки 23 " + String.valueOf(bt_23.getId()));
        System.out.println("номер клетки 24 " + String.valueOf(bt_24.getId()));
        System.out.println("номер клетки 25 " + String.valueOf(bt_25.getId()));
        System.out.println("номер клетки 26 " + String.valueOf(bt_26.getId()));
        System.out.println("номер клетки 27 " + String.valueOf(bt_27.getId()));
        System.out.println("номер клетки 28 " + String.valueOf(bt_28.getId()));
        System.out.println("номер клетки 29 " + String.valueOf(bt_29.getId()));

        System.out.println("номер клетки 30 " + String.valueOf(bt_30.getId()));
        System.out.println("номер клетки 31 " + String.valueOf(bt_31.getId()));
        System.out.println("номер клетки 32 " + String.valueOf(bt_32.getId()));
        System.out.println("номер клетки 33 " + String.valueOf(bt_33.getId()));
        System.out.println("номер клетки 34 " + String.valueOf(bt_34.getId()));
        System.out.println("номер клетки 35 " + String.valueOf(bt_35.getId()));
        System.out.println("номер клетки 36 " + String.valueOf(bt_36.getId()));
        System.out.println("номер клетки 37 " + String.valueOf(bt_37.getId()));
        System.out.println("номер клетки 38 " + String.valueOf(bt_38.getId()));
        System.out.println("номер клетки 39 " + String.valueOf(bt_39.getId()));

        System.out.println("номер клетки 40 " + String.valueOf(bt_40.getId()));
        System.out.println("номер клетки 41 " + String.valueOf(bt_41.getId()));
        System.out.println("номер клетки 42 " + String.valueOf(bt_42.getId()));
        System.out.println("номер клетки 43 " + String.valueOf(bt_43.getId()));
        System.out.println("номер клетки 44 " + String.valueOf(bt_44.getId()));
        System.out.println("номер клетки 45 " + String.valueOf(bt_45.getId()));
        System.out.println("номер клетки 46 " + String.valueOf(bt_46.getId()));
        System.out.println("номер клетки 47 " + String.valueOf(bt_47.getId()));
        System.out.println("номер клетки 48 " + String.valueOf(bt_48.getId()));
        System.out.println("номер клетки 49 " + String.valueOf(bt_49.getId()));

        System.out.println("номер клетки 50 " + String.valueOf(bt_50.getId()));
        System.out.println("номер клетки 51 " + String.valueOf(bt_51.getId()));
        System.out.println("номер клетки 52 " + String.valueOf(bt_52.getId()));
        System.out.println("номер клетки 53 " + String.valueOf(bt_53.getId()));
        System.out.println("номер клетки 54 " + String.valueOf(bt_54.getId()));
        System.out.println("номер клетки 55 " + String.valueOf(bt_55.getId()));
        System.out.println("номер клетки 56 " + String.valueOf(bt_56.getId()));
        System.out.println("номер клетки 57 " + String.valueOf(bt_57.getId()));
        System.out.println("номер клетки 58 " + String.valueOf(bt_58.getId()));
        System.out.println("номер клетки 59 " + String.valueOf(bt_59.getId()));

        System.out.println("номер клетки 60 " + String.valueOf(bt_60.getId()));
        System.out.println("номер клетки 61 " + String.valueOf(bt_61.getId()));
        System.out.println("номер клетки 62 " + String.valueOf(bt_62.getId()));
        System.out.println("номер клетки 63 " + String.valueOf(bt_63.getId()));
        System.out.println("номер клетки 64 " + String.valueOf(bt_64.getId()));



        //Resources res = getResources();
        //Drawable bblue1 = ResourcesCompat.getDrawable(res, R.drawable.bblue1, null);



        Intent intent = getIntent();
        Integer mode = intent.getIntExtra("mode", 0);
        Integer players = intent.getIntExtra("player", 0);
        Integer map = intent.getIntExtra("map", 0);

        Log.d("mode", String.valueOf(mode));
        Log.d("players", String.valueOf(players));
        Log.d("map", String.valueOf(map));

    }
    // просто нажимаем любую кнопку + находим по тегу
    @Override
    public boolean onTouch(View v, MotionEvent event) {


        ImageButton bt = (ImageButton) findViewById(v.getId());


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

        //Прописываем изменения кнопки
        if ((cell.player[yy][xx] == 1) && (shot % 2 == 1)) {
            //cell.lastplayer[yy][xx] = cell.player[yy][xx];
            if (cell.cellsmas[yy][xx] == 1) {
                bt.setImageResource(R.drawable.bblue2);
                cell.cellsmas[yy][xx] = 2;
                //cell.lastcellsmas[yy][xx] = 2;
                System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);

            }
            else if (cell.cellsmas[yy][xx] == 2) {
                bt.setImageResource(R.drawable.bblue3);
                cell.cellsmas[yy][xx] = 3;
                //cell.lastcellsmas[yy][xx] = 3;
                System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
            }
            else if (cell.cellsmas[yy][xx] == 3) {
                cell.cellsmas[yy][xx] = 4;
                //cell.lastcellsmas[yy][xx] = 4;
                System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
                Log.d("ggg", "запустился paintobjects()");
                bt.setImageResource(R.drawable.bblue4);
                //paintobjects();
                paintcells = true;
                speed = true;
                //doWork();

            }
        }
        if ((cell.player[yy][xx] == 2) && (shot % 2 == 0)) {
            //cell.lastplayer[yy][xx] = cell.player[yy][xx];
            if (cell.cellsmas[yy][xx] == 1) {
                bt.setImageResource(R.drawable.bgreen2);
                cell.cellsmas[yy][xx] = 2;
                //cell.lastcellsmas[yy][xx] = 2;
                System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
            }
            else if (cell.cellsmas[yy][xx] == 2) {
                bt.setImageResource(R.drawable.bgreen3);
                cell.cellsmas[yy][xx] = 3;
                //cell.lastcellsmas[yy][xx] = 3;
                System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
            }
            else if (cell.cellsmas[yy][xx] == 3) {
                cell.cellsmas[yy][xx] = 4;
                //cell.lastcellsmas[yy][xx] = 4;
                System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
                Log.d("ggg", "запустился paintobjects()");
                bt.setImageResource(R.drawable.bgreen4);
                //paintobjects();
                paintcells = true;
                speed = true;
                //doWork();

            }
        }
        if ((cell.cellsmas[yy][xx]==0) && (shot  == 1)) {
            bt.setImageResource(R.drawable.bblue1);
            cell.cellsmas[yy][xx] = 1;
            //cell.lastcellsmas[yy][xx] = 1;
            System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
            cell.player[yy][xx] = 1;
            //cell.lastplayer[yy][xx] = cell.player[yy][xx];
        }
        if ((cell.cellsmas[yy][xx]==0) && (shot == 2))  {
            bt.setImageResource(R.drawable.bgreen1);
            cell.cellsmas[yy][xx] = 1;
            //cell.lastcellsmas[yy][xx] = 1;
            System.out.println("cellmass["+yy+"]["+xx+"] = " + cell.cellsmas[yy][xx]);
            cell.player[yy][xx] = 2;
            //cell.lastplayer[yy][xx] = cell.player[yy][xx];
        }

        // Log.d("ggg", "запустился paintobjects()");

        //может ли  игрок походить на данную  клетку

        if ((shot % 2 != 0) && (cell.player[yy][xx] == 1)) {

            if (clickbuttonn < 1) {
                System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                clickbuttonn++;
                shot ++;
                System.out.println("Какой игрок-" + shot);
            } else if ((cell.player[yy][xx] == 2) || (cell.cellsmas[yy][xx] == 0)) {

            } else {
                System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                cell.player[yy][xx] = 1;
                shot ++;
                clickbutton++;
                System.out.println("Какой игрок-" + shot);
            }


        }
        if ((shot % 2 == 0) && (cell.player[yy][xx] == 2)) {

            if (clickbuttonn < 2) {
                System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                clickbuttonn++;
                shot++;
                System.out.println("Какой игрок-" + shot);
            } else if ( (cell.player[yy][xx] == 1) || (cell.cellsmas[yy][xx] == 0)) {

            } else {
                System.out.println("Значение клетки-" + cell.cellsmas[yy][xx]);
                cell.player[yy][xx] = 2;
                shot++;
                clickbutton++;
                System.out.println("Какой игрок-" + shot);
            }

        }
        return true;


    }

    // для перерисовки после хода


        public Integer NumOut (Integer i, Integer j, Integer razm){
            Integer k = 0;
            if ((i + j * razm) >= 22)  {
                k = 1;
            }
            if ((i + j * razm) >= 33)  {
                k = 2;
            }
            if ((i + j * razm) >= 44)  {
                k = 3;
            }
            if ((i + j * razm) >= 55)  {
                k = 4;
            }
            return startid + j + (i * razm) + k;
        }
    /*
    public void doWork() {
            //Handler handler = new Handler();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {

                        try {
                            TimeUnit.SECONDS.sleep(5);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        Log.d("ggg", "запустился doInBackground");
                        if (paintcells == true) {
                            Log.d("ggg", "запустился поток");

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
                                if (((shot % 2 == 0) && (cell.player[yy][xx] == 1)) || ((shot % 2 != 0) && (cell.player[yy][xx] == 2))) {
                                    if ((clickbutton <= 2) && (num != nump) && (shotp != shot)) {
                                        clickbutton++;
                                        // System.out.println();
                                        //System.out.println("Кнопка    " + clickbutton);
                                        cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;
                                    } else if ((num == nump) || (cell.cellsmas[yy][xx] == 0) || (shotp == shot)) {

                                        // System.out.println();
                                        // System.out.println("Кнопка    " + clickbutton);
                                    } else if (shotp != shot) {
                                        cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;

                                    }
                                }


                            }
                            for (int i = 0; i < 8; i++) {
                                for (int j = 0; j < 8; j++) {

                                    ImageButton bt = findViewById(NumOut(i, j, razm));
                                    //paintobjects();

                                    if (cell.cellsmas[i][j] == 0) {

                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));

                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));

                                        bt.setImageResource(R.drawable.emptycell);

                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));

                                    }

                                    if (cell.cellsmas[i][j] == 1) {
                                        if (cell.player[i][j] == 1) {

                                            bt.setImageResource(R.drawable.bblue1);
                                            Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                            System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                        } else if (cell.player[i][j] == 2) {

                                            bt.setImageResource(R.drawable.bgreen1);
                                            Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                            System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                                        }


                                    }

                                    if (cell.cellsmas[i][j] == 2) {
                                        if (cell.player[i][j] == 1) {

                                            bt.setImageResource(R.drawable.bblue2);
                                            Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                            System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                        } else if (cell.player[i][j] == 2) {

                                            bt.setImageResource(R.drawable.bgreen2);
                                            Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                            System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                        }
                                    }
                                    if (cell.cellsmas[i][j] == 3) {
                                        if (cell.player[i][j] == 1) {

                                            bt.setImageResource(R.drawable.bblue3);
                                            Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                            System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                        } else if (cell.player[i][j] == 2) {

                                            bt.setImageResource(R.drawable.bgreen3);
                                            Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                            System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                        }
                                    }


                                    if ((cell.cellsmas[i][j] == 4) || (cell.cellsmas[i][j] == 5) || (cell.cellsmas[i][j] == 6) || (cell.cellsmas[i][j] == 7) || (cell.cellsmas[i][j] == 8)) { // Значение 8 вроде не может быть
                                        cell.cellsmas[i][j] = 0;
                                        try {
                                            sleep(500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        //bt.setImageResource(R.drawable.emptycell);
                                        playerp = cell.player[i][j];
                                        //paintobjects();
                                        System.out.println("playerp " + playerp);
                                        cell.player[i][j] = 0;
                                        trigger = true;
                                        if (playerp == 1) {
                                            if (i > 0) {
                                                cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                                cell.player[i - 1][j] = 1;
                                            }
                                            if (i < 7) {
                                                cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                                cell.player[i + 1][j] = 1;
                                            }
                                            if (j < 7) {
                                                cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                                cell.player[i][j + 1] = 1;
                                            }
                                            if (j > 0) {
                                                cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                                cell.player[i][j - 1] = 1;
                                            }
                                        }
                                        if (playerp == 2) {
                                            if (i > 0) {
                                                cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                                cell.player[i - 1][j] = 2;
                                            }
                                            if (i < 7) {
                                                cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                                cell.player[i + 1][j] = 2;
                                            }
                                            if (j < 7) {
                                                cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                                cell.player[i][j + 1] = 2;
                                            }
                                            if (j > 0) {
                                                cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                                cell.player[i][j - 1] = 2;
                                            }
                                        }


                                        try {
                                            sleep(500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        if (speed == true) {
                                            speed = false; // Эта переменная не дает программе считать очки, пока не пройдет рисовка
                                        }
                                        //paintobjects();


                                    }
                                }
                            }
                            paintcells = false;
                        }
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //paintobjects
                    }
                }
            }).start();
        }
    */
    private class MyAsyncTask extends AsyncTask<Integer, Integer,Void> {
        private WeakReference <PlayingField> PlayingField;

        void setPlayingField (WeakReference <PlayingField> PlayingField) {
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

                Log.d("ggg", "запустился doInBackground");
                if (paintcells == true) {
                    Log.d("ggg", "запустился поток");

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
                        if (((shot % 2 == 0) && (cell.player[yy][xx] == 1)) || ((shot % 2 != 0) && (cell.player[yy][xx] == 2))) {
                            if ((clickbutton <= 2) && (num != nump) && (shotp != shot)) {
                                clickbutton++;
                                // System.out.println();
                                //System.out.println("Кнопка    " + clickbutton);
                                cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;
                            } else if ((num == nump) || (cell.cellsmas[yy][xx] == 0) || (shotp == shot)) {

                                // System.out.println();
                                // System.out.println("Кнопка    " + clickbutton);
                            } else if (shotp != shot) {
                                cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;

                            }
                        }
                        return null;
                    }
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {

                            ImageButton bt = findViewById(NumOut(i, j, razm));

                            if ((cell.cellsmas[i][j] == 4) || (cell.cellsmas[i][j] == 5) || (cell.cellsmas[i][j] == 6) || (cell.cellsmas[i][j] == 7) || (cell.cellsmas[i][j] == 8)) { // Значение 8 вроде не может быть
                                cell.cellsmas[i][j] = 0;
                                try {
                                    sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                //bt.setImageResource(R.drawable.emptycell);
                                playerp = cell.player[i][j];
                                //paintobjects();
                                System.out.println("playerp " + playerp);
                                cell.player[i][j] = 0;
                                trigger = true;
                                if (playerp == 1) {
                                    if (i > 0) {
                                        cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                        cell.player[i - 1][j] = 1;
                                    }
                                    if (i < 7) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 1;
                                    }
                                    if (j < 7) {
                                        cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                        cell.player[i][j + 1] = 1;
                                    }
                                    if (j > 0) {
                                        cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                        cell.player[i][j - 1] = 1;
                                    }
                                }
                                if (playerp == 2) {
                                    if (i > 0) {
                                        cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                        cell.player[i - 1][j] = 2;
                                    }
                                    if (i < 7) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 2;
                                    }
                                    if (j < 7) {
                                        cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                        cell.player[i][j + 1] = 2;
                                    }
                                    if (j > 0) {
                                        cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                        cell.player[i][j - 1] = 2;
                                    }
                                }


                                try {
                                    sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                if (speed == true) {
                                    speed = false; // Эта переменная не дает программе считать очки, пока не пройдет рисовка
                                }
                                //paintobjects();


                            }
                        }
                    }
                    paintcells = false;
                    publishProgress((int) (num));

                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //paintobjects
            }


        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        //protected void onProgressUpdate(Integer... values) {
        //    super.onProgressUpdate(values);
            while (true) {


                    Log.d("ggg", "запустился onPostExecute");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {


                                ImageButton bt = findViewById(NumOut(i, j, razm));
                                Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));

                                //paintobjects();

                                if (cell.cellsmas[i][j] == 0) {


                                   //bt.setImageResource(R.drawable.emptycell);
                                    bt.setImageResource(R.drawable.settings);

                                    Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));

                                }
                                if (cell.cellsmas[i][j] == 1) {
                                    if (cell.player[i][j] == 1) {

                                        bt.setImageResource(R.drawable.bblue1);
                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                        System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                    } else if (cell.player[i][j] == 2) {

                                        bt.setImageResource(R.drawable.bgreen1);
                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                        System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);
                                    }


                                }
                                if (cell.cellsmas[i][j] == 2) {
                                    if (cell.player[i][j] == 1) {

                                        bt.setImageResource(R.drawable.bblue2);
                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                        System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                    } else if (cell.player[i][j] == 2) {

                                        bt.setImageResource(R.drawable.bgreen2);
                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                        System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                    }
                                }
                                if (cell.cellsmas[i][j] == 3) {
                                    if (cell.player[i][j] == 1) {

                                        bt.setImageResource(R.drawable.bblue3);
                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                        System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                    } else if (cell.player[i][j] == 2) {

                                        bt.setImageResource(R.drawable.bgreen3);
                                        Log.d("ggg", String.valueOf(NumOut(i, j, razm) - startid));
                                        System.out.println("cellmass[" + i + "][" + j + "] = " + cell.cellsmas[i][j]);

                                    }
                                }

                        }
                    }

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                paintcells = false;
            }
        }
    }

        /*
    class MyTask extends AsyncTask<Void,Void,Void> {
        @Override
        protected void run() {
            while(true) {
                if (paintcells == true) {
                    Log.d("ggg", "Тест");

                    if (speed==false) {
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
                        if (((shot%2==0)&&(cell.player[yy][xx]==1))||((shot%2!=0)&&(cell.player[yy][xx]==2)))
                        {
                            if ((clickbutton <= 2)&&(num != nump)&&(shotp!=shot)) {
                                clickbutton++;
                                // System.out.println();
                                //System.out.println("Кнопка    " + clickbutton);
                                cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;
                            } else if ((num == nump) || (cell.cellsmas[yy][xx] == 0)||(shotp==shot)) {

                                // System.out.println();
                                // System.out.println("Кнопка    " + clickbutton);
                            } else if (shotp!=shot){
                                cell.cellsmas[yy][xx] = cell.cellsmas[yy][xx] + 1;

                            }
                        }


                    }
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (cell.cellsmas[i][j] == 0) {

                                xxx = i;
                                yyy = j;
                                paintComponent();

                            }
                            if (cell.cellsmas[i][j] == 1) {

                                xxx = i;
                                yyy = j;
                                paintComponent();


                            }
                            if (cell.cellsmas[i][j] == 2) {

                                xxx = i;
                                yyy = j;
                                paintComponent();


                            }
                            if (cell.cellsmas[i][j] == 3) {
                                xxx = i;
                                yyy = j;
                                paintComponent();
                            }
                            if ((cell.cellsmas[i][j] == 4)||(cell.cellsmas[i][j] == 5)||(cell.cellsmas[i][j] == 6)||(cell.cellsmas[i][j] == 7)||(cell.cellsmas[i][j] == 8)) { // Значение 8 вроде не может быть
                                cell.cellsmas[i][j] = 0;
                                playerp=cell.player[i][j];
                                paintComponent();
                                System.out.println(playerp);
                                cell.player[i][j]=0;
                                trigger=true;
                                if (playerp==1) {
                                    if (i > 0) {
                                        cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                        cell.player[i - 1][j] = 1;
                                    }
                                    if (i < 4) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 1;
                                    }
                                    if (j < 4) {
                                        cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                        cell.player[i][j+1] = 1;
                                    }
                                    if (j > 0) {
                                        cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                        cell.player[i][j-1] = 1;
                                    }
                                }
                                if (playerp==2) {
                                    if (i > 0) {
                                        cell.cellsmas[i - 1][j] = cell.cellsmas[i - 1][j] + 1;
                                        cell.player[i - 1][j] = 2;
                                    }
                                    if (i < 4) {
                                        cell.cellsmas[i + 1][j] = cell.cellsmas[i + 1][j] + 1;
                                        cell.player[i + 1][j] = 2;
                                    }
                                    if (j < 4) {
                                        cell.cellsmas[i][j + 1] = cell.cellsmas[i][j + 1] + 1;
                                        cell.player[i][j+1] = 2;
                                    }
                                    if (j > 0) {
                                        cell.cellsmas[i][j - 1] = cell.cellsmas[i][j - 1] + 1;
                                        cell.player[i][j-1] = 2;
                                    }
                                }

                                /*
                                 * Следующая конструкция тормозит деление клеток
                                 */
/*
                                try {
                                    sleep(500);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                if (speed==true)
                                {
                                    speed=false; // Эта переменная не дает программе считать очки, пока не пройдет рисовка
                                }
                                paintComponent();
                            }
                        }
                    }
                    paintcells = false;
                }

                paintComponent();

            }
        }

    }
    //mainHandler.post(myRunnable);
*/


    }
