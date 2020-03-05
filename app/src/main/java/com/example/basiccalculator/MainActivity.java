package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number = "";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";

    private TextView answerTV;
    private Button keyPad0, keyPad1, keyPad2, keyPad3, keyPad4, keyPad5, keyPad6, keyPad7, keyPad8, keyPad9;
    private Button keyPadAdd, keyPadMinus, keyPadMult, keyPadDiv, keyPadClear, keyPadEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTV = findViewById(R.id.answer_tv);

        //      numbers
        keyPad0 = findViewById(R.id.key0_btn);
        keyPad1 = findViewById(R.id.key1_btn);
        keyPad2 = findViewById(R.id.key2_btn);
        keyPad3 = findViewById(R.id.key3_btn);
        keyPad4 = findViewById(R.id.key4_btn);
        keyPad5 = findViewById(R.id.key5_btn);
        keyPad6 = findViewById(R.id.key6_btn);
        keyPad7 = findViewById(R.id.key7_btn);
        keyPad8 = findViewById(R.id.key8_btn);
        keyPad9 = findViewById(R.id.key9_btn);

        //     functions
        keyPadAdd = findViewById(R.id.key_add_btn);
        keyPadMinus = findViewById(R.id.key_minus_btn);
        keyPadMult = findViewById(R.id.key_mult_btn);
        keyPadDiv = findViewById(R.id.key_div_btn);
        keyPadClear = findViewById(R.id.key_clear_btn);
        keyPadEquals = findViewById(R.id.key_equals_btn);

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);

        keyPadAdd.setOnClickListener(this);
        keyPadMinus.setOnClickListener(this);
        keyPadMult.setOnClickListener(this);
        keyPadDiv.setOnClickListener(this);
        keyPadClear.setOnClickListener(this);
        keyPadEquals.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.key0_btn:
                number = number +"0";
                answerTV.setText(number);
                break;

            case R.id.key1_btn:
                number = number +"1";
                answerTV.setText(number);
                break;

            case R.id.key2_btn:
                number = number +"2";
                answerTV.setText(number);
                break;

            case R.id.key3_btn:
                number = number +"3";
                answerTV.setText(number);
                break;

            case R.id.key4_btn:
                number = number +"4";
                answerTV.setText(number);
                break;

            case R.id.key5_btn:
                number = number +"5";
                answerTV.setText(number);
                break;

            case R.id.key6_btn:
                number = number +"6";
                answerTV.setText(number);
                break;

            case R.id.key7_btn:
                number = number +"7";
                answerTV.setText(number);
                break;

            case R.id.key8_btn:
                number = number +"8";
                answerTV.setText(number);
                break;

            case R.id.key9_btn:
                number = number +"9";
                answerTV.setText(number);
                break;

            case R.id.key_add_btn:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.key_minus_btn:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.key_mult_btn:
                symbol = "*";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.key_div_btn:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.key_clear_btn:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                answerTV.setText("");
                break;

            case R.id.key_equals_btn:
                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        answerTV.setText("Answer: " + (num1 + num2));
                        break;

                    case "-":
                        answerTV.setText("Answer: " + (num1 - num2));
                        break;

                    case "*":
                        answerTV.setText("Answer: " + (num1 * num2));
                        break;

                    case "/":
                        answerTV.setText("Answer: " + (num1 / num2));
                        break;
                    case "":
                        answerTV.setText("Answer: " + num2);
                }

                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                break;
        }
}}
