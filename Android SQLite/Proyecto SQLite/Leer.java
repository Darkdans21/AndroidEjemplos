package com.fsw_android.codigomaestro;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Leer extends AppCompatActivity {

    DataBaseHelper myDb;
    TextView txtResult;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer);
        myDb = new DataBaseHelper(this);
        txtResult = (TextView) findViewById(R.id.idResult);
        btnClick = (Button) findViewById(R.id.idBtn);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAllData();
                StringBuffer stringBuffer = new StringBuffer();
                if (res != null && res.getCount() > 0) {
                    while (res.moveToNext()) {
                        stringBuffer.append("Id: " + res.getString(0) + "\n");
                        stringBuffer.append("Nombre: " + res.getString(1) + "\n");
                        stringBuffer.append("Apellido: " + res.getString(2) + "\n");
                        stringBuffer.append("Contraseña: " + res.getString(3) + "\n" + "\n");
                    }
                    txtResult.setText(stringBuffer.toString());
                    Toast.makeText(getApplicationContext(), "Data Retrieved Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "No Data to Retrieve", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }//Final del On Create//
} //Fin de la clase Main Activity//
