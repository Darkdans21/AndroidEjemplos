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

    @Override
    public List<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

    //    Integer plan = json.getAsJsonObject().get("id").getAsInt();
    //    Integer roomType = json.getAsJsonObject().get("roomType").getAsInt();
        int i;

        //Resumiendo lineas de codigo usando la variable ElementoM//
        JsonArray ArrayM = json.getAsJsonObject().get("m").getAsJsonArray();

        List<Object> objetos = new ArrayList<Object>();

        for(i = 0; i<ArrayM.size(); i++){
            //Resumiendo mas linea de codigo guardando en la variable elemento//
            JsonObject elemento = ArrayM.get(i).getAsJsonObject();

//            Integer plan = elemento.get("id").getAsInt();
//            Integer roomType = elemento.get("roomType").getAsInt();
            String id = elemento.get("id").getAsString();
            String room = elemento.get("room").getAsString();
            String roomDescribe = elemento.get("roomDescription").getAsString();
            String assigmentCode = elemento.get("assigmentCode").getAsString();
            String assigment = elemento.get("assigment").getAsString();
            String academyHour = elemento.get("academyHour").getAsString();
            String startClassAt = elemento.get("startClassAt").getAsString();
            String finishClassAt = elemento.get("finishClassAt").getAsString();
            String barcode = elemento.get("barcode").getAsString();
            objetos.add(new Object(id,room,roomDescribe,assigmentCode, assigment, academyHour, startClassAt, finishClassAt, barcode));

        }
        return objetos;
    }
}
