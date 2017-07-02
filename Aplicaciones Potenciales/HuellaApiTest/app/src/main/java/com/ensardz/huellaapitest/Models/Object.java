package com.ensardz.huellaapitest.Models;

public class Object
{
    //Aqui declaramos las variables privadas.//
    private String id;
    private String room;
    private String roomDescription;
    private String assigmentCode;
    private String assigment;
    private String academyHour;
    private String startClassAt;
    private String finishClassAt;
    private String barcode;

    //Aquí se declara la clase vacia para hacer la sobrecarga de constructores//
    public Object()
    {

    }


    //Aqui se aplica el constructor.//
    public Object(String id, String room, String roomDescription, String assigmentCode, String assigment, String academyHour, String startClassAt, String finishClassAt, String barcode) {
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


    //Aqui aplicamos los Setter y Getters del constructor para tener acceso a los datos privados, con la intencion de no modificar directamente los datos//
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
    public void setRoomDescription(String roomDescription) {  this.roomDescription = roomDescription; }

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
