package com.kodilla.stream;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite extends TestCase {


    private final User user = new User("Ala", 35, 159, "IT");

    @Test
    public void testGetUsername() {
        assertEquals("Ala",user.getUsername());
    }

    public void testGetAge() {
        assertEquals(35,user.getAge());
    }

    public void testGetNumberOfPosts() {
        assertEquals(159,user.getNumberOfPosts());
    }

    public void testGetGroup() {
        assertEquals("IT",user.getGroup());
    }
}