package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTestSuite {

    @Test
    public void shouldBeNotEqualAndSame(){
        //Given
        Accountant accountant1 = new Accountant(1, "xyz");
        Accountant accountant2 = new Accountant(1, "xyz");
        //When
        //Then
        assertNotEquals(accountant1,accountant2);
        assertNotSame(accountant1, accountant2);
    }
    @Test
    public void shouldBeEqualAndSame(){
        //Given
        Accountant accountant1 = new Accountant(1, "xyz");
        Accountant accountant2 = accountant1;
        //When
        //Then
        assertEquals(accountant1,accountant2);
        assertSame(accountant1, accountant2);
    }

    @Test
    public void shouldAccountantIsJob(){
        Accountant accountant = new Accountant(1, "xyz");
        Job job = accountant;
        Assertions.assertEquals(job, accountant);
    }
}