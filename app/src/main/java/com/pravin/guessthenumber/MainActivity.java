package com.pravin.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_LONG).show();
    }
    public void guessNumber(View view){
        EditText numberEditText=(EditText)findViewById(R.id.numberEditText);
        int numberInt=Integer.parseInt(numberEditText.getText().toString());
        if (numberInt > randomNumber){
            makeToast("LOWER than number you guessed!");
        }else if (numberInt < randomNumber){
            makeToast("HIGHER than numbe you guessed!");
        }else {
            makeToast("YOU GOT THE NUMBER BUDDY | LET'S PLAY AGAIN!");
            Random rand=new Random();
            randomNumber=rand.nextInt(50)+1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand=new Random();
        randomNumber=rand.nextInt(50)+1;
    }
}
