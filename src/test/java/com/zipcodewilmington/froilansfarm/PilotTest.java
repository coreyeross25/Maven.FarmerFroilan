package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PilotTest {

    private Pilot pilot;
    private CropDuster cropDuster;

    @BeforeEach
    public void setUp() {
        pilot = new Pilot() {
            @Override
            public String mount(Tractor tractor) {
                return "";
            }
        };
        cropDuster = new CropDuster();
    }

    @Test
    public void testMountAircraftSuccessfully() {
        String result = pilot.mount(cropDuster);
        assertEquals("MOUNTED", result);
    }

    @Test
    public void testDismountAircraftSuccessfully() {
        pilot.mount(cropDuster);
        String result = pilot.dismount(cropDuster);
        assertEquals("DISMOUNTED successfully", result);
    }

    @Test
    public void testMountAircraftWhenNotOperational() {
        cropDuster.setOperational(false);
        String result = pilot.mount(cropDuster);
        assertEquals("AIRCRAFT is NOT Operational", result);
    }

    @Test
    public void testDismountAircraftWhenNotMounted() {
        String result = pilot.dismount(cropDuster);
        assertEquals("NOT MOUNTED", result);
    }

    @Test
    public void testMountNullAircraft() {
        String result = pilot.mount((Aircraft<Pilot>) null);
        assertEquals("CANNOT MOUNT", result);
    }

    @Test
    public void testDismountNullAircraft() {
        String result = pilot.dismount(null);
        assertEquals("CANNOT DISMOUNT", result);
    }
}
