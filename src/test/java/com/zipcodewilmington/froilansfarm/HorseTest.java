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


//        @Test
//        public void getHasBeenRiddenTest() {
//            Horse horse = new Horse();
//            //Given
//            horse.setHasBeenRidden();
//            // When
//            boolean actualFlag = horse.getHasBeenRidden();
//            // Then
//            Assert.assertTrue(actualFlag);
//        }
//
//        @Test
//        public void setHasBeenRiddenTest() {
//            Horse horse = new Horse();
//            //Given
//            boolean expectedBoolean = false;
//            //When
//            horse.setHasBeenRidden();
//            //Then
//            Assert.assertEquals(expectedBoolean, horse.getHasBeenRidden());
//        }
    }

