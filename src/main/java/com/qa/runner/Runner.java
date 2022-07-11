package com.qa.runner;

import com.qa.domain.*;
import com.qa.garage.Garage;

public class Runner {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car Mitsubishi = new Car("Car", 2008, "Mitsubishi Lancer", "Red", 155, 4, true);
        Car Audi = new Car("Car", 2018, "Audi A8", "Silver", 155, 4, false);

        Motorbike Yamaha = new Motorbike("Motorbike", 2018, "Yamaha YZF-100 R1", "Red", 178.6, 17, 1);
        Motorbike BMW = new Motorbike("Motorbike", 2009, "BMW K 1300 R", "Silver", 165.2, 19, 2);

        ElectronicBike Pure = new ElectronicBike("E-Bike", 2021, "Pure Flux One", "Black", 35, 25);
        ElectronicBike Canyon = new ElectronicBike("E-Bike", 2021, "Canyon Roadlite:On", "Silver", 25, 120);

        garage.addVehicle(Mitsubishi);
        garage.addVehicle(Audi);
        garage.addVehicle(Yamaha);
        garage.addVehicle(BMW);
        garage.addVehicle(Pure);
        garage.addVehicle(Canyon);

        garage.fix();

        garage.removeVehicle(BMW);

        garage.print();

        garage.removeAll();

        garage.print();
    }

}
