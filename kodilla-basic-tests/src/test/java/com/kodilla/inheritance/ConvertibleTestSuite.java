package com.kodilla.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertibleTestSuite {

    private final Convertible convertible = new Convertible(4,2);

    @Test
    void shouldOpenRoof() {
        convertible.openRoof();
    }

    @Test
    void shouldCloseRoof() {
        convertible.closeRoof();
    }

    @Test
    void shouldOpenDoors() {
        convertible.openDoors();
    }
}