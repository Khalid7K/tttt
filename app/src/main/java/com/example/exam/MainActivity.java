package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer play1 = new MediaPlayer();
        play1 = MediaPlayer.create(this, R.raw.catsound);
        player = 0;
        switch (player) {
            case 0:
                play1.start();
                player=1;
                break;
            case 1:
                play1.stop();
                player=2;
        }
        Button bttn1 = (Button)findViewById(R.id.button1);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, secAct.class));

            }
        });
    }
}