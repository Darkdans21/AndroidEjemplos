package com.ensardz.huellaapitest.Models;

public class Object
{
    //Aqui declaramos las variables privadas.//

    private String plan;
    private String roomType;
    private String id;
    private String room;
    private String roomDescription;
    private String assigmentCode;
    private String assigment;
    private String academyHour;
    private String startClassAt;
    private String finishClassAt;
    private String barcode;

    private String employeeNumber;
    private String type;
    private String name;
    private String fullName;
    private String fingerPrint;

    private String hexcode;

    private String statusCode;
    private String createdAt;
    private String startedAt;
    private String visitAt;
    private String signedAt;
    private String finishedAt;
    private String updatedAt;




    //Aquí se declara la clase vacia para hacer la sobrecarga de constructores//
    public Object()
    {

    }


    //Aqui se aplica el constructor.//

    public Object(String plan, String roomType, String id, String room, String roomDescription, String assigmentCode, String assigment, String academyHour, String startClassAt, String finishClassAt, String barcode, String employeeNumber, String type, String name, String fullName, String fingerPrint, String statusCode, String createdAt, String startedAt, String visitAt, String signedAt, String finishedAt, String updatedAt) {
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
        this.employeeNumber = employeeNumber;
        this.type = type;
        this.name = name;
        this.fullName = fullName;
        this.fingerPrint = fingerPrint;
        this.statusCode = statusCode;
        this.createdAt = createdAt;
        this.startedAt = startedAt;
        this.visitAt = visitAt;
        this.signedAt = signedAt;
        this.finishedAt = finishedAt;
        this.updatedAt = updatedAt;
    }

    //Aqui aplicamos los Setter y Getters del constructor para tener acceso a los datos privados, con la intencion de no modificar directamente los datos//


    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
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

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getVisitAt() {
        return visitAt;
    }

    public void setVisitAt(String visitAt) {
        this.visitAt = visitAt;
    }

    public String getSignedAt() {
        return signedAt;
    }

    public void setSignedAt(String signedAt) {
        this.signedAt = signedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
