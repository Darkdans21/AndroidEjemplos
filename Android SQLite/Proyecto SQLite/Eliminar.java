package com.fsw_android.codigomaestro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Eliminar extends AppCompatActivity {

    DataBaseHelper myDb;
    EditText txtId;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);
        myDb = new DataBaseHelper(this);
        txtId = (EditText) findViewById(R.id.idID);
        btnClick = (Button) findViewById(R.id.idBtn);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = txtId.getText().toString();
                int result = myDb.deleteData(id);
                Toast.makeText(getApplicationContext(), result + " :Rows Affected", Toast.LENGTH_SHORT).show();
            }
        });
    }//Final del On Create//
} //Fin de la clase Main Activity//