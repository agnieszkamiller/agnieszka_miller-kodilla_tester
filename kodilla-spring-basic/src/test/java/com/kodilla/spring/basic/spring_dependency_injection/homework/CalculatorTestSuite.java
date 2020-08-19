package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {
    private final ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    private final Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldAddCorrectly() {
        assertEquals(4, bean.add(1, 3));
        assertEquals(0, bean.add(0, 0));
        assertEquals(0, bean.add(-2, 2));
        assertEquals(-10, bean.add(-5, -5));
    }

    @ParameterizedTest
    @CsvSource(value = {"10:10:0", "-5:5:10", "0:0:0", "-1:-2:-1"}, delimiter = ':')
    public void shouldSubtractCorrectly(String input1, String input2, String input3) {
        double num1 = Double.parseDouble(input1);

        assertEquals(num1,bean.subtract(Double.parseDouble(input2), Double.parseDouble(input3)));
    }

    @ParameterizedTest
    @CsvSource(value = {"10:10:1", "-5:-5:1", "0:0:0", "-2:-2:1"}, delimiter = ':')
    public void shouldMultiplyCorrectly(String input1, String input2, String input3){
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double num3 = Double.parseDouble(input3);
        assertEquals(num1, bean.multiply(num2, num3));
    }
    @Test
    public void shouldDivideCorrectly(){
        List<int[]> numbers = Arrays.asList(new int[]{1,1,1}, new int[]{0,0,10},new int[]{-20,-100,5});
        for (int[] number : numbers) {
            double num1 = number[0];
            double num2 = number[1];
            double num3 = number[2];
            assertEquals(num1, bean.divide(num2,num3));
        }
    }

    @Test
    public void shouldThrowsExceptionWhenDividingByZero(){
        assertThrows(ArithmeticException.class,()->bean.divide(1,0));
    }


}