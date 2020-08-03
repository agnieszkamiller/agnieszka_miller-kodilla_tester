package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectNumbersGamblingMachine.csv", numLinesToSkip = 1)
    void shouldThrowExceptionWhenNumberIsLowerThanOne2(String input) {
        //given
        System.out.println(input);
        String[] num = input.split(",");
        Set<Integer> nowyZestaw = new HashSet<>();
        for (String s : num) {
            nowyZestaw.add(Integer.parseInt(s));
        }

        System.out.println(nowyZestaw.size());
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nowyZestaw));

    }

    @ParameterizedTest
//    @CsvSource({"1, 2, 3, 4"})
    @CsvFileSource(resources = "/incorrectNumbers2.csv", numLinesToSkip = 1)
    void shouldThrowExceptionWhenSetIsShorterThanSix(int input1, int input2, int input3, int input4) {
        //given
        Set<Integer> nowyZestaw = new HashSet<>();
        nowyZestaw.add(input1);
        nowyZestaw.add(input2);
        nowyZestaw.add(input3);
        nowyZestaw.add(input4);
        System.out.println(nowyZestaw);
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nowyZestaw));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3, 4,-5,6"})
    void shouldThrowExceptionWhenSetHasNumberLowerThanOne(String input1) {
        //given
        String[] numbers = input1.split(",");
        Set<Integer> nowyZestaw = new HashSet<>();

        for (String number : numbers) {
            nowyZestaw.add(Integer.parseInt(number));
        }
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nowyZestaw));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectNumbersGamblingMachine.csv", numLinesToSkip = 1)
    void shouldThrowExceptionWhenSetHasNumberLowerThanOneOrShorterThanSixOrLongerThanSix(String input1) {
        //given
        String[] numbers = input1.split(",");
        Set<Integer> nowyZestaw = new HashSet<>();

        for (String number : numbers) {
            nowyZestaw.add(Integer.parseInt(number));
        }
        //when
        //than
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nowyZestaw));
    }

}