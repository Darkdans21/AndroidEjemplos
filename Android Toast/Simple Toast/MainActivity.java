package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    //Declaración de las variables a usar.//
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Displays Toast for 3.5 secs
                Toast.makeText(getApplicationContext(),"This is a Toast Short Message",Toast.LENGTH_SHORT).show();

                //Displays Toast for 7 secs
                //Toast.makeText(getApplicationContext(),"This is a Toast Long Message",Toast.LENGTH_LONG).show();

            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
}//Fin de la clase Main Activity//
