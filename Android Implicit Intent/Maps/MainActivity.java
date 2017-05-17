package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
        Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idbtn);

    }  //Final del primer proceso del ciclo de vida de Android, "On Create"//

    public void btnClick(View v)
    {
    Intent i = new Intent(Intent.ACTION_VIEW);
        //Latitud y Longitud//
    i.setData(Uri.parse("geo:25.7263153,-100.3131257"));
    Intent chooser = Intent.createChooser(i, "Launch Maps");
    startActivity(chooser);
    }

} //Fin de la clase Main Activity//