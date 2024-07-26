package com.zipcodewilmington.froilansfarm;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChickenCoopTest {

    ChickenCoop test = new ChickenCoop("Chicken Town");
    Chicken chicken1 = new Chicken();
    Chicken chicken2 = new Chicken();

    @Test
    public void getAddChicken() {
        test.addChicken(chicken1);
        test.addChicken(chicken2);
        Chicken tester = test.getChicken("Chicken 1");
        assertTrue(tester == chicken1);
    }

    @Test
    public void setAndGetName() {
        test.setName("El Pollo Hermanos");
        assertEquals("El Pollo Hermanos", test.getName());
    }
}
