package com.example.notuserfriendlycalculator.data;

import com.example.notuserfriendlycalculator.R;

public enum AppTheme {

    STANDART(R.style.ButtonStyle, "standart"),
    SAD(R.style.ButtonStyle_Sad, "sad");

    private final int theme;
    private final String key;

    AppTheme(int value, String key) {
        this.theme = value;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public int getTheme() {
        return theme;
    }
}
