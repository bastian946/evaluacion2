package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_act extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);



        video= findViewById(R.id.vv);

        String ruta = "android.resource://"+getPackageName()+ "/"+ R.raw.video;
        Uri uri = Uri.parse(ruta); //parsear la ruta
        video.setVideoURI(uri);//le paso el video al onClik

        //controladores del video
        MediaController media = new MediaController(this);
        video.setMediaController(media);






    }



}