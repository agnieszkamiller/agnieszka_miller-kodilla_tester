package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;
import com.kodilla.abstracts.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTestSuite {

    @Test
    public void shouldBeNotEqualAndSame(){
        //Given
        Director director1 = new Director(1, "xyz");
        Director director2 = new Director(1, "xyz");
        //When
        //Then
        assertNotEquals(director1, director2);
        assertNotSame(director1, director2);
    }
    @Test
    public void shouldBeEqualAndSame(){
        //Given
        Director director1 = new Director(1, "xyz");
        Director director2 = director1;
        //When
        //Then
        assertEquals(director1, director2);
        assertSame(director1, director2);
    }

    @Test
    public void shouldDirectorIsJob(){
        Director director = new Director(1, "xyz");
        Job job = director;
        Assertions.assertEquals(job, director);
    }

}