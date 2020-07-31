package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataSourceBMI#provideDataToBMICalculator")
    void test(String input, double a, double b) {
        Person person = new Person(a,b);
//        System.out.println(person.getBMI());
        assertSame(input, person.getBMI());
    }
}