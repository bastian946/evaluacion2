package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Martes_act extends AppCompatActivity {
    private VideoView videom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martes);

        videom= findViewById(R.id.videoM);

        String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.dia2;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        videom.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        videom.setMediaController(media);

    }
}