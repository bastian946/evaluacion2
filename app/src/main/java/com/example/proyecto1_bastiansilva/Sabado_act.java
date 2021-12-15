package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Sabado_act extends AppCompatActivity {
    private VideoView videos;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sabado);

            videos= findViewById(R.id.vodeoS);

            String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.dia6;
            Uri uri = Uri.parse(ruta); //parsear la ruta
            videos.setVideoURI(uri);//le paso el video al onClik

            //controladores del video
            MediaController media = new MediaController(this);
            videos.setMediaController(media);
    }
}