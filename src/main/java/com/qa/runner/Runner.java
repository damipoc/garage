package com.qa.runner;

import com.qa.domain.*;

public class Runner {

    public static void main(String[] args) {

        Car Mitsubishi = new Car(2008, "Mitsubishi Lancer", "Red", 155, 4, true);
        Car Audi = new Car(2018, "Audi A8", "Silver", 155, 4, false);

        Motorbike Yamaha = new Motorbike(2018, "Yamaha YZF-100 R1", "Red", 178.6, 17, 1);
        Motorbike BMW = new Motorbike(2009, "BMW K 1300 R", "Silver", 165.2, 19, 2);

        ElectronicBike Pure = new ElectronicBike(2021, "Pure Flux One", "Black", 35, 25);
        ElectronicBike Canyon = new ElectronicBike(2021, "Canyon Roadlite:On", "Silver", 25, 120);

        System.out.println(Mitsubishi);
        System.out.println(Audi);
        System.out.println(Yamaha);
        System.out.println(BMW);
        System.out.println(Pure);
        System.out.println(Canyon);

    }

}
