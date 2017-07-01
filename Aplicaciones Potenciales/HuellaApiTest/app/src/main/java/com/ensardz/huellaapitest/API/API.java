package com.ensardz.huellaapitest.API;

import com.ensardz.huellaapitest.API.Deserializers.MyDeserializer;
import com.ensardz.huellaapitest.Models.Object;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    //https://young-escarpment-48238.herokuapp.com/routes
    public static final String BASE_URL = "https://young-escarpment-48238.herokuapp.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getApi(){
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