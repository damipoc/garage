/**
 * @author
 * Damian Poclitar 
 */

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

    /**
     * @param vehicle adds the vehicle to the array list
     * @return String confirmation of vehicle being added
     */
    public String addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        return "Vehicle added to the garage.";
    }

    /**
     * @param vehicle removes vehicle from the array list
     * @return String confirmation of the vehicle being removed
     */
    public String removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
        return "Vehicle removed from the garage.";
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

    /**
     * @param type type of vehicle to remove from the array list
     * @return String confirmation of the type being removed
     */
    public String removeType(String type) {
        List<Vehicle> removeVehicles = new ArrayList<Vehicle>();

        for (Vehicle v : vehicles) {
            if (v.getType() == type) {
                removeVehicles.add(v);
            }
        }

        for (Vehicle v : removeVehicles) {
            vehicles.remove(v);
        }

        return "All " + type + "s removed from the garage.";

    }

    /**
     * @return String confirmation of all the vehicles being returned
     */
    public String print() {

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        return "A list of all vehicles in the garage.";

    }

    /**
     * @return String confirmation of the vehicle being removed
     */
    public String removeAll() {
        vehicles.clear();

        return "Garage emptied.";
    }

}
