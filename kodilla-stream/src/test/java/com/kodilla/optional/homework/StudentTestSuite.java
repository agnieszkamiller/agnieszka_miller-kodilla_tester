package com.kodilla.optional.homework;

import junit.framework.TestCase;

public class StudentTestSuite extends TestCase {

    public void testTestGetName() {
        Student student = new Student("Adam", new Teacher("Jolanta"));
        student.getName();
    }

    public void testGetTeacher() {
        Student student = new Student("Adam", new Teacher("Jolanta"));
        student.getTeacher();

    }
}