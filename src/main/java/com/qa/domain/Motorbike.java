/**
 * @author
 * Damian Poclitar 
 */

package com.qa.domain;

public class Motorbike extends Vehicle {

    private double litresFuel;
    private int seats;

    public Motorbike() {
    }

    public Motorbike(String type, int yearMake, String model, String colour, double topSpeed, double litresFuel,
            int seats) {
        super(type, yearMake, model, colour, topSpeed);
        this.litresFuel = litresFuel;
        this.seats = seats;
    }

    /**
     * @return double of max litres of fuel
     */
    public double getLitresFuel() {
        return litresFuel;
    }

    /**
     * @param litresFuel set how many litres of fuel it can have
     */
    public void setLitresFuel(double litresFuel) {
        this.litresFuel = litresFuel;
    }

    /**
     * @return int of how many seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @param seats et how many seats it contains
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * @return String simple toString
     */
    @Override
    public String toString() {
        return "\nMotorbike \n Year of make: " + getYearMake() + "\n Model: " + getModel() + "\n Colour: " + getColour()
                + "\n Top Speed: " + getTopSpeed() + "MPH \n Fuel capacity: " + litresFuel + "L \n Seats: " + seats;
    }
}
