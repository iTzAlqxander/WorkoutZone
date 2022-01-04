package com.example.workoutzone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MuscleSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscleselect);

        Button changeBicep = findViewById(R.id.buttonBicep);
        Button changeTricep = findViewById(R.id.buttonTricep);
        Button changeQuadricep = findViewById(R.id.buttonQuadricep);
        Button changeBack = findViewById(R.id.buttonBack);
        Button changeChest = findViewById(R.id.buttonChest);
        Button changeShoulder = findViewById(R.id.buttonShoulder);
        Button changeTrapezius = findViewById(R.id.buttonTrapezius);
        Button changeGlute = findViewById(R.id.buttonGlute);
        Button changeHamstring = findViewById(R.id.buttonHamstring);
        Button changeForearm = findViewById(R.id.buttonForearm);
        Button changeLowerBack = findViewById(R.id.buttonLowerBack);
        Button changeCalf = findViewById(R.id.buttonCalf);
        Button changeAbs = findViewById(R.id.buttonAbs);

        changeAbs.setOnClickListener(v -> changeActivityAbs());

        changeCalf.setOnClickListener(v -> changeActivityCalf());

        changeLowerBack.setOnClickListener(v -> changeActivityLowerBack());

        changeForearm.setOnClickListener(v -> changeActivityForearm());

        changeHamstring.setOnClickListener(v -> changeActivityHamstring());

        changeGlute.setOnClickListener(v -> changeActivityGlute());

        changeTrapezius.setOnClickListener(v -> changeActivityTrapezius());

        changeBicep.setOnClickListener(v -> changeActivityBicep());

        changeTricep.setOnClickListener(v -> changeActivityTricep());

        changeQuadricep.setOnClickListener(v -> changeActivityLeg());

        changeBack.setOnClickListener(v -> changeActivityBack());

        changeChest.setOnClickListener(v -> changeActivityChest());

        changeShoulder.setOnClickListener(v -> changeActivityShoulder());

    }

    private void changeActivityAbs() {
        Intent intent = new Intent(this, Abs.class);
        startActivity(intent);
    }

    private void changeActivityCalf() {
        Intent intent = new Intent(this, Calf.class);
        startActivity(intent);
    }

    private void changeActivityLowerBack() {
        Intent intent = new Intent(this, LowerBack.class);
        startActivity(intent);
    }

    private void changeActivityForearm() {
        Intent intent = new Intent(this, Forearm.class);
        startActivity(intent);
    }

    private void changeActivityHamstring() {
        Intent intent = new Intent(this, Hamstring.class);
        startActivity(intent);
    }

    private void changeActivityGlute() {
        Intent intent = new Intent(this, Glute.class);
        startActivity(intent);
    }

    private void changeActivityTrapezius() {
        Intent intent = new Intent(this, Trapezius.class);
        startActivity(intent);
    }

    private void changeActivityLeg() {
        Intent intent = new Intent(this, Quadricep.class);
        startActivity(intent);
    }

    private void changeActivityShoulder() {
        Intent intent = new Intent(this, Shoulder.class);
        startActivity(intent);
    }

    private void changeActivityChest() {
        Intent intent = new Intent(this, Chest.class);
        startActivity(intent);
    }

    private void changeActivityBack() {
        Intent intent = new Intent(this, Back.class);
        startActivity(intent);
    }

    private void changeActivityTricep() {
        Intent intent = new Intent(this, Tricep.class);
        startActivity(intent);
    }

    private void changeActivityBicep() {
        Intent intent = new Intent(this, Bicep.class);
        startActivity(intent);
    }
}