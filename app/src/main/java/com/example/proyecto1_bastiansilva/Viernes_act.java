package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Viernes_act extends AppCompatActivity {
    private VideoView videov;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viernes);

        videov = findViewById(R.id.VideoV);

        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.dia5;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        videov.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        videov.setMediaController(media);
    }
}