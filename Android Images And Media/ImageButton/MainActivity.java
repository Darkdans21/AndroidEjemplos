package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    ImageButton imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageButton) findViewById(R.id.idImageButton);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this,"Image was Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//

