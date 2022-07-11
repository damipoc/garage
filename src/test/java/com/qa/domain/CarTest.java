package com.qa.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {

    Car tryMe = new Car("Car", 2008, "Mitsubishi Lancer",
            "Red", 155, 4, true);

    @Test
    public void getDoors() {

        assertEquals(4, tryMe.getDoors());

    }

    @Test
    public void isManual() {

        assertEquals(true, tryMe.isManual());
    }

}
