package com.example.notuserfriendlycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SatanActivity extends AppCompatActivity {

    private MaterialButton returnOnCalc;
    private VideoView videoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_the_satan_activity);

        videoView = findViewById(R.id.satan_video);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.satana);

        returnOnCalc = findViewById(R.id.return_button);

        returnOnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SatanActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
