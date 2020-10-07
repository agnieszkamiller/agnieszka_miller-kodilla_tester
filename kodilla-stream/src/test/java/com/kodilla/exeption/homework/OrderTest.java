package com.kodilla.exeption.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class OrderTest  {

    @Test
    public void testGetNumber() {
    Order order = new Order("1");
    order.getNumber();
    }
}