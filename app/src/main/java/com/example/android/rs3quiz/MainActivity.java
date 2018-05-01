package com.example.android.rs3quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalQuestions = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        int correctAnswers = 0;
        RadioButton answerOne = findViewById(R.id.j42001);
        if (answerOne.isChecked()) {
            correctAnswers++;
            Log.v("MainActivity", "year");
        }
        CheckBox zilyana = findViewById(R.id.zilyana);
        CheckBox bandos = findViewById(R.id.Bandos);
        CheckBox kree = findViewById(R.id.Kree);
        CheckBox saradomin = findViewById(R.id.Saradomin);
        CheckBox zaros = findViewById(R.id.Zaros);
        CheckBox mah = findViewById(R.id.Mah);
        CheckBox guthix = findViewById(R.id.Guthix);
        CheckBox nex = findViewById(R.id.Nex);
        if ((bandos.isChecked() && saradomin.isChecked() && zaros.isChecked() && mah.isChecked() && guthix.isChecked()) && !zilyana.isChecked() && !kree.isChecked() && !nex.isChecked()) {
            correctAnswers++;
            Log.v("MainActivity", "gods");
        }
        EditText godname = findViewById(R.id.godname);
        String godtext = godname.getText().toString();
        Log.v("Main", "you typed: " + godtext.toLowerCase());
        if (godtext.equalsIgnoreCase("guthix")) {
            correctAnswers++;
            Log.v("MainActivity", "Guthix");
        }
        RadioButton godsword = findViewById(R.id.gs5);
        if (godsword.isChecked()) {
            correctAnswers++;
            Log.v("MainActivity", "Gs");
        }
        if(correctAnswers > 0) {
            Toast.makeText(MainActivity.this, getString(R.string.yourscore) + " " + correctAnswers + " out of " + totalQuestions, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, getString(R.string.zero), Toast.LENGTH_LONG).show();
        }
        Button score = findViewById(R.id.score);
        score.setText("Resubmit Answers");
    }
}
