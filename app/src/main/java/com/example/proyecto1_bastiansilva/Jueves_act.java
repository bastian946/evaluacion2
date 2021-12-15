package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Jueves_act extends AppCompatActivity {
    private VideoView videoj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jueves);

        videoj= findViewById(R.id.videoJ);

        String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.dia4;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        videoj.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        videoj.setMediaController(media);
    }
}