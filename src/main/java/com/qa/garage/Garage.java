package com.qa.garage;

import java.util.*;

import com.qa.domain.Vehicle;

public class Garage {

    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Garage() {
    }

    public Garage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public void print() {

        for (Vehicle vehicle : vehicles) {
           System.out.println(vehicle); 
        }

    }
    
    
}
