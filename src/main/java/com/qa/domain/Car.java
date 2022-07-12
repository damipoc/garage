/**
 * @author
 * Damian Poclitar 
 */

package com.qa.domain;

public class Car extends Vehicle {

    private int doors;
    private boolean manual;

    public Car() {
    }

    public Car(String type, int yearMake, String model, String colour, double topSpeed, int doors, boolean manual) {
        super(type, yearMake, model, colour, topSpeed);
        this.doors = doors;
        this.manual = manual;
    }

    /**
     * @return int of the car doors
     */
    public int getDoors() {
        return doors;
    }

    /**
     * @param doors how many car doors the car has
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    /**
     * @return boolean of if the car is manual
     */
    public boolean isManual() {
        return manual;
    }

    /**
     * @param manual boolean if the car is manual if false we assume its automatic
     */
    public void setManual(boolean manual) {
        this.manual = manual;
    }

    /**
     * @return String simple toString
     */
    @Override
    public String toString() {
        return "\nCar \n Year of make: " + getYearMake() + "\n Model: " + getModel() + "\n Colour: " + getColour()
                + "\n Top Speed: " + getTopSpeed() + "MPH \n Doors: " + doors + "\n Manual: " + manual;
    }
}
