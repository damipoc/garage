package com.qa.domain;

public class Car extends Vehicles{

    private int doors;
    private boolean manual;

    public Car() {
    }

    public Car(int yearMake, String model, String colour, float topSpeed, int doors, boolean manual) {
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
        return "Car [doors=" + doors + ", manual=" + manual + "]";
    }

    public String type() {
        return "Car";
    }
    
}
