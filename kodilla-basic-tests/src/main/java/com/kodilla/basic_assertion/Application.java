package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subractResult = calculator.subtract(a,b);
        boolean correct2 = ResultChecker.assertEquals(-3, subractResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int c = 4;
        int d = 2;
        int exponentationResult = calculator.powering(c,d);
        boolean correct3 = ResultChecker.assertEquals(16, exponentationResult);
        if (correct3) {
            System.out.println("Potęgowanie działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Potęgowanie nie działa poprawnie dla liczb " + c + " i " + d);
        }

    }
}
