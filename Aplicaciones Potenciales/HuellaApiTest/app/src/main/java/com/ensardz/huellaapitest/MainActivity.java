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
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private TextView textView12;
    private TextView textView13;
    private TextView textView14;
    private TextView textView15;
    private TextView textView16;
    private TextView textView17;
    private TextView textView18;
    private TextView textView19;
    private TextView textView20;
    private TextView textView21;
    private TextView textView22;
    private TextView textView23;
    private TextView textView24;


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
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView22 = (TextView) findViewById(R.id.textView22);
        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);

    }


    //Les asignamos a los textViews los valores que recogimos de la api//
    private void setResult(List<Object> objects)
    {
        textView1.setText(objects.get(0).getPlan());
        textView2.setText(objects.get(0).getRoomType());
        textView3.setText(objects.get(0).getId());
        textView4.setText(objects.get(0).getRoom());
        textView5.setText(objects.get(0).getRoomDescription());
        textView6.setText(objects.get(0).getAssigmentCode());
        textView7.setText(objects.get(0).getAssigment());
        textView8.setText(objects.get(0).getAcademyHour());
        textView9.setText(objects.get(0).getStartClassAt());
        textView10.setText(objects.get(0).getFinishClassAt());
        textView11.setText(objects.get(0).getBarcode());
        textView12.setText(objects.get(0).getEmployeeNumber());
        textView13.setText(objects.get(0).getEmployeeNumber());
        textView14.setText(objects.get(0).getType());
        textView15.setText(objects.get(0).getName());
        textView16.setText(objects.get(0).getFullName());
        textView17.setText(objects.get(0).getFingerPrint());
        textView18.setText(objects.get(0).getStatusCode());
        textView19.setText(objects.get(0).getCreatedAt());
        textView20.setText(objects.get(0).getStartClassAt());
        textView21.setText(objects.get(0).getVisitAt());
        textView22.setText(objects.get(0).getSignedAt());
        textView23.setText(objects.get(0).getFinishClassAt());
        textView24.setText(objects.get(0).getUpdatedAt());

    }


} //Final del MAIN//
