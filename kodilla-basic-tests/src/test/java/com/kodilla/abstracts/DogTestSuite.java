package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTestSuite {

    @Test
    public void shouldDogBeAnimal(){
        Dog dog = new Dog(3);
        Animal animal = dog;
        Assertions.assertEquals(animal, dog);
    }

}