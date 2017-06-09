package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity
{

    //Declaración de las variables a usar.//
    GridView gridView; String [] data={"data1","data2","data3","data4","data5","data6","data7","data8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.idGridView);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,data);
        gridView.setAdapter(adapter);

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
}//Fin de la clase Main Activity//

