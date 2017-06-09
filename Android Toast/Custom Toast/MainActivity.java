package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    //Declaración de las variables a usar.//
    Button btn;
    View viewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idbtn);
        LayoutInflater layoutInflater = getLayoutInflater();
        viewLayout =layoutInflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_layout));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(MainActivity.this,"Toast:Gravity.TOP",Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER,0,0);
                toast1.setView(viewLayout); toast1.show();
            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
}//Fin de la clase Main Activity//

