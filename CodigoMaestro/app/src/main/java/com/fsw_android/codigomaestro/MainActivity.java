package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//Final del primer proceso del ciclo de vida de Android, "OnCreate"//
} //Fin de la clase Main Activity//


