package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rutinas_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinas);
    }

    public void Lunes (View view) {
        Intent i = new Intent(this, Lunes_act.class);
        startActivity(i);
    }

    public void Martes (View view) {
        Intent i = new Intent(this, Martes_act.class);
        startActivity(i);
    }
    public void Miercoles (View view) {
        Intent i = new Intent(this, Miercoles_act.class);
        startActivity(i);
    }

    public void Jueves (View view) {
        Intent i = new Intent(this, Jueves_act.class);
        startActivity(i);
    }
    public void Viernes (View view) {
        Intent i = new Intent(this, Viernes_act.class);
        startActivity(i);
    }
    public void Sabado (View view) {
        Intent i = new Intent(this, Sabado_act.class);
        startActivity(i);
    }
    public void Domingo (View view) {
        Intent i = new Intent(this, Domingo_act.class);
        startActivity(i);
    }
}