package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop extends Shelter{

    private String name;
    private ArrayList<Chicken> chickenList = new ArrayList<Chicken>();
    public ChickenCoop(String chickenTown) {

    }

    public void addChicken(Chicken chicken) {
        chickenList.add(chicken);
    }

    public Chicken getChicken(String name) {
        return chickenList.get(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
