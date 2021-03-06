package com.example.workoutzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);

        Button CableLateralRaise = findViewById(R.id.rtbutton);
        Button DumbbellFrontRaise = findViewById(R.id.atmbutton);
        Button DumbbellRearDeltRaise = findViewById(R.id.lrbutton);
        Button DumbbellShoulderPress = findViewById(R.id.acmbutton);
        Button DumbbellShoulderRaise = findViewById(R.id.cmbutton);

        CableLateralRaise.setOnClickListener(v -> changeActivityclr());

        DumbbellFrontRaise.setOnClickListener(v -> changeActivitydfr());

        DumbbellRearDeltRaise.setOnClickListener(v -> changeActivityrdr());

        DumbbellShoulderRaise.setOnClickListener(v -> changeActivitydsr());

        DumbbellShoulderPress.setOnClickListener(v -> changeActivitydsp());
    }

    private void changeActivitydsp() {
        Intent intent = new Intent(this, DumbbellShoulderPress.class);
        startActivity(intent);
    }

    private void changeActivitydsr() {
        Intent intent = new Intent(this, DumbbellShoulderRaise.class);
        startActivity(intent);
    }

    private void changeActivityrdr() {
        Intent intent = new Intent(this, DumbbellRearDeltRaise.class);
        startActivity(intent);
    }

    private void changeActivitydfr() {
        Intent intent = new Intent(this, DumbbellFrontRaise.class);
        startActivity(intent);
    }

    private void changeActivityclr() {
        Intent intent = new Intent(this, CableLateralRaise.class);
        startActivity(intent);
    }
}