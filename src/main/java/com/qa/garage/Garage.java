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

    public void fix() {

        for (Vehicle v : vehicles) {
            int cost = 0;
            String type = v.getType();
            if (type == "Car") {
                cost += 500;
                if (v.getYearMake() > 2010) {
                    cost += 300;
                }
            } else if (type == "Motorbike") {
                if (v.getYearMake() > 2010) {
                    cost += 150;
                }
                cost += 300;
            } else if (type == "E-Bike") {
                if (v.getYearMake() > 2020) {
                    cost += 100;
                }
                cost += 150;
            }
            System.out.println(v);
            System.out.println("Total cost to fix: " + cost + " Pounds");
        }

    }

    public void print() {

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

    }

    public void removeAll() {
        vehicles.clear();
    }

}
