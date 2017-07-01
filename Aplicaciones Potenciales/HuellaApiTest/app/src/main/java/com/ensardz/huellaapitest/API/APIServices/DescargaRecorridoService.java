package com.ensardz.huellaapitest.API.APIServices;

import com.ensardz.huellaapitest.Models.Object;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DescargaRecorridoService
{
    //@GET("/routes") es el pedazo de link que le falta a la BASE_URL para sacar la informacion//
    @GET("/routes")
    Call<List<Object>> getRecorrido();
    //Creamos la LLamada de una lista de objetos //

}
