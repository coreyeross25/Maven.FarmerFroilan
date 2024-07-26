package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class HorseStable {

    private String name;
    private ArrayList<Horse> horseList = new ArrayList<Horse>();
    public HorseStable(String horseyCity) {

    }

    public void addHorse(Horse horse) {
        horseList.add(horse);
    }

    public Horse getHorse(String s) {
        return horseList.get(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
