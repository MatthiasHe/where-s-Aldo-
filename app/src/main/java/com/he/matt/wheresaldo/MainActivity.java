package com.he.matt.wheresaldo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.he.matt.wheresaldo.ui.GameOneActivity;
import com.he.matt.wheresaldo.ui.GameThreeActivity;
import com.he.matt.wheresaldo.ui.GameTwoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // LANCE LE MODE CLASSIQUE
    public void modeOneLaunch(View button) {
        Intent launchModeOne = new Intent(this, GameOneActivity.class);
        startActivity(launchModeOne);
    }

    // LANCE LE MODE CHRONOMOD
    public void modeTwoLaunch(View button) {
        Intent launchModeTwo = new Intent(this, GameTwoActivity.class);
        startActivity(launchModeTwo);
    }

    // LANCE LE MODE CHRONOMOD 2
    public void modeThreeLaunch(View button) {
        Intent launchModeThree = new Intent(this, GameThreeActivity.class);
        startActivity(launchModeThree);
    }

    // PERMET D'ACCEDER AU CLASSEMENT
    public void hallOfFameLaunch(View button) {
        Intent launchHallOfFame = new Intent(this, GameOneActivity.class);
        startActivity(launchHallOfFame);
    }
}
