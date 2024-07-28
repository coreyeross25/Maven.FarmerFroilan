package com.zipcodewilmington.froilansfarm;

public class Chicken implements NoiseMaker {

    @Override
    public String makeNoise() {
        return "";
    }

    public void setHasBeenFertilized(boolean b) {
    }

    public boolean hasBeenFertilized() {
        return true;
    }

    public <Edible> Edible yield() {
        return null;
    }

    public String eat(String s) {
        return s;
    }
}