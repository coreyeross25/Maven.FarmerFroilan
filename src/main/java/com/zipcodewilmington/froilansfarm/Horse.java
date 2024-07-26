package com.zipcodewilmington.froilansfarm;

public class Horse implements Rideable, NoiseMaker, Eater {

    public void setHasBeenRidden(boolean b) {
    }

    public boolean getHasBeenRidden() {
        return true;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }
    @Override
    public String eat(String s) {
        return s;
    }
}
