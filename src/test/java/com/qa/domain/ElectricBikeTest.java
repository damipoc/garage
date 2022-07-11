package com.qa.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElectricBikeTest {

    ElectricBike tryMe = new ElectricBike("E-Bike", 2021, "Pure Flux One", "Black", 35, 25);

    @Test
    void getMaxDistPerCharge() {

        assertEquals(25, tryMe.getMaxDistPerCharge());

    }

}
