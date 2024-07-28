package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public abstract class Farmer extends Person implements Rider<Tractor>, Botanist {

    private ArrayList<Crop> plantedCrops = new ArrayList<>();

    @Override
    public String plantCrops(Crop crop) {
        plantedCrops.add(crop);
        return "Successfully planted " + crop.getClass().getSimpleName();
    }

    public ArrayList<Crop> getPlantedCrops() {
        return plantedCrops;
    }

    @Override
    public String mount(Tractor tractor) {
        return "Farmer MOUNTS Tractor";
    }

    @Override
    public String dismount(Tractor tractor) {
        return "Farmer DISMOUNTS Tractor";
    }
}


