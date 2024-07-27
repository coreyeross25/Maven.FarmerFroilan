package com.zipcodewilmington.froilansfarm;

public abstract class Farmer extends Person implements Rider<Tractor> {

    @Override
    public String mount(Tractor tractor) {
        return "Farmer MOUNTS Tractor";
    }

    @Override
    public String dismount(Tractor tractor) {
        return "Farmer DISMOUNTS Tractor";
    }
}


