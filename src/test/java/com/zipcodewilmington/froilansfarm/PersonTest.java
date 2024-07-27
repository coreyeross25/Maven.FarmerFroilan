package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person() {
            @Override
            public String dismount(Tractor tractor) {
                return "";
            }
        };
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(person);
        assertNull(person.getName());
    }

    @Test
    public void testParameterizedConstructor(){
        String name = "Froilan";
        person = new Person(name) {
            @Override
            public String dismount(Tractor tractor) {
                return "";
            }
        };
        Assert.assertEquals(name, person.getName());
    }

    @Test
    public void testSetName(){
        String name = "Farmer Froilan";
        person.setName(name);
        Assert.assertEquals(name, person.getName());
    }

    @Test
    public void testMakeNoise(){
        Assert.assertEquals("Hello!", person.makeNoise());
    }
}
