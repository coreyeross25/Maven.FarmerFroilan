package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FarmVehicleTest {

    private Tractor operationalTractor;
    private Tractor nonOperationalTractor;

    @BeforeEach
    public void setUp() {
        operationalTractor = new Tractor(true, "Vroom");
        nonOperationalTractor = new Tractor(false, "silent");
    }

    @Test
    public void testInstanceOfVehicle() {
        //Given
        Tractor tractor = new Tractor();

        boolean isInstanceOfVehicle = tractor instanceof Vehicle;

        assertTrue(isInstanceOfVehicle, "Tractor should be an instance of vehicle.");
    }

    @Test
    public void testTractorImplementsFarmVehicle() {
        Tractor tractor = new Tractor();

        boolean implementsFarmVehicle = tractor instanceof FarmVehicle;

        assertTrue(implementsFarmVehicle, "Tractor should implement FarmVehicle.");
    }

    @Test
    public void testOperateOnFarm_OperationalTractor_Success() {
        //Given - an operational tractor
        Boolean expected = true;

        //When
        Boolean actual = operationalTractor.operateOnFarm();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testOperateOnFarm_NonOperationalTractor_Failure(){
        //Given a non-operational tractor
        Boolean expected = false;

        //When
        Boolean actual = nonOperationalTractor.operateOnFarm();

        //Then
        assertEquals(expected, actual);
    }


}
