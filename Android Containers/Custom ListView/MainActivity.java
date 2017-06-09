package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaración de las variables a usar.//
    String[] titles = {"Navegación entre activitys", "Almacenamiento", "Archivos Temporales", "Menu contenedor", "Fragmentos"};
    String[] descriptions = {"Description1", "Description2", "Description3", "Description4", "Description5"};
    int[] images = {R.drawable.activity_intent, R.drawable.internal_storage_icon, R.drawable.cache_icon, R.drawable.context_menu_icon, R.drawable.fragments_icon1};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.idListView);
        MyAdapter adapter = new MyAdapter(getApplicationContext(), titles, descriptions, images);
        lv.setAdapter(adapter);
    }//Final del primer proceso del ciclo de vida de Android, "OnCreate"//
} //Fin de la clase Main Activity//


class MyAdapter extends ArrayAdapter {
    int[] imageArray;
    String[] titleArray;
    String[] descArray;

    public MyAdapter(Context context, String[] titles1, String[] descriptions1, int[] img1) {
        //Overriding Default Constructor off ArratAdapter
        super(context, R.layout.examplo_custlistview_rom, R.id.idTitle, titles1);
        this.imageArray = img1;
        this.titleArray = titles1;
        this.descArray = descriptions1;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Inflating the layout
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.examplo_custlistview_rom, parent, false);
        //Get the reference to the view objects
        ImageView myImage = (ImageView) row.findViewById(R.id.idPic);
        TextView myTitle = (TextView) row.findViewById(R.id.idTitle);
        TextView myDescription = (TextView) row.findViewById(R.id.idDescription);
        //Providing the element of an array by specifying its position
        myImage.setImageResource(imageArray[position]);
        myTitle.setText(titleArray[position]);
        myDescription.setText(descArray[position]);
        return row;

    }
}

