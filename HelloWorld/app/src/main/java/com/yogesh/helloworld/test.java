package com.yogesh.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class test extends AppCompatActivity {

    private int teamAScore;
    private int teamBScore;
    private TextView teamATextViewScore;
    private TextView teamBTextViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        teamATextViewScore = findViewById(R.id.test_a_score);
        teamBTextViewScore = findViewById(R.id.team_b_score);
    }
    public void updateForTeamAPoint3(View view){
        teamAScore = teamAScore + 3;
        displayScoreTeamA(teamAScore);
    }
    public void updateForTeamBPoint3(View view){
        teamBScore = teamBScore + 3;
        displayScoreTeamB(teamBScore);
    }
    public void displayScoreTeamA(int score){
        teamATextViewScore.setText(String.valueOf(score));
    }
    public void displayScoreTeamB(int score){
        teamBTextViewScore.setText(String.valueOf(score));
    }
}
