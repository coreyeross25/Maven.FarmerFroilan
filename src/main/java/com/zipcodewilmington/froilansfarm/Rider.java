package com.zipcodewilmington.froilansfarm;

public interface Rider <T extends Rideable> {
    String mount(Aircraft<Pilot> aircraft);

    String dismount(Aircraft<Pilot> aircraft);

    String mount(Tractor tractor);
}
