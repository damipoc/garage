package com.qa.domain;

public class Motorbike extends Vehicle {

    private double litresFuel;
    private int seats;

    public Motorbike() {
    }

    public Motorbike(int yearMake, String model, String colour, double topSpeed, double litresFuel, int seats) {
        super(yearMake, model, colour, topSpeed);
        this.litresFuel = litresFuel;
        this.seats = seats;
    }

    public double getLitresFuel() {
        return litresFuel;
    }

    public void setLitresFuel(double litresFuel) {
        this.litresFuel = litresFuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "\nMotorbike \n Year of make: " + getYearMake() + "\n Model: " + getModel() + "\n Colour: " + getColour()
                + "\n Top Speed: " + getTopSpeed() + "MPH \n Fuel capacity: " + litresFuel + "L \n Seats: " + seats;
    }

    public String type() {
        return "Motorbike";
    }

}
