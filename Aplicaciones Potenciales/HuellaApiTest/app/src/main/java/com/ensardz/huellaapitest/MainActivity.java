package com.ensardz.huellaapitest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ensardz.huellaapitest.API.API;
import com.ensardz.huellaapitest.API.APIServices.DescargaRecorridoService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.ensardz.huellaapitest.Models.Object;

import java.util.List;


public class MainActivity extends AppCompatActivity
{

    //Agregando esto estamos declarando las variables para usar los textView//
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    //Le doy a la Interfaz (tipo de clase) una variable para usarla aqui//
    private DescargaRecorridoService service;

    //Hacemos la llamada a la lista de objetos y una variable para usarla en esta clase//
    private Call<List<Object>> listaObjetos;

    //Este es el link de la base de datos JSON//
    // https://young-escarpment-48238.herokuapp.com/routes


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Agregando el metodo de abajo para correrlo desde el OnCreate//
        setUI();

        //Estamos llamando a la variable del servicio para obetener la conexion de retrofit y GSON para la interfaz DescargaRecorridoService//
        service = API.getApi().create(DescargaRecorridoService.class);


        //Mandamos llamar la lista de objetos en el servicio y obtener el recorrido//
        listaObjetos = service.getRecorrido();
        listaObjetos.enqueue(new Callback<List<Object>>()
        {
            //Cuando la conexion fue exitosa nos manda esto//
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response)
            {
                List<Object> objetos = response.body();
                Toast.makeText(MainActivity.this, "chido" + response, Toast.LENGTH_SHORT).show();
                setResult(objetos);
            }

            //Si la conexion no fue exitosa//
            @Override
            public void onFailure(Call<List<Object>> call, Throwable t)
            {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Agregando esto para enlazar los botones fisicos con su variable logica//
    private void setUI()
    {
        textView1 = (TextView) findViewById(R.id.textViewCity);
        textView2 = (TextView) findViewById(R.id.textViewDescription);
        textView3 = (TextView) findViewById(R.id.textViewTemperature);
    }


    //Les asignamos a los textViews los valores que recogimos de la api//
    private void setResult(List<Object> objects)
    {
        textView1.setText(objects.get(0).getBarcode());
        textView2.setText(objects.get(0).getRoom());
        textView3.setText(objects.get(0).getRoomDescription());
    }


} //Final del MAIN//
