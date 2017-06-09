package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
ListView listView; 

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 listView = (ListView) findViewById(R.id.idlistView); String[] planets = {"Mercury","Venus","Mars","Earth","Jupitor"}; ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,planets); listView.setAdapter(adapter); registerForContextMenu(listView); } @Override public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { super.onCreateContextMenu(menu, v, menuInfo); menu.setHeaderTitle("Select the Action"); menu.add(0,v.getId(),0,"Delete"); menu.add(0,v.getId(),0,"UpperCase"); menu.add(0,v.getId(),0,"LowerCase"); } @Override public boolean onContextItemSelected(MenuItem item) { if(item.getTitle()=="Delete") { Toast.makeText(this, "Delete was pressed", Toast.LENGTH_SHORT).show(); } else if(item.getTitle()=="UpperCase") { Toast.makeText(this, "UpperCase was pressed", Toast.LENGTH_SHORT).show(); } else if(item.getTitle()=="LowerCase") { Toast.makeText(this, "LowerCase was pressed", Toast.LENGTH_SHORT).show(); } return true;
    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//
