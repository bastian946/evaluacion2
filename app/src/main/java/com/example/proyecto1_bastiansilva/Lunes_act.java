package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Lunes_act extends AppCompatActivity {
    private VideoView videol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunes);


        videol= findViewById(R.id.videoL);

        String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.dia1;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        videol.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        videol.setMediaController(media);

    }
}