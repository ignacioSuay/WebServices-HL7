package com.hl7integration.ws.Server;


public class Patient {

    private String name;

    private String surname;

    private int nhsNumber;

    public Patient(String name, String surname, int nhsNumber) {
        this.name = name;
        this.surname = surname;
        this.nhsNumber = nhsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNhsNumber() {
        return nhsNumber;
    }

    public void setNhsNumber(int nhsNumber) {
        this.nhsNumber = nhsNumber;
    }
}
