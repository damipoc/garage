package com.qa.domain;

public class ElectronicBike extends Garage{

    private int MaxDistPerCharge;

    public ElectronicBike() {
    }

    public ElectronicBike(int yearMake, String model, String colour, float topSpeed, int maxDistPerCharge) {
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
        return "ElectronicBike [MaxDistPerCharge=" + MaxDistPerCharge + "]";
    }

    public String type() {
        return "E-Bike";
    }

    
    
}
