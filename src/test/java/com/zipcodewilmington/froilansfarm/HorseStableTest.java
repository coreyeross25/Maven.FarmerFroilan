package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HorseStableTest extends Shelter{

    HorseStable test = new HorseStable("Horse Town");
    Horse horse1 = new Horse();
    Horse horse2 = new Horse();

    @Test
    public void getAddHorse() {
        test.addHorse(horse1);
        test.addHorse(horse2);
        Horse tester = test.getHorse("Horse 1");
        assertTrue(tester == horse1);
    }

    @Test
    public void setAndGetName() {
        test.setName("Horsey City");
        assertEquals("Horsey City", test.getName());
    }
}
