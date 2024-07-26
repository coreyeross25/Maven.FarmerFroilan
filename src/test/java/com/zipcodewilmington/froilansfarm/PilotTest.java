package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilotTest {

    private Pilot pilot;
    private CropDuster cropDuster;

    @BeforeEach
    public void setUp() {
        pilot = new Pilot();
        cropDuster = new CropDuster();
    }

    @Test
    public void testMountAircraftSuccessfully() {
        String result = pilot.mount(cropDuster);
        assertEquals("Mounted successfully.", result);
    }

    @Test
    public void testDismountAircraftSuccessfully() {
        pilot.mount(cropDuster);
        String result = pilot.dismount(cropDuster);
        assertEquals("Dismounted successfully.", result);
    }

    @Test
    public void testMountAircraftWhenNotOperational() {
        cropDuster.setOperational(false);
        String result = pilot.mount(cropDuster);
        assertEquals("Aircraft is not operational.", result);
    }

    @Test
    public void testDismountAircraftWhenNotMounted() {
        String result = pilot.dismount(cropDuster);
        assertEquals("Not mounted on this aircraft.", result);
    }

    @Test
    public void testMountNullAircraft() {
        String result = pilot.mount(null);
        assertEquals("Cannot mount a null aircraft.", result);
    }

    @Test
    public void testDismountNullAircraft() {
        String result = pilot.dismount(null);
        assertEquals("Cannot dismount a null aircraft.", result);
    }
}
