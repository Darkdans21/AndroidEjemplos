package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Declaración de las variables a usar.//
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idbtn);
    }
    public void btnClick(View v)
    {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_TEXT,"This is my repository "+"\n"+ "https://github.com/Darkdans21");
        sharingIntent.setPackage("com.whatsapp");
        startActivity(sharingIntent);

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//