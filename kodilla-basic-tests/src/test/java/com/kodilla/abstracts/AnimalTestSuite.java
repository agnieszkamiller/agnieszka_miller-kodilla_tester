package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AnimalTestSuite {

    @Test
    public void shouldAnimalHasNoLegsIfNoNumberOfLegsGiven(){
        //Given
        Animal animal1 = Mockito.mock(Animal.class, Mockito.CALLS_REAL_METHODS);
        Animal animal2 = Mockito.mock(Animal.class, Mockito.CALLS_REAL_METHODS);
        //When
        //Then
        Assertions.assertEquals(animal1.getNumberOfLegs(), animal2.getNumberOfLegs());
    }

    @Test
    public void shouldAnimalGivesVoiceIfNoVoiceGiven(){
        //Given
        Animal animal1 = Mockito.mock(Animal.class, Mockito.CALLS_REAL_METHODS);
        //When
        animal1.giveVoice();
        //Then
        Mockito.verify(animal1).giveVoice();

    }
    @Test
    public void shouldAnimalGivesVoiceIfNoVoiceGiven1(){
        //Given
        Animal animal1 = Mockito.mock(Animal.class, Mockito.CALLS_REAL_METHODS);
        //When

        //Then
        Mockito.when(animal1.getNumberOfLegs()).thenReturn(2);
        Assertions.assertEquals(2, animal1.getNumberOfLegs());

    }

}