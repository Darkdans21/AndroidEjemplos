package com.fsw_android.codigomaestro;

//Aqu� van las librerias que necesito para la aplicaci�n//
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;


public class MainActivity extends AppCompatActivity
{
    //Declaraci�n de las variables a usar.//

    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = (Chronometer) findViewById(R.id.chronometer); chronometer.setBase(SystemClock.elapsedRealtime()); chronometer.start();


    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//