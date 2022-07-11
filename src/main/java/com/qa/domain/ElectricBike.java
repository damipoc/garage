package com.qa.domain;

public class ElectricBike extends Vehicle {

    private int MaxDistPerCharge;

    public ElectricBike() {
    }

    public ElectricBike(String type, int yearMake, String model, String colour, double topSpeed,
            int maxDistPerCharge) {
        super(type, yearMake, model, colour, topSpeed);
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
}
