package com.example.chad.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int value;

    public void makeToast(String string){

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

    }

    public void guessNumber(View view){

        EditText numberGuess = (EditText) findViewById(R.id.editText);

        int numberGuessValue = Integer.parseInt(numberGuess.getText().toString());

        if (numberGuessValue == value){

            makeToast("You guessed it! Try again!");
            numberGuess.setText("");

            Random rand = new Random();

            value = rand.nextInt(20) + 1;

        }
        else if (numberGuessValue > value){

            makeToast("Guess lower");
            numberGuess.setText("");
        }
        else {

            makeToast("Guess higher");
            numberGuess.setText("");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        value = rand.nextInt(20) + 1;
    }
}
