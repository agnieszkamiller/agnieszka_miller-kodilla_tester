package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @Test
    public void shouldPersonNotBeEqualAndSame() {
        Person person1 = new Person("Anna", 25, new Assistant(1,"xyz"));
        Person person2 = new Person("Anna", 25, new Assistant(1,"xyz"));
        Assertions.assertNotEquals(person1, person2);
        Assertions.assertNotSame(person1, person2);
    } @Test
    public void shouldPersonBeEqualAndSame() {
//given
       String name = "Anna";
       int age = 25;
       Job job = new Assistant(1,"xyz");
//when
        Person person1 = new Person(name,age,job);
        Person person2 = person1;
//      then
        Assertions.assertEquals(person1, person2);
        Assertions.assertSame(person1, person2);
    }

    @Test
    public void shouldMainBeRun() {
        String[] args = null;
        Person.main(args);
    }

}