package com.example.notuserfriendlycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.notuserfriendlycalculator.data.AppTheme;
import com.example.notuserfriendlycalculator.data.ThemeStorage;
import com.google.android.material.button.MaterialButton;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


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

    private MaterialButton settingKey1;
    private MaterialButton settingKey2;

    private String inputText;
    private String outputText;

    private TextView tvInput;
    private TextView tvOutput;

    private boolean operatorTrigger;
    private String operator;

    private List<String> firstHolder;
    private List<String> secondHolder;

    public static int computeResult(List<String> firstHolder, List<String> secondHolder, String operator) {
        int firstHolderData = 0;
        int secondHolderData = 0;
        int result = 0;

        for (int i = 0; i < firstHolder.size(); i++) {
            firstHolderData += Integer.parseInt(firstHolder.get(i));
        }

        for (int i = 0; i < secondHolder.size(); i++) {
            secondHolderData = Integer.parseInt(secondHolder.get(i));
        }

        switch (operator) {
            case "+":
                result = firstHolderData + secondHolderData;
                break;

            case "-":
                result = firstHolderData - secondHolderData;
                break;

            case "*":
                result = firstHolderData * secondHolderData;
                break;

            case "/":
                result = firstHolderData / secondHolderData;
                break;
        }

        return result;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ThemeStorage storage = new ThemeStorage(this);
        setTheme(storage.getAppTheme().getTheme());

        settingKey1 = findViewById(R.id.setting_key1);
        settingKey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storage.setAppTheme(AppTheme.STANDART);
                recreate();
            }
        });

        settingKey2 = findViewById(R.id.setting_key2);
        settingKey2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storage.setAppTheme(AppTheme.SAD);
                recreate();
            }
        });

        setContentView(R.layout.activity_main);

        try {
            inputText = savedInstanceState.getString(ARG_INPUT_LINE);
            outputText = savedInstanceState.getString(ARG_OUTPUT_LINE);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

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

        firstHolder = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(@Nullable Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] ts) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(@Nullable Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, @NonNull Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(@Nullable Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String get(int i) {
                return null;
            }

            @Override
            public String set(int i, String s) {
                return null;
            }

            @Override
            public void add(int i, String s) {

            }

            @Override
            public String remove(int i) {
                return null;
            }

            @Override
            public int indexOf(@Nullable Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(@Nullable Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<String> listIterator(int i) {
                return null;
            }

            @NonNull
            @Override
            public List<String> subList(int i, int i1) {
                return null;
            }
        };
        secondHolder = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(@Nullable Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] ts) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(@Nullable Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, @NonNull Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(@Nullable Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String get(int i) {
                return null;
            }

            @Override
            public String set(int i, String s) {
                return null;
            }

            @Override
            public void add(int i, String s) {

            }

            @Override
            public String remove(int i) {
                return null;
            }

            @Override
            public int indexOf(@Nullable Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(@Nullable Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<String> listIterator(int i) {
                return null;
            }

            @NonNull
            @Override
            public List<String> subList(int i, int i1) {
                return null;
            }
        };

        operatorTrigger = false;

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        backSpace.setOnClickListener(view -> {
            tvInput.setText("");
            tvOutput.setText("");
        });

        btn0.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("0");
            } else {
                secondHolder.add("0");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "0");

        });

        btn1.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("1");
            } else {
                secondHolder.add("1");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "1");
        });

        btn2.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("2");
            } else {
                secondHolder.add("2");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "2");
        });

        btn3.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("3");
            } else {
                secondHolder.add("3");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "3");
        });

        btn4.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("4");
            } else {
                secondHolder.add("4");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "4");
        });

        btn5.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("5");
            } else {
                secondHolder.add("5");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "5");
        });

        btn6.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("6");
            } else {
                secondHolder.add("6");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "6");
        });

        btn7.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("7");
            } else {
                secondHolder.add("7");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "7");
        });

        btn8.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("8");
            } else {
                secondHolder.add("8");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "8");
        });

        btn9.setOnClickListener(view -> {
            if (!operatorTrigger) {
                firstHolder.add("9");
            } else {
                secondHolder.add("9");
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "9");
        });

        btnPlus.setOnClickListener(view -> {
            if (!operatorTrigger) {
                operator = "+";
                operatorTrigger = true;
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "+");
        });

        btnMinus.setOnClickListener(view -> {
            if (!operatorTrigger) {
                operator = "-";
                operatorTrigger = true;
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "-");
        });

        btnDiv.setOnClickListener(view -> {
            if (!operatorTrigger) {
                operator = "/";
                operatorTrigger = true;
            }
            inputText = tvInput.getText().toString();
            tvInput.setText(inputText + "÷");
        });

        btnMult.setOnClickListener(view -> {
            if (!operatorTrigger) {
                operator = "*";
                operatorTrigger = true;
            }
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
                Intent intent = new Intent(MainActivity.this, SatanActivity.class);
                startActivity(intent);
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int finalResult = computeResult(firstHolder, secondHolder, operator);
                outputText = Integer.toString(finalResult);
                tvOutput.setText(outputText);
            }
        });

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


