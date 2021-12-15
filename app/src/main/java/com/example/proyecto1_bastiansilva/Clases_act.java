package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyecto1_bastiansilva._database.AdminSQliteOpenHelper;

public class Clases_act extends AppCompatActivity {

    private EditText codigo, clase, intensi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases);
        codigo = findViewById(R.id.codigo);
        clase = findViewById(R.id.clase);
        intensi = findViewById(R.id.intensi);
    }

    public void guardarClase(View view) {
        AdminSQliteOpenHelper admin = new AdminSQliteOpenHelper(this, "biofit", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String code = codigo.getText().toString();
        String clases = clase.getText().toString();
        String intensidad = intensi.getText().toString();

        if (!code.isEmpty() && !clases.isEmpty() && !intensidad.isEmpty()) {
            ContentValues cont = new ContentValues();
            cont.put("codigo", code);
            cont.put("clases", clases);
            cont.put("intensidad", intensidad);



            db.insert("clases", null, cont);
            db.close();
            Clean();

            Toast.makeText(this, "Has Guardado una clase", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "los campos estan vacíos ", Toast.LENGTH_LONG).show();
        }
    }

    public void mostrarClase(View view) {
        AdminSQliteOpenHelper admin = new AdminSQliteOpenHelper(this, "biofit", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String code = codigo.getText().toString();

        if(!code.isEmpty())
        {
            Cursor file = db.rawQuery
                    ("SELECT clase,intensidad FROM clases WHERE code ="+codigo, null );

            if(file.moveToFirst())
            {
                clase.setText(file.getString(0));
                intensi.setText(file.getString(1));
            }
        }

        else
        {
            Toast.makeText(this,"No hay clases asociadas",Toast.LENGTH_LONG).show();
        }

    }

    public void eliminarClase(View view) {

        AdminSQliteOpenHelper admin = new AdminSQliteOpenHelper(this, "biofit", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();


        String code = codigo.getText().toString();

        if(code.isEmpty())
        {
            int cant = db.delete("clase","codigo"+codigo,null);
            db.close();
            Clean();


            if(cant==1)
            {
                Toast.makeText(getBaseContext(),"Eliminaste una clase asociada a: "+codigo,Toast.LENGTH_SHORT);

            }else
                {

                    Toast.makeText(getBaseContext(),"No existe la clase asociada",Toast.LENGTH_SHORT);

                }



        } else {
            Toast.makeText(getBaseContext(),"no hay clases asociada",Toast.LENGTH_SHORT);
        }

    }

    public void actualizarClase(View view) {

        AdminSQliteOpenHelper admin = new AdminSQliteOpenHelper(this, "biofit", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String code = codigo.getText().toString();
        String clases = clase.getText().toString();
        String intensidad = intensi.getText().toString();


        if(!code.isEmpty() && !clases.isEmpty() && !intensidad.isEmpty())
        {
            ContentValues cont = new ContentValues();

            cont.put("clases",clases);
            cont.put("intensidad",intensidad);

            db.update("clases",cont,"codigo"+codigo, null);
            db.close();
            Clean();

            Toast.makeText(getBaseContext(),"Has Actualizado!!",Toast.LENGTH_SHORT).show();

        }else
            {
                Toast.makeText(getBaseContext(),"Hay campos vacios",Toast.LENGTH_LONG).show();
            }


    }

    public void Clean()
    {
        codigo.setText("");
        clase.setText("");
        intensi.setText("");
    }



}