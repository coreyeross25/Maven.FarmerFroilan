package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FarmerTest {


    private Farmer farmer;
    private Tractor tractor;

    @BeforeEach
    public void setUp() {
        // Initialize the Farmer and Tractor
        farmer = new Farmer() {
            @Override
            public String mount(Aircraft<Pilot> aircraft) {
                return "";
            }

            @Override
            public String dismount(Aircraft<Pilot> aircraft) {
                return "";
            }
        };
        tractor = new Tractor(true, "Vroom");
    }

    @Test
    public void testMountTractor() {
        String expectedMessage = "Farmer MOUNTS Tractor";

        String result = farmer.mount(tractor);

        // Then
        assertEquals(expectedMessage, result);
    }

    @Test
    public void testDismountTractor() {
        // Assuming the dismount method for Tractor returns a specific message
        String expectedMessage = "Farmer DISMOUNTS Tractor";
        // Simulate the expected behavior
        String result = farmer.dismount(tractor);

        // Then
        assertEquals(expectedMessage, result);
    }
}
