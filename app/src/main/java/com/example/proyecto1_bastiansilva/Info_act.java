package com.example.proyecto1_bastiansilva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Info_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }




    public void video (View View) {
        Intent i = new Intent(this,Video_act.class);
        startActivity(i);
    }

    public void  Marcar (View view){
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("Tel:" +"948982468"));
        startActivity(i);
    }

    public void Maps (View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);

    }
}