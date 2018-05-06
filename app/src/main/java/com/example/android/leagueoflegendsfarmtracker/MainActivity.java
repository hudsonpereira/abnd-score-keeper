package com.example.android.leagueoflegendsfarmtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void siegeMinionForAllies(View view) {
        scoreTeamA = scoreTeamA + 60;
        displayForTeamA(scoreTeamA);
    }

    public void meleeMinionForAllies(View view) {
        scoreTeamA = scoreTeamA + 21;
        displayForTeamA(scoreTeamA);
    }

    public void casterMinionForAllies(View view) {
        scoreTeamA = scoreTeamA + 14;
        displayForTeamA(scoreTeamA);
    }

    public void siegeMinionForEnemies(View view) {
        scoreTeamB = scoreTeamB + 60;
        displayForTeamB(scoreTeamB);
    }

    public void meleeMinionForEnemies(View view) {
        scoreTeamB = scoreTeamB + 21;
        displayForTeamB(scoreTeamB);
    }

    public void casterMinionForEnemies(View view) {
        scoreTeamB = scoreTeamB + 14;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
