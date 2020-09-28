package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssistantTestSuite {

    @Test
    public void shouldBeNotEqualAndSame(){
        //Given
        Assistant assistant1 = new Assistant(1, "xyz");
        Assistant assistant2 = new Assistant(1, "xyz");
        ;
        //When
        //Then
        assertNotEquals(assistant1, assistant2);
        assertNotSame(assistant1, assistant2);
    }
    @Test
    public void shouldBeEqualAndSame(){
        //Given
        Assistant assistant1 = new Assistant(1, "xyz");
        Assistant assistant2 = assistant1;
        //When
        //Then
        assertEquals(assistant1, assistant2);
        assertSame(assistant1, assistant2);
    }

    @Test
    public void shouldAssistantIsJob(){
        Assistant assistant = new Assistant(1, "xyz");
        Job job = assistant;
        assertEquals(job, assistant);
    }

}