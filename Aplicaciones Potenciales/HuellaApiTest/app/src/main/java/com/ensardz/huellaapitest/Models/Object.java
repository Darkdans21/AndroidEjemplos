package com.ensardz.huellaapitest.Models;

import com.ensardz.huellaapitest.Datos.Objetos.Checkout;
import com.ensardz.huellaapitest.Datos.Objetos.Owner;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Leonardo Padilla on 30/06/2017.
 */

public class Object {

    private Integer plan;
    private Integer roomType;
    private String id;
    private String room;
    private String roomDescription;
    private String assigmentCode;
    private String assigment;
    private String academyHour;
    private String startClassAt;
    private String finishClassAt;
    private String barcode;

public Object(){
}

    public Object(Integer plan, Integer roomType, String id, String room, String roomDescription, String assigmentCode, String assigment, String academyHour, String startClassAt, String finishClassAt, String barcode) {
        this.plan = plan;
        this.roomType = roomType;
        this.id = id;
        this.room = room;
        this.roomDescription = roomDescription;
        this.assigmentCode = assigmentCode;
        this.assigment = assigment;
        this.academyHour = academyHour;
        this.startClassAt = startClassAt;
        this.finishClassAt = finishClassAt;
        this.barcode = barcode;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getAssigmentCode() {
        return assigmentCode;
    }

    public void setAssigmentCode(String assigmentCode) {
        this.assigmentCode = assigmentCode;
    }

    public String getAssigment() {
        return assigment;
    }

    public void setAssigment(String assigment) {
        this.assigment = assigment;
    }

    public String getAcademyHour() {
        return academyHour;
    }

    public void setAcademyHour(String academyHour) {
        this.academyHour = academyHour;
    }

    public String getStartClassAt() {
        return startClassAt;
    }

    public void setStartClassAt(String startClassAt) {
        this.startClassAt = startClassAt;
    }

    public String getFinishClassAt() {
        return finishClassAt;
    }

    public void setFinishClassAt(String finishClassAt) {
        this.finishClassAt = finishClassAt;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

}
