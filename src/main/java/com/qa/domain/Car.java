package com.qa.domain;

public class Car extends Vehicle{

    private int doors;
    private boolean manual;

    public Car() {
    }

    public Car(int yearMake, String model, String colour, double topSpeed, int doors, boolean manual) {
        super(yearMake, model, colour, topSpeed);
        this.doors = doors;
        this.manual = manual;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    @Override
    public String toString() {
        return "\nCar \n Year of make: " + getYearMake() + "\n Model: " + getModel() + "\n Colour: "+ getColour() + "\n Top Speed: " + getTopSpeed() + "MPH \n Doors: " + doors + "\n Manual: " + manual;
    }

    public String type() {
        return "Car";
    }
    
}
