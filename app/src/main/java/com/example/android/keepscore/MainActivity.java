package com.example.android.keepscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Track running score team A */
    int runTeamA = 0;
    /* Track running score team B */
    int runTeamB = 0;
    /* Track outs team A */
    int outsTeamA = 0;
    /* Track outs team B */
    int outsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    *  Display running score for team A
    *  */
    public void displayRunTeamA(int run){
        TextView runView = (TextView) findViewById(R.id.team_a_run);
        runView.setText(String.valueOf(run));
    }

    /*
    *  Display running score for team B
    *  */
    public void displayRunTeamB(int run){
        TextView runView = (TextView) findViewById(R.id.team_b_run);
        runView.setText(String.valueOf(run));
    }

    /*
    *  Display outs for team A
    *  */
    public void addOutTeamA(int run){
        TextView runView = (TextView) findViewById(R.id.team_a_outs);
        runView.setText(String.valueOf(run));
    }

    /*
    *  Display outs for team B
    *  */
    public void addOutTeamB(int run){
        TextView runView = (TextView) findViewById(R.id.team_b_outs);
        runView.setText(String.valueOf(run));
    }

    /*
    * Add one run to team A*/
    public void addOneRunTeamA(View view) {
        runTeamA = runTeamA + 1;
        displayRunTeamA(runTeamA);
    }

    /*
   * Add one run to team B*/
    public void addOneRunTeamB(View view) {
        runTeamB = runTeamB + 1;
        displayRunTeamB(runTeamB);
    }

    /* Track outs in team A*/
    public void addOutTeamA(View view){
        outsTeamA = outsTeamA + 1;
        if (outsTeamA == 3){
            outsTeamA = 0;
            addOutTeamA(outsTeamA);
        }else{
            addOutTeamA(outsTeamA);
        }
    }

    /* Track outs in team B*/
    public void addOutTeamB(View view){
        outsTeamB = outsTeamB + 1;
        if (outsTeamB == 3){
            outsTeamB = 0;
            addOutTeamB(outsTeamB);
        }else{
            addOutTeamB(outsTeamB);
        }
    }

    /*
    * Set all variables to zero and reset game to start again*/
    public void reset(View view) {
        runTeamA = 0;
        runTeamB = 0;
        outsTeamA = 0;
        outsTeamB = 0;
        displayRunTeamA(runTeamA);
        displayRunTeamB(runTeamB);
        addOutTeamA(outsTeamA);
        addOutTeamB(outsTeamB);
    }
}
