package com.zipcodewilmington.froilansfarm;

public class VehicleTest {

    private Vehicle vehicle;
    private Person person;

    @BeforeEach
    public void setUp() {
        //Initializing test data
        vehice = new Vehicle(true, "Vroom");
        person = new Person();
    }

    @Test
    public void testOperateOnFarm() {
        //Testing whether vehicle operates on farm - relationship with farm

    }
}
