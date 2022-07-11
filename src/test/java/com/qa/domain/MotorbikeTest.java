package com.qa.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MotorbikeTest {
    
    Motorbike tryMe = new Motorbike("Motorbike", 2018, "Yamaha YZF-100 R1", "Red", 178.6, 17, 1);

    @Test
    public void getLitresFuel() {

        assertEquals(17, tryMe.getLitresFuel());

    }

    @Test
    public void getSeats() {

        assertEquals(1, tryMe.getSeats());

    }

}
