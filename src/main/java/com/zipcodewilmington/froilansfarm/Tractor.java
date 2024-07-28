package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle<Tractor>, Rideable {
    private boolean operational;
    private String noise;
    private Person currentRider;
    private ArrayList<Crop> cropArrayList = new ArrayList<>();

    public Tractor(boolean operational, String noise) {
        this.operational = operational;
        this.noise = noise;
    }

    public Tractor() {
        super();
    }

    public void harvest(Crop crop) {
        cropArrayList.add(crop);
    }

    @Override
    public Boolean operateOnFarm() {
        return operational;
    }

    // Getter for cropArrayList
    public ArrayList<Crop> getCropArrayList() {
        return cropArrayList;
    }

    @Override
    public boolean ridden(Person person) {
        if (this.operational) {
            this.currentRider = person;
            return true;
        }
        return false;
    }
}