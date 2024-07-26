package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CropRowTest {
    List<Crop> cropRow1 = new ArrayList<>();
    Crop crop = new Crop();

    @Test
    public void testAddCrop(){

        cropRow1.add(crop);

        Integer expected = 1;

        Integer actual = cropRow1.size();

        assertEquals(expected,actual);

    }

    @Test
    public void removeCropRow(){
        cropRow1.remove(crop);
        Integer expected = 0;

        Integer actual = cropRow1.size();

        assertEquals(expected,actual);
    }

    @Test
    public void getCropRowSize(){
        cropRow1.add(crop);

        Integer expected = 1;

        Integer actual = cropRow1.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void gotContents(){
        cropRow1.add(crop);
        Crop expected = crop;

        Assert.assertEquals(expected,cropRow1.get(0));
    }




}
