package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderTest {

    private Farmer farmer;
    private Tractor tractor;

    @BeforeEach
    public void setUp() {
        // INITIIALIZE the Farmer and Tractor
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
        // Given
        String expectedMessage = "Farmer MOUNTS Tractor";

        // When
        String result = farmer.mount(tractor);

        // Then
        assertEquals(expectedMessage, result);
    }

    @Test
    public void testDismountTractor() {
        // Given
        String expectedMessage = "Farmer DISMOUNTS Tractor";

        // When
        String result = farmer.dismount(tractor);

        // Then
        assertEquals(expectedMessage, result);
    }
}
