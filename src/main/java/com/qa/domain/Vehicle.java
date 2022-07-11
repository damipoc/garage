package com.qa.domain;

public class Vehicle {

    private int yearMake;
    private String model;
    private String colour;
    private double topSpeed;


    public Vehicle() {
    }

    
    public Vehicle(int yearMake, String model, String colour, double topSpeed) {
        this.yearMake = yearMake;
        this.model = model;
        this.colour = colour;
        this.topSpeed = topSpeed;
    }



    public int getYearMake() {
        return yearMake;
    }
    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }


    @Override
    public String toString() {
        return "Vehicle \n Year of make: " + yearMake + "\n Model: " + model + "\n Colour: "+ colour + "\n Top Speed: " + topSpeed;
    }

    
}
