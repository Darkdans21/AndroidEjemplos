package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Insertar, Eliminar, Modificar, Leer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Insertar = (Button) findViewById(R.id.btnInsertar);
        Insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Insertar.class);
                startActivity(intent);
            }
        });

        Eliminar = (Button) findViewById(R.id.btnEliminar);
        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Eliminar.class);
                startActivity(intent);
            }
        });

        Modificar = (Button) findViewById(R.id.btnModificar);
        Modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Modificar.class);
                startActivity(intent);
            }
        });

        Leer = (Button) findViewById(R.id.btnLeer);
        Leer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Leer.class);
                startActivity(intent);
            }
        });

    }//Final del On Create//
} //Fin de la clase FragmentA Activity//