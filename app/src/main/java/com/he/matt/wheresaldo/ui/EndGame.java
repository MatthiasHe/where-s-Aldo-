package com.he.matt.wheresaldo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.he.matt.wheresaldo.MainActivity;
import com.he.matt.wheresaldo.R;

public class EndGame extends AppCompatActivity {

    private int score;
    private String winText;
    private TextView scoreView;
    private int cageFound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        Bundle extras = getIntent().getExtras();

        // GESTION DES DIFFERENTS CAS DE VICTOIRE
        if (extras.getInt("Score") != 0) {
            score = extras.getInt("Score");

            scoreView = (TextView) findViewById(R.id.score);
            scoreView.setText("You score : " + String.valueOf(score));
        } else if (extras.getString("Chronomod") != null) {
            winText = extras.getString("Chronomod");

            scoreView = (TextView) findViewById(R.id.score);
            scoreView.setText(winText);
        } else if (extras.getInt("CageFound") >= 0) {
            cageFound = extras.getInt("CageFound");

            scoreView = (TextView) findViewById(R.id.score);
            scoreView.setText("Vous avez trouvé : " + String.valueOf(cageFound) + " Nicolas Cage ! Bravo !");
        }
    }

    // SIMPLE METHODE POUR REVENIR AU MENU PRINCIPAL
    public void backToMenu(View button) {
        Intent backToMenu = new Intent(this, MainActivity.class);
        startActivity(backToMenu);
    }
}
