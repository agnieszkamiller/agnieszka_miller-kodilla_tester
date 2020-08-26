package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {
    private boolean lightsOn;

    public SUV(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lightsOn;
    }
    @Override
    public String getCarType() {

        return "SUV";
    }
    @Override
    public String toString() {
        if (!hasHeadlightsTurnedOn()) {
            return getCarType() + ": Lights turned off";
        }
        return getCarType() + ": Lights turned on";
    }
}
