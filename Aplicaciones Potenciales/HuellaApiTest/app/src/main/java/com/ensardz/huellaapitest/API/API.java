package com.ensardz.huellaapitest.API;

import com.ensardz.huellaapitest.API.Deserializers.MyDeserializer;
import com.ensardz.huellaapitest.Models.Object;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    public static final String BASE_URL = "https://young-escarpment-48238.herokuapp.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getApi(){
        if (retrofit == null) {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(Object.class, new MyDeserializer());
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build();
        }
        return retrofit;
    }

}
