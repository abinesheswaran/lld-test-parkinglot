package org.example;

abstract public class Vechicle {
    private String registrationNumber;
    private String modelNumber;
    private String color;

    public Vechicle(java.lang.String registrationNumber, java.lang.String modelNumber, java.lang.String color) {
        this.registrationNumber = registrationNumber;
        this.modelNumber = modelNumber;
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
