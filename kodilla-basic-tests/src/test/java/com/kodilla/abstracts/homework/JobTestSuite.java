package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JobTestSuite {

    @Test
    public void shouldFillInAndShowRespList() {
        Job job = Mockito.mock(Job.class);
        job.fillInRespList();
        Mockito.verify(job).fillInRespList();
        job.showResp(1, 1);
        Mockito.verify(job).showResp(1, 1);
    }

    @Test
    public void shouldGetPosition() {
        Job job = Mockito.mock(Job.class);
        Mockito.when(job.getPosition()).thenReturn("xyz");
        Assertions.assertEquals("xyz", job.getPosition());
    }

    @Test
    public void shouldGetSalary() {
        Job job = Mockito.mock(Job.class);
        Mockito.when(job.getSalary()).thenReturn(1.0);
        Assertions.assertEquals(1.0, job.getSalary());
    }

    @Test
    public void shouldAssistantIsJob(){
        Assistant assistant = new Assistant(1, "xyz");
        Job job = assistant;
        assertEquals(job, assistant);
    }
    @Test
    public void shouldAccountantIsJob(){
        Accountant accountant = new Accountant(1, "xyz");
        Job job = accountant;
        Assertions.assertEquals(job, accountant);
    }
    @Test
    public void shouldDirectorIsJob(){
        Director director = new Director(1, "xyz");
        Job job = director;
        Assertions.assertEquals(job, director);
    }
    @Test
    public void shouldSalesPersonIsJob(){
        SalesPerson salesPerson = new SalesPerson(1, "xyz");
        Job job = salesPerson;
        assertEquals(job, salesPerson);
    }

}