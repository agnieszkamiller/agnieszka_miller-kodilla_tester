package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {
    private boolean lightsOn;

    public Cabrio(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lightsOn;
    }


    @Override
    public String getCarType() {
        return "Cabrio";
    }

    @Override
    public String toString() {
        if (!hasHeadlightsTurnedOn()) {
            return getCarType() + ": Lights turned off";
        }
        return getCarType() + ": Lights turned on";
    }
}
