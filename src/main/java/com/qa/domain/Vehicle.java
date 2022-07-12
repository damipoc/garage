/**
 * @author
 * Damian Poclitar 
 */

package com.qa.domain;

public class Vehicle {

    private String type;
    private int yearMake;
    private String model;
    private String colour;
    private double topSpeed;

    public Vehicle() {
    }

    public Vehicle(String type, int yearMake, String model, String colour, double topSpeed) {
        this.type = type;
        this.yearMake = yearMake;
        this.model = model;
        this.colour = colour;
        this.topSpeed = topSpeed;
    }

    /**
     * @return String of type of vehicle
     */
    public String getType() {
        return type;
    }

    /**
     * @param type set the type of vehicle
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return int of year make of vehicle
     */
    public int getYearMake() {
        return yearMake;
    }

    /**
     * @param yearMake set the year of make of vehicle
     */
    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

    /**
     * @return String of the model vehicle
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model set the model vehicle
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String of the colour vehicle
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour set the colour vehicle
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return double of top speed vehicle
     */
    public double getTopSpeed() {
        return topSpeed;
    }

    /**
     * @param topSpeed set the top speed vehicle
     */
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    /**
     * @return String simple toString
     */
    @Override
    public String toString() {
        return "Vehicle \n Year of make: " + yearMake + "\n Model: " + model + "\n Colour: " + colour + "\n Top Speed: "
                + topSpeed;
    }

}
