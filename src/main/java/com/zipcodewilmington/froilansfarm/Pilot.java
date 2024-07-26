package com.zipcodewilmington.froilansfarm;

public class Pilot implements Rider<Pilot>, Rideable {
    private Aircraft<Pilot> currentAircraft;

    @Override
    public String mount(Aircraft<Pilot> aircraft) {
        if (aircraft == null) {
            return "Cannot mount a null aircraft.";
        }
        if (aircraft.fly(this)) {
            this.currentAircraft = aircraft;
            return "Mounted successfully.";
        }
        return "Aircraft is not operational.";
    }

    @Override
    public String dismount(Aircraft<Pilot> aircraft) {
        if (aircraft == null) {
            return "Cannot dismount a null aircraft.";
        }
        if (this.currentAircraft == null || !this.currentAircraft.equals(aircraft)) {
            return "Not mounted on this aircraft.";
        }
        this.currentAircraft = null;
        return "Dismounted successfully.";
    }
}