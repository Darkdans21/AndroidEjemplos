package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("http://www.androidbegin.com/tutorial/AndroidCommercial.3gp"));
        videoView.setMediaController(new MediaController(this)); videoView.requestFocus();
        videoView.start();

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//