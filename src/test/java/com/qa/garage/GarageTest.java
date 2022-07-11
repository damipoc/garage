package com.qa.garage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.domain.Car;

public class GarageTest {

    Garage tryMe = new Garage();

    @Test
    public void addVehicle() {
        Car testCar = new Car("Car", 2008, "Mitsubishi Lancer",
                "Red", 155, 4, true);

        assertEquals("Vehicle added to the garage.", tryMe.addVehicle(testCar));

    }

    @Test
    public void removeVehicle() {
        Car testCar = new Car("Car", 2008, "Mitsubishi Lancer",
                "Red", 155, 4, true);
        tryMe.addVehicle(testCar);

        assertEquals("Vehicle removed from the garage.", tryMe.removeVehicle(testCar));
    }

    @Test
    public void removeType() {
        Car testCar = new Car("Car", 2008, "Mitsubishi Lancer",
                "Red", 155, 4, true);
        tryMe.addVehicle(testCar);

        assertEquals("All Cars removed from the garage.", tryMe.removeType("Car"));

    }

    @Test
    public void removeAll() {
        Car testCar = new Car("Car", 2008, "Mitsubishi Lancer",
                "Red", 155, 4, true);
        tryMe.addVehicle(testCar);

        assertEquals("Garage emptied.", tryMe.removeAll());
    }

    @Test
    public void print() {
        Car testCar = new Car("Car", 2008, "Mitsubishi Lancer",
                "Red", 155, 4, true);
        tryMe.addVehicle(testCar);

        assertEquals("A list of all vehicles in the garage.", tryMe.print());

    }

}
