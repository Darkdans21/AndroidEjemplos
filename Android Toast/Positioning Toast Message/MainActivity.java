package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
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
                Toast toast1 = Toast.makeText(getApplicationContext(),"Toast:Gravity.TOP",Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP,0,0);
                toast1.show();

                Toast toast2 = Toast.makeText(getApplicationContext(),"Toast:Gravity.CENTER",Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.CENTER,0,0);
                toast2.show();

                Toast toast3 = Toast.makeText(getApplicationContext(),"Toast:Gravity.BOTTOM",Toast.LENGTH_SHORT);
                toast3.setGravity(Gravity.BOTTOM,0,0);
                toast3.show();

                Toast toast4 = Toast.makeText(getApplicationContext(),"Toast:Gravity.LEFT",Toast.LENGTH_SHORT);
                toast4.setGravity(Gravity.LEFT,0,0);
                toast4.show();

                Toast toast5 = Toast.makeText(getApplicationContext(),"Toast:Gravity.RIGHT",Toast.LENGTH_SHORT);
                toast5.setGravity(Gravity.RIGHT,0,0);
                toast5.show();

                Toast toast6 = Toast.makeText(getApplicationContext(),"Toast TOP LEFT",Toast.LENGTH_SHORT);
                toast6.setGravity(Gravity.TOP | Gravity.LEFT,0,0);
                toast6.show();

                Toast toast7 = Toast.makeText(getApplicationContext(),"Toast BOTTOM RIGHT",Toast.LENGTH_SHORT);
                toast7.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
                toast7.show();
            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
}//Fin de la clase Main Activity//

