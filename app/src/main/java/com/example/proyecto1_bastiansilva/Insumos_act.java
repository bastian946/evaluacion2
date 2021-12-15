package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Insumos;

public class Insumos_act extends AppCompatActivity {

    private Spinner insumos;
    private TextView resultado;
    private RatingBar calificar;
    private Insumos in = new Insumos();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insumos);

        insumos = findViewById(R.id.sp1);
        resultado = findViewById(R.id.tv2);
        calificar = findViewById(R.id.rt);

        Bundle bun = getIntent().getExtras();
        String[] listado = bun.getStringArray("insumos");

        ArrayAdapter adaptInsumos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listado);
        insumos.setAdapter(adaptInsumos);
    }

    public void calcular (View view)
    {
        String opcion = insumos.getSelectedItem().toString();
        int resultados = 0;

        for(int i = 0; i < opcion.length();i++)
        {
            if(opcion.equals(in.getInsumos()[i]))
            {
                resultados= in.getPrecios()[i];
                break;
            }

        }
        resultado.setText("la opción es: "+opcion +" El precio es "+resultados);
    }
}
