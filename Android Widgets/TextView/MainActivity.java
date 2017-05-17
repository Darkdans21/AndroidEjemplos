package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.idtxt);
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                String myvar = textView.getText().toString();
                Toast.makeText(MainActivity.this,myvar, Toast.LENGTH_SHORT).show();
            }
        });
    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//
} //Fin de la clase Main Activity//
