package com.ensardz.huellaapitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.ensardz.huellaapitest.API.API;
import com.ensardz.huellaapitest.Datos.Objetos.HuellaResponse;
import com.ensardz.huellaapitest.API.APIServices.DescargaRecorridoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.ensardz.huellaapitest.Models.Object;


public class MainActivity extends AppCompatActivity {

    private DescargaRecorridoService service;
    private Call<HuellaResponse> huellaCall;

//    public static final String TAG = MainActivity.class.getSimpleName();
    // https://young-escarpment-48238.herokuapp.com/routes


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = API.getApi().create(DescargaRecorridoService.class);


        huellaCall = service.getRecorrido();
        huellaCall.enqueue(new Callback<HuellaResponse>() {
            @Override
            public void onResponse(Call<HuellaResponse> call, Response<HuellaResponse> response)
            {
                HuellaResponse respuesta = response.body();
                Log.i("prueba",String.valueOf(response));
                Toast.makeText(MainActivity.this, "chido" + response, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<HuellaResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
