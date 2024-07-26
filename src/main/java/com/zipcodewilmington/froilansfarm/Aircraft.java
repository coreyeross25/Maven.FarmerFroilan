package com.zipcodewilmington.froilansfarm;

public interface Aircraft<T extends Pilot> {
    boolean fly(T pilot);
}
