package com.kodilla.parametrized_tests;

public class StringManipulator {

    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
        // metoda, która liczy liczbę przecinków w tekście
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}
