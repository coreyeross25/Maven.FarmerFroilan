package com.zipcodewilmington.froilansfarm;

public abstract class Person extends Animal implements NoiseMaker {

    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person() {
        super();
    }

    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeNoise() {
        return "Hello!";
    }

    public abstract String dismount(Tractor tractor);
}
