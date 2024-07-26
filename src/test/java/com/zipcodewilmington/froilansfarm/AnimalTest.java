package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void TestNoiseMaker(){
        String expected = "";
        Animal animal = new Animal();
        Assert.assertEquals(expected, animal.makeNoise());

    }

    @Test
    public void TestEat () {

    }
}