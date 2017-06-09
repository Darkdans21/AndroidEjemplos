package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    Button btn; String uriString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    sharingIntent.putExtra(Intent.EXTRA_TEXT,"Mi repositorio en Github"+"https://github.com/Darkdans21");
                    sharingIntent.setPackage("com.google.android.apps.plus");
                    startActivity(sharingIntent);
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this,"Please Install the GooglePlus App",Toast.LENGTH_SHORT).show();
                }

            }
        });
}//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//
