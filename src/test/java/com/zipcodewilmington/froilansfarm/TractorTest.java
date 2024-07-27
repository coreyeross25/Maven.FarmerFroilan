package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TractorTest {

    private Tractor tractor;
    private Tomato tomato;
    private EarCorn earCorn;

    @BeforeEach
    public void setUp() {
        // Initialize Tractor with operational status and noise
        tractor = new Tractor(true, "Vroom");
        earCorn = new EarCorn();
        tomato = new Tomato();
    }

    @Test
    public void testHarvest_EarCorn_Success() {
        // Given
        Integer expected = 2;

        // When
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);

        // Access the crop list through a getter method if needed
        Integer actual = tractor.getCropArrayList().size();

        // Then
        assertEquals(expected, actual, "The number of harvested corn stalks should be 2.");
    }

    @Test
    public void testHarvest_Tomato_Success() {
        // Given
        Integer expected = 2;

        // When
        tractor.harvest(tomato);
        tractor.harvest(tomato);

        // Access the crop list through a getter method if needed
        Integer actual = tractor.getCropArrayList().size();

        // Then
        assertEquals(expected, actual, "The number of harvested tomatoes should be 2.");
    }

    @Test
    public void testInstanceOfVehicle() {
        // Given
        Vehicle vehicle = new Tractor();

        // Then
        assertTrue(vehicle instanceof Vehicle, "The Tractor should be an instance of Vehicle.");
    }
}
