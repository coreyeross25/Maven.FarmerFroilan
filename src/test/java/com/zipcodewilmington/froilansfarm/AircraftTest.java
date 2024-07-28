package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AircraftTest {

    private CropDuster cropDuster;
    private Pilot validPilot;
    private Pilot invalidPilot;

    @BeforeEach
    public void setUp() {
        // Initialize the Aircraft and Pilots
        cropDuster = new CropDuster();
        validPilot = new Pilot() {
            @Override
            public String mount(Tractor tractor) {
                return "";
            }
        };
        invalidPilot = null;
    }

    @Test
    public void testInstanceOfAircraft() {
        // Given
        boolean isInstanceOfAircraft = cropDuster instanceof Aircraft;

        // Then
        assertTrue(isInstanceOfAircraft, "CropDuster should be an instance of Aircraft.");
    }

    @Test
    public void testFly_WithValidPilot_Success() {
        // Given
        Boolean expected = true;

        // When
        Boolean actual = cropDuster.fly(validPilot);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testFly_WithInvalidPilot_Failure() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = cropDuster.fly(invalidPilot);

        // Then
        assertEquals(expected, actual);
    }
}
