package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import Objetos.Insumos;

public class Menu_act extends AppCompatActivity {
    private Insumos in = new Insumos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void clase (View view)
    {
        Intent i = new Intent(this,Clases_act.class);
        startActivity(i);
    }


    public void Insumos(View view) {
        Intent i = new Intent(this, Insumos_act.class);
        Bundle bun = new Bundle();
        bun.putStringArray("insumos", in.getInsumos());
        i.putExtras(bun);
        startActivity(i);


    }

    public void Tarea(View View) {
            Intent i = new Intent(this,Info_act.class);
            startActivity(i);



    }

    public  void Rutina (View view){
        Intent i = new Intent(this,Rutinas_act.class);
        startActivity(i);
    }
}