package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesPersonTestSuite {

    @Test
    public void shouldBeNotEqualAndSame(){
        //Given
        SalesPerson salesPerson1 = new SalesPerson(1, "xyz");
        SalesPerson salesPerson2 = new SalesPerson(1, "xyz");
        //When
        //Then
        assertNotEquals(salesPerson1, salesPerson2);
        assertNotSame(salesPerson1, salesPerson2);
    }
    @Test
    public void shouldBeEqualAndSame(){
        //Given
        SalesPerson salesPerson1 = new SalesPerson(1, "xyz");
        SalesPerson salesPerson2 = salesPerson1;
        //When
        //Then
        assertEquals(salesPerson1, salesPerson2);
        assertSame(salesPerson1, salesPerson2);
    }

    @Test
    public void shouldSalesPersonIsJob(){
        SalesPerson salesPerson = new SalesPerson(1, "xyz");
        Job job = salesPerson;
        assertEquals(job, salesPerson);
    }

}