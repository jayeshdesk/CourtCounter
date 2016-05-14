package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ascore = 0;
    int bscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void aplus3(View view) {
        ascore= ascore+3;
        updateAScore();
    }

    public void aplus2(View view) {
        ascore= ascore+2;
        updateAScore();
    }

    public void aplus1(View view) {
        ascore= ascore+1;
        updateAScore();
    }

    public void updateAScore() {
        TextView tvAScore = (TextView) findViewById(R.id.ascore);
        tvAScore.setText(String.valueOf(ascore));
    }

    public void bplus3(View view) {
        bscore= bscore+3;
        updateBScore();
    }

    public void bplus2(View view) {
        view.getTag()
        bscore= bscore+2;
        updateBScore();
    }

    public void bplus1(View view) {
        bscore= bscore+1;
        updateBScore();
    }

    public void updateBScore() {
        TextView tvBScore = (TextView) findViewById(R.id.bscore);
        tvBScore.setText(""+bscore);
    }

    public void resetScore(View view) {
        ascore=0;
        bscore=0;
        updateAScore();
        updateBScore();
    }

}
