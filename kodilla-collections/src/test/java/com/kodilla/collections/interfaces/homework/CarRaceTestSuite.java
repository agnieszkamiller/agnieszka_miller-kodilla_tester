package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRaceTestSuite {

    @Test
    void shouldMainBeRun() {
        String[] args = null;
        CarRace.main(args);
    }

    @Test
    void shouldDoRaceProceed() {
        CarRace carRace = new CarRace();
        Audi audi = new Audi();
        carRace.doRace(audi);
    }
}