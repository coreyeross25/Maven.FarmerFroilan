package com.zipcodewilmington.froilansfarm;

public abstract class Pilot implements Rider<Pilot>, Rideable {
    private Aircraft<Pilot> currentAircraft;

    @Override
    public String mount(Aircraft<Pilot> aircraft) {
        if (aircraft == null) {
            return "CANNOT MOUNT";
        }
        if (aircraft.fly(this)) {
            this.currentAircraft = aircraft;
            return "MOUNTED";
        }
        return "AIRCRAFT is NOT Operational";
    }

    @Override
    public String dismount(Aircraft<Pilot> aircraft) {
        if (aircraft == null) {
            return "CANNOT DISMOUNT";
        }
        if (this.currentAircraft == null || !this.currentAircraft.equals(aircraft)) {
            return "NOT MOUNTED";
        }
        this.currentAircraft = null;
        return "DISMOUNTED successfully";
    }
}