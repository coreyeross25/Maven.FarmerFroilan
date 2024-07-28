package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {


    @Test
    public void eatTest() {
        String expected = "";
        Chicken chicken = new Chicken();
        String actual = chicken.eat("");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoiseTest() {
        Chicken chicken = new Chicken();
        //Given
        String expectedString = "";
        //When
        String actualString = chicken.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void testHasBeenFertilized() {
        Chicken chicken = new Chicken();

        Boolean expected = true;


    }

}

