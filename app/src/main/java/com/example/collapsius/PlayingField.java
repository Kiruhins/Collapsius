package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

class Cells {
    public int[][] cellsmas;
    public int[][] player;


    public Cells(int[][] cellmass,int[][] player){
        this.cellsmas=cellmass;
        this.player=player;
    }

}


public class PlayingField extends AppCompatActivity implements View.OnClickListener {

    int[][] cellsmas= new int[8][8];
    int[][] player= new int[8][8];
    Cells cell;

    Integer xxx=0;
    Integer yyy=0;
    Integer shot=1;
    Integer shotp=0;
    Boolean trigger=false;
    Integer clickbuttonn=0;
    Boolean speed=false;
    Integer num=25;
    Integer nump=0;
    Integer playerp=0;
    Integer clickbutton=0;

    private ImageButton bt_1;
    private ImageButton bt_2;
    private ImageButton bt_3;
    private ImageButton bt_4;
    private ImageButton bt_5;
    private ImageButton bt_6;
    private ImageButton bt_7;
    private ImageButton bt_8;
    private ImageButton bt_9;
    private ImageButton bt_10;
    private ImageButton bt_11;
    private ImageButton bt_12;
    private ImageButton bt_13;
    private ImageButton bt_14;
    private ImageButton bt_15;
    private ImageButton bt_16;
    private ImageButton bt_17;
    private ImageButton bt_18;
    private ImageButton bt_19;
    private ImageButton bt_20;
    private ImageButton bt_21;
    private ImageButton bt_22;
    private ImageButton bt_23;
    private ImageButton bt_24;
    private ImageButton bt_25;
    private ImageButton bt_26;
    private ImageButton bt_27;
    private ImageButton bt_28;
    private ImageButton bt_29;
    private ImageButton bt_30;
    private ImageButton bt_31;
    private ImageButton bt_32;
    private ImageButton bt_33;
    private ImageButton bt_34;
    private ImageButton bt_35;
    private ImageButton bt_36;
    private ImageButton bt_37;
    private ImageButton bt_38;
    private ImageButton bt_39;
    private ImageButton bt_40;
    private ImageButton bt_41;
    private ImageButton bt_42;
    private ImageButton bt_43;
    private ImageButton bt_44;
    private ImageButton bt_45;
    private ImageButton bt_46;
    private ImageButton bt_47;
    private ImageButton bt_48;
    private ImageButton bt_49;
    private ImageButton bt_50;
    private ImageButton bt_51;
    private ImageButton bt_52;
    private ImageButton bt_53;
    private ImageButton bt_54;
    private ImageButton bt_55;
    private ImageButton bt_56;
    private ImageButton bt_57;
    private ImageButton bt_58;
    private ImageButton bt_59;
    private ImageButton bt_60;
    private ImageButton bt_61;
    private ImageButton bt_62;
    private ImageButton bt_63;
    private ImageButton bt_64;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_field);

        cell = new Cells(cellsmas, player);

        for (int i=0;i<cell.cellsmas.length;++i){
            for (int j=0;j<cell.cellsmas.length;++j){
                cell.cellsmas[i][j]=0;
                cell.player[i][j]=0;
            }
        }

        bt_1 = findViewById(R.id.bt_1);
        bt_1.setOnClickListener(this);
        bt_2 = findViewById(R.id.bt_2);
        bt_2.setOnClickListener(this);
        bt_3 = findViewById(R.id.bt_3);
        bt_3.setOnClickListener(this);
        bt_4 = findViewById(R.id.bt_4);
        bt_4.setOnClickListener(this);
        bt_5 = findViewById(R.id.bt_5);
        bt_5.setOnClickListener(this);
        bt_6 = findViewById(R.id.bt_6);
        bt_6.setOnClickListener(this);
        bt_7 = findViewById(R.id.bt_7);
        bt_7.setOnClickListener(this);
        bt_8 = findViewById(R.id.bt_8);
        bt_8.setOnClickListener(this);
        bt_9 = findViewById(R.id.bt_9);
        bt_9.setOnClickListener(this);
        bt_10 = findViewById(R.id.bt_10);
        bt_10.setOnClickListener(this);
        bt_11 = findViewById(R.id.bt_11);
        bt_11.setOnClickListener(this);
        bt_12 = findViewById(R.id.bt_12);
        bt_12.setOnClickListener(this);
        bt_13 = findViewById(R.id.bt_13);
        bt_13.setOnClickListener(this);
        bt_14 = findViewById(R.id.bt_14);
        bt_14.setOnClickListener(this);
        bt_15 = findViewById(R.id.bt_15);
        bt_15.setOnClickListener(this);
        bt_16 = findViewById(R.id.bt_16);
        bt_16.setOnClickListener(this);
        bt_17 = findViewById(R.id.bt_17);
        bt_17.setOnClickListener(this);
        bt_18 = findViewById(R.id.bt_18);
        bt_18.setOnClickListener(this);
        bt_19 = findViewById(R.id.bt_19);
        bt_19.setOnClickListener(this);
        bt_20 = findViewById(R.id.bt_20);
        bt_20.setOnClickListener(this);
        bt_21 = findViewById(R.id.bt_21);
        bt_21.setOnClickListener(this);
        bt_22 = findViewById(R.id.bt_22);
        bt_22.setOnClickListener(this);
        bt_23 = findViewById(R.id.bt_23);
        bt_23.setOnClickListener(this);
        bt_24 = findViewById(R.id.bt_24);
        bt_24.setOnClickListener(this);
        bt_25 = findViewById(R.id.bt_25);
        bt_25.setOnClickListener(this);
        bt_26 = findViewById(R.id.bt_26);
        bt_26.setOnClickListener(this);
        bt_27 = findViewById(R.id.bt_27);
        bt_27.setOnClickListener(this);
        bt_28 = findViewById(R.id.bt_28);
        bt_28.setOnClickListener(this);
        bt_29 = findViewById(R.id.bt_29);
        bt_29.setOnClickListener(this);
        bt_30 = findViewById(R.id.bt_30);
        bt_30.setOnClickListener(this);
        bt_31 = findViewById(R.id.bt_31);
        bt_31.setOnClickListener(this);
        bt_32 = findViewById(R.id.bt_32);
        bt_32.setOnClickListener(this);
        bt_33 = findViewById(R.id.bt_33);
        bt_33.setOnClickListener(this);
        bt_34 = findViewById(R.id.bt_34);
        bt_34.setOnClickListener(this);
        bt_35 = findViewById(R.id.bt_35);
        bt_35.setOnClickListener(this);
        bt_36 = findViewById(R.id.bt_36);
        bt_36.setOnClickListener(this);
        bt_37 = findViewById(R.id.bt_37);
        bt_37.setOnClickListener(this);
        bt_38 = findViewById(R.id.bt_38);
        bt_38.setOnClickListener(this);
        bt_39 = findViewById(R.id.bt_39);
        bt_39.setOnClickListener(this);
        bt_40 = findViewById(R.id.bt_40);
        bt_40.setOnClickListener(this);
        bt_41 = findViewById(R.id.bt_41);
        bt_41.setOnClickListener(this);
        bt_42 = findViewById(R.id.bt_42);
        bt_42.setOnClickListener(this);
        bt_43 = findViewById(R.id.bt_43);
        bt_43.setOnClickListener(this);
        bt_44 = findViewById(R.id.bt_44);
        bt_44.setOnClickListener(this);
        bt_45 = findViewById(R.id.bt_45);
        bt_45.setOnClickListener(this);
        bt_46 = findViewById(R.id.bt_46);
        bt_46.setOnClickListener(this);
        bt_47 = findViewById(R.id.bt_47);
        bt_47.setOnClickListener(this);
        bt_48 = findViewById(R.id.bt_48);
        bt_48.setOnClickListener(this);
        bt_49 = findViewById(R.id.bt_49);
        bt_49.setOnClickListener(this);
        bt_50 = findViewById(R.id.bt_50);
        bt_50.setOnClickListener(this);
        bt_51 = findViewById(R.id.bt_51);
        bt_51.setOnClickListener(this);
        bt_52 = findViewById(R.id.bt_52);
        bt_52.setOnClickListener(this);
        bt_53 = findViewById(R.id.bt_53);
        bt_53.setOnClickListener(this);
        bt_54 = findViewById(R.id.bt_54);
        bt_54.setOnClickListener(this);
        bt_55 = findViewById(R.id.bt_55);
        bt_55.setOnClickListener(this);
        bt_56 = findViewById(R.id.bt_56);
        bt_56.setOnClickListener(this);
        bt_57 = findViewById(R.id.bt_57);
        bt_57.setOnClickListener(this);
        bt_58 = findViewById(R.id.bt_58);
        bt_58.setOnClickListener(this);
        bt_59 = findViewById(R.id.bt_59);
        bt_59.setOnClickListener(this);
        bt_60 = findViewById(R.id.bt_60);
        bt_60.setOnClickListener(this);
        bt_61 = findViewById(R.id.bt_61);
        bt_61.setOnClickListener(this);
        bt_62 = findViewById(R.id.bt_62);
        bt_62.setOnClickListener(this);
        bt_63 = findViewById(R.id.bt_63);
        bt_63.setOnClickListener(this);
        bt_64 = findViewById(R.id.bt_64);
        bt_64.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageButton bt=(ImageButton) findViewById(v.getId());

       // String num= String.valueOf(bt.getTag());
        try {
            String numm= (String) bt.getTag();
            num= Integer.valueOf(numm)-1;
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
       // Log.d("ggg", String.valueOf(num));
        System.out.println(String.valueOf(num));

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
        Log.d("ggg", "xx- "+xx+" yy- "+yy);

        if (cell.cellsmas[xx][yy]==0){

            bt.setImageResource(R.drawable.grey1);
            paintComponent();
        }


        if ((shot%2!=0)&&(cell.player[xx][yy]!=2))
        {


            if(clickbuttonn<1)
            {
                clickbuttonn++;
                cell.player[xx][yy] = 1;
                shot++;
                System.out.println("Какой игрок-"+shot);
            }
            else if ((num==nump)||(cell.player[xx][yy]==2)||(cell.cellsmas[xx][yy]==0))
            {

            }
            else
            {

                cell.player[xx][yy] = 1;
                shot++;
                clickbutton++;
                System.out.println("Какой игрок-"+shot);
            }


        }
        if ((shot%2==0)&&(cell.player[xx][yy]!=1))
        {

            if (clickbuttonn<2) {
                clickbuttonn++;
                cell.player[xx][yy] = 2;
                shot++;
                System.out.println("Какой игрок-"+shot);
            }
            else if (((num==nump))||(cell.player[xx][yy]==1)||(cell.cellsmas[xx][yy]==0))
            {

            }
            else
            {
                System.out.println("Какая ячейка-"+cell.cellsmas[xx][yy]);
                cell.player[xx][yy] = 2;
                shot++;
                clickbutton++;
                System.out.println("Какой игрок-"+shot);
            }


        }

        /*
        switch (v.getId()) {
            case R.id.myButton1: myTextView.setText("Вы нажали на 1-ю кнопку"); break;
            case R.id.myButton2: myTextView.setText("Вы нажали на 2-ю кнопку"); break;
            case R.id.myButton3: myTextView.setText("Вы нажали на 3-ю кнопку"); break;
        }
        */

    }


    public void paintComponent() {

        //  k = k+1;

        //   System.out.println(k);
        int start=bt_1.getId();
        System.out.println("Какой ID-"+bt_1.getId());
        for (int i=start;i<start+64;i++){
            ImageButton bt=findViewById(i);
            bt.setImageResource(R.drawable.grey1);
        }

        /*
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (cell.cellsmas[i][j] == 0) {
                    ImageButton bt=find
                    img = new ImageIcon("res/0.jpg").getImage();
                    g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);


                }
                if (cell.cellsmas[i][j] == 1) {
                    if (cell.player[i][j]==1) {
                        img = new ImageIcon("res/red1.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        // System.out.println(num);
                    }
                    else if (cell.player[i][j]==2)
                    {
                        img = new ImageIcon("res/blue1.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        //System.out.println(num);
                    }


                }
                if (cell.cellsmas[i][j] == 2) {
                    if (cell.player[i][j]==1) {
                        img = new ImageIcon("res/red2.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        // System.out.println(num);
                    }
                    else if (cell.player[i][j]==2)
                    {
                        img = new ImageIcon("res/blue2.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        // System.out.println(num);
                    }
                }
                if (cell.cellsmas[i][j] == 3) {
                    if (cell.player[i][j]==1) {
                        img = new ImageIcon("res/red3.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        //System.out.println(num);
                    }
                    else if (cell.player[i][j]==2)
                    {
                        img = new ImageIcon("res/blue3.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        //System.out.println(num);
                    }
                }
                if (cell.cellsmas[i][j] == 4) {

                    if (cell.player[i][j]==1) {
                        img = new ImageIcon("res/red4.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        // playerp=cell.player[i][j];
                    }
                    else if (cell.player[i][j]==2)
                    {
                        img = new ImageIcon("res/blue4.jpg").getImage();
                        g.drawImage(img, 30 + i * 53, 30 + j * 53, 53, 53, null);
                        // playerp=cell.player[i][j];
                    }
                    win();
                    speed=true;
                    paintcells=true;
                }
            }
        }


        shotp=shot;

         */
    }


}
