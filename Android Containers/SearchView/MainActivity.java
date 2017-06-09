package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    //Declaración de las variables a usar.//
    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {"Arjun", "Ankit", "Arvind", "Dipesh", "Dinesh", "Deven"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.idlistview);
        searchView = (SearchView) findViewById(R.id.idsearch);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);

    }//Final del primer proceso del ciclo de vida de Android, "OnCreate"//

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.getFilter().filter(newText);
        Toast.makeText(this,"Query is "+ text,Toast.LENGTH_SHORT).show();
        return false;
    }
} //Fin de la clase Main Activity//

