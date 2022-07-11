package com.qa.domain;

public class ElectronicBike extends Vehicle {

    private int MaxDistPerCharge;

    public ElectronicBike() {
    }

    public ElectronicBike(int yearMake, String model, String colour, double topSpeed, int maxDistPerCharge) {
        super(yearMake, model, colour, topSpeed);
        MaxDistPerCharge = maxDistPerCharge;
    }

    public int getMaxDistPerCharge() {
        return MaxDistPerCharge;
    }

    public void setMaxDistPerCharge(int maxDistPerCharge) {
        MaxDistPerCharge = maxDistPerCharge;
    }

    @Override
    public String toString() {
        return "\nE-Bike \n Year of make: " + getYearMake() + "\n Model: " + getModel() + "\n Colour: " + getColour()
                + "\n Top Speed: " + getTopSpeed() + "MPH \n Max distance per full charge: " + MaxDistPerCharge
                + " Miles";
    }

    public String type() {
        return "E-Bike";
    }

}
