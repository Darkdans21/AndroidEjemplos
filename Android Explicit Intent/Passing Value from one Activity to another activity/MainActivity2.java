package com.fsw_android.codigomaestro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    //Declaración de las variables a usar.//
    Button btnActivity2; TextView txtView2; String valFromAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnActivity2 = (Button) findViewById(R.id.idbtnActivity2);
        txtView2 = (TextView) findViewById(R.id.idTxtActivity2);
        valFromAct1 = getIntent().getExtras().getString("Value");
        txtView2.setText(valFromAct1);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i); finish();

            }
        });
    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//
