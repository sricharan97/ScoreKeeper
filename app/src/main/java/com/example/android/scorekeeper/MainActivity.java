package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Global variables

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;
    int ballsA = 60;
    int ballsB = 60;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the score and number of wickets fallen so far for Team A.
     */

    public void displayTeamAScore() {
        TextView scoreText = findViewById(R.id.team_a_score);
        scoreText.setText(String.valueOf(scoreTeamA));
        TextView wicketText = findViewById(R.id.team_a_wickets);
        wicketText.setText(String.valueOf(wicketsTeamA));

    }

    /**
     * This method displays the score and number of wickets fallen so far for Team B.
     */

    public void displayTeamBScore() {
        TextView scoreText = findViewById(R.id.team_b_score);
        scoreText.setText(String.valueOf(scoreTeamB));
        TextView wicketsText = findViewById(R.id.team_b_wickets);
        wicketsText.setText(String.valueOf(wicketsTeamB));

    }

    /**
     * This method resets the scores of both teams to default values(zeroes in this case)
     */

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        ballsB = 60;
        ballsA = 60;

        TextView oversViewA = findViewById(R.id.overs_A);
        oversViewA.setText(R.string.total_overs);
        TextView oversViewB = findViewById(R.id.overs_B);
        oversViewB.setText(R.string.total_overs);

        displayTeamAScore();
        displayTeamBScore();
    }

    //Methods for user inputs - Button code

    /**
     * This method increments the score of the team A by 1
     */

    public void addOneTeamA(View view) {
        displayOversA();

        if (ballsA <= 0) {
            return;
        }
        if (wicketsTeamA == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 1;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team A by 2
     */

    public void addTwoTeamA(View view) {
        displayOversA();
        if (ballsA <= 0) {
            return;
        }

        if (wicketsTeamA == 10) {
            Toast.makeText(this,  R.string.all_out , Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 2;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team A by 4
     */

    public void addFourTeamA(View view) {
        displayOversA();
        if (ballsA <= 0) {
            return;
        }
        if (wicketsTeamA == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 4;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team A by 6
     */

    public void addSixTeamA(View view) {
        displayOversA();
        if (ballsA <= 0) {
            return;
        }

        if (wicketsTeamA == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA += 6;
        displayTeamAScore();
    }

    /**
     * This method increments the wickets fallen to one for Team A
     */

    public void fallOfWicketA(View view) {
        displayOversA();
        if (ballsA <= 0) {
            return;
        }

        if (wicketsTeamA == 10) {
            Toast.makeText(this, R.string.wickets_fallen_A, Toast.LENGTH_SHORT).show();
            return;
        }
        wicketsTeamA += 1;
        displayTeamAScore();
    }

    /**
     * This method increments the score of the team B by 1
     */

    public void addOneTeamB(View view) {
        displayOversB();
        if (ballsB <= 0) {
            return;
        }
        if (wicketsTeamB == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB += 1;
        displayTeamBScore();
    }

    /**
     * This method increments the score of the team B by 2
     */

    public void addTwoTeamB(View view) {

        displayOversB();

        if (ballsB <= 0) {
            return;
        }
        if (wicketsTeamB == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }

        scoreTeamB += 2;
        displayTeamBScore();
    }

    /**
     * This method increments the score of the team B by 4
     */

    public void addFourTeamB(View view) {

        displayOversB();
        if (ballsB <= 0) {
            return;
        }
        if (wicketsTeamB == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB += 4;
        displayTeamBScore();
    }

    /**
     * This method increments the score of the team B by 6
     */

    public void addSixTeamB(View view) {

        displayOversB();

        if (ballsB <= 0) {
            return;
        }

        if (wicketsTeamB == 10) {
            Toast.makeText(this, R.string.all_out, Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB += 6;
        displayTeamBScore();
    }

    /**
     * This method increments the wickets fallen to one for Team B
     */

    public void fallOfWicketB(View view) {

        displayOversB();

        if (ballsB <= 0) {
            return;
        }

        if (wicketsTeamB == 10) {
            Toast.makeText(this, R.string.wickets_fallen_B, Toast.LENGTH_SHORT).show();
            return;
        }
        wicketsTeamB += 1;
        displayTeamBScore();
    }

    /**
     * This method calculates the number of overs left for the teamA and displays it
     */

    public void displayOversA() {

        if (ballsA <= 0) {
            Toast.makeText(this, R.string.overs_finished_msg, Toast.LENGTH_SHORT).show();
            return;
        } else {

            ballsA--;
            int over = ballsA / 6;
            int ball = ballsA % 6;
            String oversA = over + "." + ball;
            TextView oversATextView = findViewById(R.id.overs_A);
            oversATextView.setText(oversA);
        }

    }

    /**
     * This method calculates the number of overs left for the teamB and displays it
     */

    public void displayOversB() {

        if (ballsB <= 0) {
            Toast.makeText(this, R.string.overs_finished_msg, Toast.LENGTH_SHORT).show();
            return;
        } else {

            ballsB--;
            int over = ballsB / 6;
            int ball = ballsB % 6;
            String oversB = over + "." + ball;
            TextView oversBTextView = findViewById(R.id.overs_B);
            oversBTextView.setText(oversB);
        }

    }


}
