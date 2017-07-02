package com.ensardz.huellaapitest.API;

import com.ensardz.huellaapitest.API.Deserializers.MyDeserializer;
import com.ensardz.huellaapitest.Models.Object;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API
{
    //El siguiente link que esta completo es donde almacenamos nuestra base de datos JSON en "HEROKU"//
    //https://young-escarpment-48238.herokuapp.com/routes

    //Aqui Escribimos Final para que no se modifique el URL que utilizamos para acceder a los datos JSON//
    public static final String BASE_URL = "https://young-escarpment-48238.herokuapp.com/";

    //Inicializamos Retrofit como nullo//
    private static Retrofit retrofit = null;


    ////
    public static Retrofit getApi()
    {
        //Si retrofit es null tomara los datos de la lista de objetos//
        if(retrofit == null){
            Type listType = new TypeToken<List<Object>>(){}.getType();

            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(listType, new MyDeserializer());

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build();
        }
        return retrofit;
    }
}