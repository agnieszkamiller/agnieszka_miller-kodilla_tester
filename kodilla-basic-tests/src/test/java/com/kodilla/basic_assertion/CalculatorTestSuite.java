package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {


    @Test
    public void testSum() {
//      given
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 0;

//        when
        int sumResult = calculator.sum(a, b);

//        then
        assertEquals(0, sumResult);
    }

    @Test
    public void testSubtract(){
//        given
        Calculator calculator = new Calculator();

//        when
        int subtrackResult = calculator.subtract(5, 5);

//        than
        assertEquals(0, subtrackResult);
    }

@Test
public void testPowering() {
//        given
    Calculator calculator = new Calculator();
//    when
    int poweringResult1 = calculator.powering(4, 2);
    int poweringResult2 = calculator.powering(4, 0);
    int poweringResult3 = calculator.powering(-4, 2);

//    than
    assertEquals(16, poweringResult1);
    assertEquals(1, poweringResult2);
    assertEquals(16, poweringResult3);

}

}
