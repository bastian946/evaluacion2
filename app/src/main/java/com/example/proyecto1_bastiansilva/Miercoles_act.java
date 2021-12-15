package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Miercoles_act extends AppCompatActivity {
    private VideoView videomi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miercoles);

        videomi= findViewById(R.id.videoMI);

        String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.dia3;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        videomi.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        videomi.setMediaController(media);
    }
}