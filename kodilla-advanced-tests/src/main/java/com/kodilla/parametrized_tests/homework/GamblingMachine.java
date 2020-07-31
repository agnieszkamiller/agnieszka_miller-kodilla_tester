package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public static void main(String[] args) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> myNumbers = new HashSet<>();
        //myNumbers.add(-1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        //myNumbers.add(5);
        myNumbers.add(6);
        try {
            int wins = gamblingMachine.howManyWins(myNumbers);

            System.out.println(wins);
        } catch (InvalidNumbersException e){
            System.out.println(e.getMessage());
        }
    }

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        System.out.println(computerNumbers);
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }
    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException();
        }
        if (numbers.stream().anyMatch(number -> number < 1)) {
            throw new InvalidNumbersException();
        }
    }
    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

}
