package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime localTime) {
        if ((localTime.isAfter(LocalTime.of(6, 0)) &&
                (localTime.isBefore(LocalTime.of(20, 0))))) {
            return false;
        }
        return true;
    }


    @Override
    public String getCarType() {
        return "Cabrio";
    }


}
