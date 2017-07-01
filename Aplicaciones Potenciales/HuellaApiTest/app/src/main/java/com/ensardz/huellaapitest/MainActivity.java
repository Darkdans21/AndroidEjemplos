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

    //Agregando esto//
    private TextView textViewcity;
    private TextView textViewDescription;
    private TextView textViewTemp;

    private DescargaRecorridoService service;
    private Call<List<Object>> listaObjetos;

    // https://young-escarpment-48238.herokuapp.com/routes


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Agregando esto//
        setUI();

        service = API.getApi().create(DescargaRecorridoService.class);


        listaObjetos = service.getRecorrido();
        listaObjetos.enqueue(new Callback<List<Object>>()
        {
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response)
            {
                List<Object> objetos = response.body();
                Toast.makeText(MainActivity.this, "chido" + response, Toast.LENGTH_SHORT).show();
                setResult(objetos);
            }

            @Override
            public void onFailure(Call<List<Object>> call, Throwable t)
            {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Agregando esto//
    private void setUI()
    {
        textViewcity = (TextView) findViewById(R.id.textViewCity);
        textViewDescription = (TextView) findViewById(R.id.textViewDescription);
        textViewTemp = (TextView) findViewById(R.id.textViewTemperature);
    }


    private void setResult(List<Object> objects)
    {
        textViewcity.setText(objects.get(0).getBarcode());
        textViewDescription.setText(objects.get(0).getRoom());
        textViewTemp.setText(objects.get(0).getRoomDescription());
    }
}
