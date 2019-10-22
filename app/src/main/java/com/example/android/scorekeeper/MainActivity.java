package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Global variables

    int scoreTeamA = 0 ;
    int scoreTeamB = 0 ;
    int wicketsTeamA = 0 ;
    int wicketsTeamB = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the score and number of wickets fallen so far for Team A.
     */

    public void displayTeamAScore() {
        TextView scoreText = findViewById(R.id.team_a_score) ;
        scoreText.setText(Integer.toString(scoreTeamA));
        TextView wicketText = findViewById(R.id.team_a_wickets) ;
        wicketText.setText(Integer.toString(wicketsTeamA));
    }

    /**
     * This method displays the score and wickets fallen so far for Team B.
     */

    public void displayTeamBScore() {
        TextView scoreText = findViewById(R.id.team_b_score) ;
        scoreText.setText(Integer.toString(scoreTeamB));
        TextView wicketsText = findViewById(R.id.team_b_wickets) ;
        wicketsText.setText(Integer.toString(wicketsTeamB));
    }

    /**
     * This method resets the scores of both teams to default values(zeroes in this case)
     */

    public void reset(View view) {
        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        wicketsTeamA = 0 ;
        wicketsTeamB = 0 ;

        displayTeamAScore();
        displayTeamBScore();
    }

    //Methods for user inputs - Button code

    /**
     * This method increments the score of the team A by 1
     */

    public void addOneTeamA(View view) {

        if (wicketsTeamA == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 1 ;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team A by 2
     */

    public void addTwoTeamA(View view) {

        if (wicketsTeamA == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 2 ;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team A by 4
     */

    public void addFourTeamA(View view) {

        if (wicketsTeamA == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 4 ;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team A by 6
     */

    public void addSixTeamA(View view) {

        if (wicketsTeamA == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 6 ;
        displayTeamAScore();
    }

    /**
     * This method increments the wickets fallen to one for Team A
     */

    public void fallOfWicketA(View view) {

        if (wicketsTeamA == 10) {
            Toast.makeText(this,"10 wickets have already fallen for Team A", Toast.LENGTH_SHORT).show();
            return ;
        }
        wicketsTeamA += 1 ;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team B by 1
     */

    public void addOneTeamB(View view) {

        if (wicketsTeamB == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB += 1 ;
        displayTeamBScore();
    }

    /**
     * This method increments the score of the team B by 2
     */

    public void addTwoTeamB(View view) {
        if (wicketsTeamB == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }

        scoreTeamB += 2 ;
        displayTeamBScore();
    }

    /**
     * This method increments the score of the team B by 4
     */

    public void addFourTeamB(View view) {
        if (wicketsTeamB == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB += 4 ;
        displayTeamBScore();
    }

    /**
     * This method increments the score of the team B by 6
     */

    public void addSixTeamB(View view) {

        if (wicketsTeamB == 10) {
            Toast.makeText(this,"Your team is all out",Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB += 6 ;
        displayTeamBScore();
    }

    /**
     * This method increments the wickets fallen to one for Team B
     */

    public void fallOfWicketB(View view) {

        if (wicketsTeamB == 10) {
            Toast.makeText(this,"10 wickets have already fallen for Team B", Toast.LENGTH_SHORT).show();
            return ;
        }
        wicketsTeamB += 1 ;
        displayTeamBScore();
    }




}
