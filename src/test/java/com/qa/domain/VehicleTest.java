package com.qa.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    Vehicle tryMe = new Vehicle("Car", 2008, "Mitsubishi Lancer",
            "Red", 155);

    @Test
    public void getType() {

        assertEquals("Car", tryMe.getType());

    }

    @Test
    public void getYearMake() {

        assertEquals(2008, tryMe.getYearMake());

    }

    @Test
    public void getModel() {
        assertEquals("Mitsubishi Lancer", tryMe.getModel());
    }

    @Test
    public void getColour() {
        assertEquals("Red", tryMe.getColour());
    }

    @Test
    public void getTopSpeed() {
        assertEquals(155, tryMe.getTopSpeed());
    }

}
