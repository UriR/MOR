package com.example.mor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private Game game;
    private String string ="";
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bminos;
    private Button bnext;
    private Calculator calculator;
    private TextView exsersice;
    private TextView countdowntext;
    private CountDownTimer countDownTimer;
    private long timeleft = 60000; //1 min

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();

        intent = new Intent(this, ResultActivity.class);

        b1 = findViewById(R.id.button1view);
        b2 = findViewById(R.id.button2view);
        b3 = findViewById(R.id.button3view);
        b4 = findViewById(R.id.button4view);
        b5 = findViewById(R.id.button5view);
        b6 = findViewById(R.id.button6view);
        b7 = findViewById(R.id.button7view);
        b8 = findViewById(R.id.button8view);
        b9 = findViewById(R.id.button9view);
        b0 = findViewById(R.id.button0view);
        bminos = findViewById(R.id.buttonminosview);
        bnext = findViewById(R.id.buttonview);
        exsersice = findViewById(R.id.exsesicetext);
        countdowntext = findViewById(R.id.countdown_text);

        calculator = new Calculator();

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
        builder.setTitle("Instructions");
        builder.setMessage("Your goal is to solve as many exercises as possible in a minute");
        builder.setCancelable(false);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                exsersice.setText(calculator.getExcersice());
                countDownTimer = new CountDownTimer(timeleft,1000)
                {
                    @Override
                    public void onTick(long l) {
                        timeleft=l;
                        int timeleftText = (int) timeleft/1000;
                        countdowntext.setText("0:"+timeleftText);
                    }

                    @Override
                    public void onFinish() {

                    }


                }.start();
            }

        });
        AlertDialog dialog = builder.create();
        dialog.show();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "1";
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "2";
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "3";
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "4";
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "5";
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "6";
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "7";
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "8";
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "9";
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = string + "0";
            }
        });
        bminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = "-" + string;
            }
        });
        bnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MM", "??");
                Log.d("MM", game.toString());
                //game.addExercise();
                boolean bool = calculator.check((Integer.parseInt(string)));
                if(bool==true)
                    game.addRightAnswer();
                calculator.getExcersice();
                intent.putExtra("countex", game.exercises);
                intent.putExtra("countRight", game.rightAnswers);
                startActivity(intent);
            }
        });

    }
}