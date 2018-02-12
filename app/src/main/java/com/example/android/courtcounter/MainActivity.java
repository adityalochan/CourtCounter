package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 8;
    int scoreTeamB = 12;
    int scoreTeamC = 9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamC(scoreTeamC);
    }

    public void displayForTeamA(int number){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(number));
    }

    public void displayForTeamB(int number){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(number));
    }

    public void displayForTeamC(int number){
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(number));
    }

    public void ButtonA1(View view){
        scoreTeamA +=3;
        displayForTeamA(scoreTeamA);
    }

    public void ButtonA2(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    public void ButtonA3(View view){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void ResetButton(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamC = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamC(scoreTeamC);
    }

    public void ButtonB1(View view){
        scoreTeamB +=3;
        displayForTeamB(scoreTeamB);
    }

    public void ButtonB2(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    public void ButtonB3(View view){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    public void ButtonC1(View view){
        scoreTeamC +=3;
        displayForTeamC(scoreTeamC);
    }

    public void ButtonC2(View view){
        scoreTeamC +=2;
        displayForTeamC(scoreTeamC);
    }

    public void ButtonC3(View view){
        scoreTeamC +=1;
        displayForTeamC(scoreTeamC);
    }
}
