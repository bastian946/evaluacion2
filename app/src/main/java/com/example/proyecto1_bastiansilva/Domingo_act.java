package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Domingo_act extends AppCompatActivity {
    private VideoView videod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domingo);
        videod= findViewById(R.id.videoD);

        String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.dia7;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        videod.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        videod.setMediaController(media);
    }
}