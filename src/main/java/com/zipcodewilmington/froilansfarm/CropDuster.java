package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Vehicle implements Aircraft<Pilot> {
    private boolean operational;

    public CropDuster(boolean operational) {
        this.operational = operational;
    }

    public CropDuster() {
        this(true); // Default to operational
    }

    @Override
    public boolean fly(Pilot pilot) {
        return pilot != null && this.isOperational();
    }

    public boolean isOperational() {
        return operational;
    }

    public void setOperational(boolean operational) {
        this.operational = operational;
    }
}