package com.example.notuserfriendlycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;


import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Pattern;



public class MainActivity extends AppCompatActivity {

    private static final String ARG_INPUT_LINE = "INPUT_LINE";
    private static final String ARG_OUTPUT_LINE = "OUTPUT_LINE";

    private MaterialButton btn0;
    private MaterialButton btn1;
    private MaterialButton btn2;
    private MaterialButton btn3;
    private MaterialButton btn4;
    private MaterialButton btn5;
    private MaterialButton btn6;
    private MaterialButton btn7;
    private MaterialButton btn8;
    private MaterialButton btn9;
    private MaterialButton btnPlus;
    private MaterialButton btnMinus;
    private MaterialButton btnDiv;
    private MaterialButton btnMult;
    private MaterialButton btnEqual;
    private MaterialButton btnDot;
    private MaterialButton backSpace;
    private MaterialButton callSatan;
    private MaterialButton returnOnCalc;

    private String inputText;
    private String outputText;

    private TextView tvInput;
    private TextView tvOutput;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView videoView = findViewById(R.id.satan_video);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.satana);

        inputText = savedInstanceState.getString(ARG_INPUT_LINE);
        outputText = savedInstanceState.getString(ARG_OUTPUT_LINE);

        btn0 = findViewById(R.id.button_0);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);
        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btnDiv = findViewById(R.id.button_div);
        btnMult = findViewById(R.id.button_mult);
        btnEqual = findViewById(R.id.button_equal);
        btnDot = findViewById(R.id.button_dot);
        backSpace = findViewById(R.id.button_back_space);
        callSatan = findViewById(R.id.everything_is_bad);
        returnOnCalc = findViewById(R.id.return_button);

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        backSpace.setOnClickListener(view -> {
            tvInput.setText("");
            tvOutput.setText("");
        });

        btn0.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "0");
        });

        btn1.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "1");
        });

        btn2.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "2");
        });

        btn3.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "3");
        });

        btn4.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "4");
        });

        btn5.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "5");
        });

        btn6.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "6");
        });

        btn7.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "7");
        });

        btn8.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "8");
        });

        btn9.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "9");
        });

        btnPlus.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "+");
        });

        btnMinus.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "-");
        });

        btnDiv.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "÷");
        });

        btnMult.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "x");
        });

        btnDot.setOnClickListener(view -> {
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + ".");


        });

        callSatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.call_the_satan_activity);
            }
        });

        returnOnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                work in progress
                arithmeticOperator(inputText);

            }
        });

    }

    public int arithmeticOperator(String inputText) {
        inputText = tvInput.getText().toString();
        inputText = inputText.replaceAll("x", "*");
        inputText = inputText.replaceAll("÷", "/");


        int result = 0;
        tvOutput.setText((int) result);
        return result;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString(ARG_INPUT_LINE, inputText);
        outState.putString(ARG_OUTPUT_LINE, outputText);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}


