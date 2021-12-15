package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import Objetos.Insumos;
import Objetos.Login;

public class MainActivity extends AppCompatActivity {
    private EditText usuario, contra;
    private TextView mensaje;
    private Login adm = new Login();
    private Button btn;
    private ProgressBar pb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=findViewById(R.id.etusuario);
        contra=findViewById(R.id.etcontra);
        mensaje=findViewById(R.id.tv1);
        btn = findViewById(R.id.btn);
        pb=findViewById(R.id.pb);

        mensaje.setVisibility(View.INVISIBLE);
        pb.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Tarea ().execute();


            }
        });
    }


    class Tarea extends AsyncTask<String,Void,String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mensaje.setText("Aparece la barra");
            pb.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                for (int i = 0; i <= 10; i++) {
                    Thread.sleep(1000);
                }
            }

             catch (InterruptedException e)
             {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Intent i = new Intent(getBaseContext(), Menu_act.class);
            startActivity(i);
        }
    }


    public void IniciarSesion(View view)
    {
        String user = usuario.getText().toString().trim();
        String contraseña = contra.getText().toString().trim();

        String usuarioObj=adm.getUsuario().toString().trim();
        String contraObj=adm.getContra().toString().trim();


        switch (user)
        {
            case"Bastian":
                if(user.equals(usuarioObj) && contraseña.equals(contraObj))
                {
                    mensaje.setVisibility(View.INVISIBLE);
                    Intent i = new Intent(this, Menu_act.class);
                    startActivity(i);
                }
                break;
            case "":
                if (user.equals("") && contraseña.equals(""))
                {
                    mensaje.setVisibility(View.VISIBLE);
                    mensaje.setText("campos vacíos" );
                }
                break;
            default:
                if(!usuario.equals(usuarioObj)&& contraseña.equals(contraObj))
                {
                    mensaje.setVisibility(View.VISIBLE);
                    mensaje.setText("campos incorrectos");
                }
                break;
        }
    }
    public void Facebook(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }
    public void Youtube(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/"));
        startActivity(i);
    }
    public void twitter(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.twitter.com/"));
        startActivity(i);
    }
}



