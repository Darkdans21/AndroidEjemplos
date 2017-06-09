package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    //Declaración de las variables a usar.//
    ListView lv; String[] charactersDC={"Flash","Arrow","SuperGirl","BatMan",
        "SuperMan", "Atom","WonderWomen","GreenLantern","Aquaman","Cyborg",
        "CaptainCold", "Darkseid","FireStorm","GreenArrow","Grodd","Joker",
        "KillerFrost", "Zoom","ReverseFlash" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.idListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,charactersDC);
        lv.setAdapter(adapter);

        //Setting onClickListener on ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(getApplicationContext(),"Item Clicked: "+i, Toast.LENGTH_SHORT).show();
            }
        });

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
}//Fin de la clase Main Activity//

