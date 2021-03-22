package android.example.com;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score,corner  for Team A
    int goalTeamA = 0;
    int cornerTeamA = 0;


    // Tracks the score and corner for Team B
    int goalTeamB = 0;
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the goal for Team A by 1 point.
     */
    public void addOneGoalTeamA(View v) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * Increase the corner for Team A by 1 point.
     */
    public void addOneCornerForTeamA(View v) {
        cornerTeamA= cornerTeamA + 1;
        displayCornerForTeamA(cornerTeamA);
    }



    /**
     * Increase the goal for Team B by 1 point.
     */
    public void addOneGoalForTeamB(View v) {
       goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB );
    }

    /**
     * Increase the corner for Team B by 1 point.
     */
    public void addOneCornerForTeamB(View v) {
        cornerTeamB = cornerTeamB + 1;
        displayCornerForTeamB(cornerTeamB);
    }



    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        goalTeamA = 0;
        goalTeamB = 0;
        cornerTeamA =0;
        cornerTeamB =0;
        displayGoalForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayCornerForTeamA(cornerTeamA);
        displayCornerForTeamB(cornerTeamB);
    }

    /**
     * Displays the given goal for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given corner for Team A.
     */
    public void displayCornerForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given goal for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Team B.
     */
    public void displayCornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }
}


