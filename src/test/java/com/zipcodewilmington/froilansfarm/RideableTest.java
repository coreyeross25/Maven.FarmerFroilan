package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class RideableTest {

    private Tractor tractor;
    private Person farmer;
    private Person otherPerson;

    @BeforeEach
    public void setUp() {
        tractor = new Tractor(true, "Vroom");
        farmer = new Farmer() {
            @Override
            public String mount(Aircraft<Pilot> aircraft) {
                return "";
            }

            @Override
            public String dismount(Aircraft<Pilot> aircraft) {
                return "";
            }
        };
        otherPerson = new Person() {
            @Override
            public String dismount(Tractor tractor) {
                return "";
            }
        };
    }

    @Test
    public void testRiddenWhenOp(){
        Boolean result = tractor.ridden(farmer);
        assertTrue(result);
    }

    @Test
    public void testRiddenWhenNotOp(){
        tractor = new Tractor(false, "Vroom");
        Boolean result = tractor.ridden(farmer);
        Assert.assertFalse(result);
    }

    @Test
    public void testRiddenWithDifferentPerson(){
        tractor = new Tractor(true, "Vroom");
        Boolean result = tractor.ridden(otherPerson);
        assertTrue(result);
    }
}
