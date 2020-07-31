package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvFileSource(resources = "/correctUserNames.csv", numLinesToSkip = 1)
    public void trueIfUsernameLongerThanThreeLetters(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectUserNames.csv", numLinesToSkip = 1)
    public void falseIfUsernameShorterThanThreeLetters(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"aga@aga.pl", "kodilla123.123@kodilla.com", "GRA123@123.pl"})
    public void trueIfEmailCorrect(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"a./@123.p", "aga.aga.pl", "kodilla@1234567", "KOD12-@", "aga@o2.pappwll"})
    public void falseIfEmailIncorrect(String input) {
        assertFalse(userValidator.validateEmail(input));
    }
    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsNull(String text) {
        assertFalse(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfEmailIsNull(String text) {
        assertFalse(userValidator.validateEmail(text));
    }


}
