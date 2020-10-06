package com.kodilla.optional.homework;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuite {

    @Test
    public void testTestGetName() {
        Student student = new Student("Adam", new Teacher("Jolanta"));

        assertEquals("Adam", student.getName());
    }

    @Test
    public void testGetTeacher() {
        Teacher teacher = new Teacher("Jolanta");
        Student student = new Student("Adam", teacher);

        assertEquals(teacher, student.getTeacher());

    }
}