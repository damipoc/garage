package com.qa.domain;

public class Garage {

    private int yearMake;
    private String model;
    private String colour;
    private float topSpeed;


    public Garage() {
    }

    
    public Garage(int yearMake, String model, String colour, float topSpeed) {
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
    public float getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }


    @Override
    public String toString() {
        return "Garage [colour=" + colour + ", model=" + model + ", topSpeed=" + topSpeed + ", yearMake=" + yearMake
                + "]";
    }

    
}
