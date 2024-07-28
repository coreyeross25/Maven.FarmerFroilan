package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {


    @Test
    public void eatTest() {
        String expected = "";
        Horse horse = new Horse();
        String actual = horse.eat("");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        //Given
        String expectedString = "Neigh!";
        //When
        String actualString = horse.makeNoise();
        //Then
        Assert.assertEquals(expectedString, actualString);
    }

}



