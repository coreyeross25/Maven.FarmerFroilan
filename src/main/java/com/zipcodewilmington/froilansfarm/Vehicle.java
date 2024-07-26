package com.zipcodewilmington.froilansfarm;

public class Vehicle implements NoiseMaker {

    public Vehicle(boolean b, String vroom) {
    }

    public Vehicle() {

    }

    public boolean ridden(Person person) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

    public void setOperational(boolean b) {
    }
}
