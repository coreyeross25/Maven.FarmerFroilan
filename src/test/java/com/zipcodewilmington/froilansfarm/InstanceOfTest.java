package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InstanceOfTest {
    @Test
    public void tomatoInstanceOfTest(){
        TomatoPlant notForNothing = new Tomato();

        Assert.assertTrue(notForNothing instanceof TomatoPlant);
    }
    @Test
    public void cornInstanceOfTest(){
        CornStalk word2Mommy = new EarCorn();

        Assert.assertTrue( word2Mommy instanceof CornStalk);
    }

    @Test
    public void cornStalkInstanceOfTestCrop(){
        Crop nfs = new CornStalk();

        Assert.assertTrue(nfs instanceof CornStalk);
    }

    @Test
    public void tomatoPlantInstanceOfCropTest(){
        Crop myGuy = new TomatoPlant();

        Assert.assertTrue(myGuy instanceof TomatoPlant);
    }

    @Test
    public void InstanceOfArrayList(){
        ArrayList<CropRow> cropRows = new ArrayList<>();

        Assert.assertTrue(cropRows instanceof ArrayList);
    }
}
