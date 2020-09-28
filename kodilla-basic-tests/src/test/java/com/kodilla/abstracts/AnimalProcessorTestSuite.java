package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalProcessorTestSuite {


    @Test
    public void shouldProcessBeRun() {
        AnimalProcessor animalProcessor = new AnimalProcessor();
        animalProcessor.process(new Dog(4));
    }

}