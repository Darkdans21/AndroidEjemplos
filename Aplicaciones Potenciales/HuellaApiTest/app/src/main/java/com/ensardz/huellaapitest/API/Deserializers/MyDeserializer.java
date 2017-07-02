package com.ensardz.huellaapitest.API.Deserializers;

import com.ensardz.huellaapitest.Models.Object;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MyDeserializer implements JsonDeserializer <List<Object>>
{
    //Creamos un Incremento en i//
    int i;

    //Descompone el Json para guardar los campos a un objeto java.//
    @Override
    public List<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {


        //Resumiendo lineas de codigo usando la variable ElementoM//
        JsonArray ArrayM = json.getAsJsonObject().get("m").getAsJsonArray();

        //Se inicializa la lista de objetos vacia para el arreglo//
        List<Object> objetos = new ArrayList<Object>();


        //En este iterador esta guardando los objetos a la lista//
        for(i = 0; i<ArrayM.size(); i++)
        {
            //Resumiendo mas linea de codigo guardando tu chorizo en la variable elemento//
            JsonObject elemento = ArrayM.get(i).getAsJsonObject();

            //Sacando los valores del link del JSON y Asignando a las variables//
            String id = elemento.get("id").getAsString();
            String room = elemento.get("room").getAsString();
            String roomDescribe = elemento.get("roomDescription").getAsString();
            String assigmentCode = elemento.get("assigmentCode").getAsString();
            String assigment = elemento.get("assigment").getAsString();
            String academyHour = elemento.get("academyHour").getAsString();
            String startClassAt = elemento.get("startClassAt").getAsString();
            String finishClassAt = elemento.get("finishClassAt").getAsString();
            String barcode = elemento.get("barcode").getAsString();

            //Aqui se agregan un objeto nuevo a la lista //
            objetos.add(new Object(id,room,roomDescribe,assigmentCode, assigment, academyHour, startClassAt, finishClassAt, barcode));
        }

        //Regresando objetos//
        return objetos;
    }
}
