package com.kodilla.exeption.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculationsTest extends TestCase {
    private Calculations calculations = new Calculations();
    @Test(expected = OddNumberException.class)
    public void testOddEvenChecker() throws OddNumberException {

        assertFalse(calculations.oddEvenChecker(5));
    }
    @Test(expected =  ArithmeticException.class)
    public void testDivide() {


        calculations.divide(0);

    }
}