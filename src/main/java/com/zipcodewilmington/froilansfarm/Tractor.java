package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle <Farmer> {
    boolean operational;
    String noise;
    ArrayList<Crop> cropArrayList = new ArrayList<>();

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
}
