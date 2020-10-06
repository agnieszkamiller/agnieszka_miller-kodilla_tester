package com.kodilla.optional.homework;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeacherTestSuite  {

    @Test
    public void testTestGetName() {
        Teacher teacher = new Teacher("Jolanta");

        assertEquals("Jolanta", teacher.getName());
    }

}