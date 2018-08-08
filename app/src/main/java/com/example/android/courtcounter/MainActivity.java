package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 8;
    int scoreTeamB = 12;
    int scoreTeamC = 9;
    TextView scoreView1;
    TextView scoreView2;
    TextView scoreView3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreView1 = findViewById(R.id.team_a_score);
        scoreView2 = findViewById(R.id.team_b_score);
        scoreView3 = findViewById(R.id.team_c_score);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamC(scoreTeamC);

    }

    public void displayForTeamA(int number) {
        scoreView1.setText(String.valueOf(number));
    }

    public void displayForTeamB(int number) {
        scoreView2.setText(String.valueOf(number));
    }

    public void displayForTeamC(int number) {
        scoreView3.setText(String.valueOf(number));
    }

    public void points3TeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void points2TeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void ResetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamC = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamC(scoreTeamC);
    }

    public void points3TeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void points2TeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void points3TeamC(View view) {
        scoreTeamC += 3;
        displayForTeamC(scoreTeamC);
    }

    public void points2TeamC(View view) {
        scoreTeamC += 2;
        displayForTeamC(scoreTeamC);
    }

    public void freeThrowTeamC(View view) {
        scoreTeamC += 1;
        displayForTeamC(scoreTeamC);
    }
}
