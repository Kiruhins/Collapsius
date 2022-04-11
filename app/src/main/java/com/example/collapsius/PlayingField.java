package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    @Override
    public void onClick(View view) {

    }
}
