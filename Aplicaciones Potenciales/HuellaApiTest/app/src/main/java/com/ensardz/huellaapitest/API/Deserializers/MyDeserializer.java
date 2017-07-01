package com.ensardz.huellaapitest.API.Deserializers;

import com.ensardz.huellaapitest.Datos.Objetos.Checkout;
import com.ensardz.huellaapitest.Datos.Objetos.Owner;
import com.ensardz.huellaapitest.Models.Object;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;



    public class MyDeserializer implements JsonDeserializer<Object> {


    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Integer plan = json.getAsJsonObject().get("id").getAsInt();
        Integer roomType = json.getAsJsonObject().get("roomType").getAsInt();
        String id = json.getAsJsonObject().get("id").getAsString();
        String room = json.getAsJsonObject().get("room").getAsString();
        String roomDescription = json.getAsJsonObject().get("roomDescription").getAsString();
        String assigmentCode = json.getAsJsonObject().get("assigmentCode").getAsString();
        String assigment = json.getAsJsonObject().get("assigment").getAsString();
        String academyHour = json.getAsJsonObject().get("academyHour").getAsString();
        String startClassAt = json.getAsJsonObject().get("startClassAt").getAsString();
        String finishClassAt = json.getAsJsonObject().get("finishClassAt").getAsString();
        String barcode = json.getAsJsonObject().get("barcode").getAsString();
//        Owner owner
//        Checkout checkout

        Object object = new Object(plan,roomType,id,room,roomDescription,assigmentCode, assigment, academyHour, startClassAt, finishClassAt, barcode);
        return object;



    }
}
