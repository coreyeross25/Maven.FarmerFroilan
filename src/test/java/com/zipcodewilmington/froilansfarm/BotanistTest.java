package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BotanistTest {

    private Farmer farmer;
    private TomatoPlant tomatoPlant;
    private CornStalk cornStalk;

    @BeforeEach
    public void setUp() {
        //Initialize Farmer and Crops
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
        tomatoPlant = new TomatoPlant();
        cornStalk = new CornStalk();
    }

    @Test
    public void testPlantCrops_TomatoPlant() {
        //Given
        String expectedTomatoPlant = "Successfully planted TomatoPlant";

        //When
        String result = farmer.plantCrops(tomatoPlant);

        //Then
        Assert.assertEquals(expectedTomatoPlant, result);
        Assert.assertEquals(1, farmer.getPlantedCrops().size());
        Assert.assertEquals(tomatoPlant, farmer.getPlantedCrops().get(0));
    }


    @Test
    public void testPlantCrops_CornStalk() {
        //Given
        String expectedEarCorn = "Successfully planted CornStalk";

        //When
        String result = farmer.plantCrops(cornStalk);

        //Then
        Assert.assertEquals(expectedEarCorn, result);
        Assert.assertEquals(1, farmer.getPlantedCrops().size());
        Assert.assertEquals(cornStalk, farmer.getPlantedCrops().get(0));
    }
}
