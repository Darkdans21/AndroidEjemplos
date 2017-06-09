package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity
{

    //Declaración de las variables a usar.//
    Button btnActivity1; EditText editText1; String editTextVal;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity1 = (Button) findViewById(R.id.idbtnActivity1);
        editText1 = (EditText) findViewById(R.id.idTxtActivity1);

        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                editTextVal = editText1.getText().toString();
                i.putExtra("Value",editTextVal); startActivity(i);
                finish();

            }
        });
    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//

