package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CropDusterTest {

    private CropDuster cropDuster;
    private Pilot validPilot;
    private Pilot invalidPilot;

    @BeforeEach
    public void setUp() {
        cropDuster = new CropDuster();
        validPilot = new Pilot();
        invalidPilot = null;
    }

    @Test
    public void testConstructorOperational() {
        CropDuster cropDuster = new CropDuster();

        boolean isOperational = cropDuster.isOperational();

        assertTrue(isOperational, "Should be operational.");
    }

    @Test
    public void testFlyWithValidPilotOperational() {
        cropDuster.setOperational(true);

        boolean expected = true;
        boolean actual = cropDuster.fly(validPilot);

        assertEquals(expected, actual);
    }

    @Test
    public void testFlyWithInvalidPilotOperational() {
        cropDuster.setOperational(false);

        boolean expected = false;
        boolean actual = cropDuster.fly(invalidPilot);

        assertEquals(expected, actual);
    }

    @Test
    public void testSetOperationalStatus() {
        CropDuster cropDuster = new CropDuster(false);

        cropDuster.setOperational(true);

        assertTrue(cropDuster.isOperational(), "CropDuster should operate.");
    }


}
