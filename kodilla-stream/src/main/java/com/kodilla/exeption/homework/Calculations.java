package com.kodilla.exeption.homework;

public class Calculations {

    boolean oddEvenChecker(int numb) throws OddNumberException {

        if (numb % 2 == 0) {
            return true;
        }

        throw new OddNumberException();
    }


    int divide(int numb) {

        if (numb == 0) {
            throw new ArithmeticException();
        }
        int a = 7;
        return a / numb;
    }


}
