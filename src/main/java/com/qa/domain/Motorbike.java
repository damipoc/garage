package com.qa.domain;

public class Motorbike extends Vehicles{

    private double litresFuel;
    private int seats;

    

    public Motorbike() {
    }

    public Motorbike(int yearMake, String model, String colour, float topSpeed, double litresFuel, int seats) {
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
        return "Motorbike [litresFuel=" + litresFuel + ", seats=" + seats + "]";
    }

    public String type() {
        return "Motorbike";
    }
    

    
}
