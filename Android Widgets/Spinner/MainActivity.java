package com.fsw_android.codigomaestro;

//Aqu� van las librerias que necesito para la aplicaci�n//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity
{
    //Declaraci�n de las variables a usar.//
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.idSpinner);
        String [] countries={"M�xico","Estados Unidos","C�nada","Brasil","Espa�a"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countries);
        spinner.setAdapter(adapter);
    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//
} //Fin de la clase Main Activity//
