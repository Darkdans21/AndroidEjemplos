package com.fsw_android.codigomaestro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Modificar extends AppCompatActivity {


    EditText txtId, txtNombre, txtApellido, txtContraseña;
    Button btnClick;
    DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);
        myDb = new DataBaseHelper(this);
        txtId = (EditText) findViewById(R.id.idID);
        txtNombre = (EditText) findViewById(R.id.idNombre);
        txtApellido = (EditText) findViewById(R.id.idApellido);
        txtContraseña = (EditText) findViewById(R.id.idContraseña);
        btnClick = (Button) findViewById(R.id.idBtn);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = txtId.getText().toString();
                String nombre = txtNombre.getText().toString();
                String apellido = txtApellido.getText().toString();
                String contraseña = txtContraseña.getText().toString();
                Boolean result = myDb.updateData(id, nombre, apellido, contraseña);
                if (result == true) {
                    Toast.makeText(getApplicationContext(), "Data Updated Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "No Rows Affected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }//Final del On Create//
} //Fin de la clase Main Activity//
