package com.kodilla.optional.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class TeacherTestSuite  {

    @Test
    public void testTestGetName() {
        Teacher teacher = new Teacher("Jolanta");
        teacher.getName();
    }
}