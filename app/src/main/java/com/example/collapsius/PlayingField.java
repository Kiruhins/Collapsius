package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayingField extends AppCompatActivity implements View.OnClickListener {

    int[][] cellsmas= new int[5][5];
    int[][] player= new int[5][5];
    Cells cell;
    public void addButtons(){
        // Это встроенный метод в Java, который перерисует все объекты в окне(если его не прописывать, то объекты не будут видны(в нашем случае это кнопки))
        for (int j = 0; j < cell.cellsmas.length; j++) {
            for (int i = 0; i < cell.cellsmas[j].length; i++) {
                //Button b.findViewById(R.id.bt_classic);

            }
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_field);

        cell = new Cells(cellsmas, player);
    }

    @Override
    public void onClick(View view) {

    }
}
class Cells {
    public int[][] cellsmas;
    public int[][] player;
    public int i=0;


    public Cells(int[][] cellmass,int[][] player){
        this.cellsmas=cellmass;
        this.player=player;
    }

}