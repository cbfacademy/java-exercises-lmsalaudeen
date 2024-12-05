package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private int year;

    // constructor
    public Car (String make, String model,int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }

}

