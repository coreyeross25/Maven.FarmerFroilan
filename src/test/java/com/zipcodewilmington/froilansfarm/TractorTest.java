package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TractorTest {

    private Tractor tractor;
    private ArrayList<Crop> cropArrayList;
    private Tomato tomato;
    private EarCorn earCorn;

    @BeforeEach
    public void setUp() {
        tractor = new Tractor(true, "Vroom");
//        cornStalk = new CornStalk();
//        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void testHarvest_CornStalk_Success() {
        //Given
        //A tractor that is operational and a corn stalk to harvest
        Integer expected = 2;

        //When
        tractor.harvest(earCorn);
        tractor.harvest(earCorn);


        Integer actual = tractor.cropArrayList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHarvest_tomato_Success() {
        //Given
        //A tractor that is operational and a corn stalk to harvest
        Integer expected = 2;

        //When
        tractor.harvest(tomato);
        tractor.harvest(tomato);


        Integer actual = tractor.cropArrayList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstanceOfVehicle() {
        //Given
        Vehicle vehicle = new Tractor();

        Assert.assertTrue(vehicle instanceof Vehicle);
    }
}
