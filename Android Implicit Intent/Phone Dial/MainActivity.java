package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaración de las variables a usar.//
    Button btnCall;
    EditText numTxt;
    String sNum;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCall = (Button) findViewById(R.id.idbtnCall);
        numTxt = (EditText) findViewById(R.id.idNumtxt);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                sNum = numTxt.getText().toString();
                if(sNum.trim().isEmpty())
                {
                    i.setData(Uri.parse("tel:7788994455"));
                }
                else
                {
                    i.setData(Uri.parse("tel:"+sNum));
                }
                startActivity(i);
            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//

