package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Vehicle vehicle;
    private Person person;

    @BeforeEach
    public void setUp() {
        //Initializing test data
        vehicle = new Vehicle(true, "Vroom");
        person = new Person();
    }

    @Test
    public void TestNullaryConstructor() {
        Vehicle vehicle = new Vehicle();
    }

//    //Testing whether Vehicle class implements the FarmVehicle interface - specifically operateOnFarm method
//    @Test
//    public void testOperateOnFarm() {
//        //Should be able to operate on farm
//        assertTrue(vehicle.operateOnFarm(), "Vehicle Operates on the Farm");
//
//        //Set the vehicle to not operational and test again
//        vehicle.setOperational(false);
//        assertFalse(vehicle.operateOnFarm(), "Vehicle should not be operational on farm");
//    }

    //Testing MakeNoise method
    @Test
    public void testMakeNoise() {
        //Test that the vehicles makes the correct noise
        assertEquals("Vroom", vehicle.makeNoise(), "Vehicle should make the noise 'Vroom'");
    }

    //Testing method Ridden()
    @Test
    public void TestRidden() {
        //Test that the vehicle can be ridden when operational
        assertFalse(vehicle.ridden(person), "Vehicle should be able to be ridden when operating");
    }
}
