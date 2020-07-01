package com.kodilla.basic_assertion;

public class ApplV2 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = numberInputting(4, 4); //do  zmiennej tablicowej jest przypisywane wywołanie metody/rezultat metody
        int result = calculator.sum(numbers[0], numbers[1]); //do  zmiennej typu int jest przypisywane wywołanie metody/rezultat metody
        //odwołanie do obiektu Calculator poprzez nazwę zmiennej obiektowej calculator
        // a następnie wywołanie po kropce metody sum(), i określenie parametrów
        boolean correct = ResultChecker.assertEquals(8, result);
        informationPrinting(correct, numbers); //wywołanie metody

    }

    public static void informationPrinting(boolean correct, int[] numbers) {
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb " + numbers[0] + " i " + numbers[1]);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + numbers[0] + " i " + numbers[1]);
        }
    }

    public static int[] numberInputting(int a, int b) {
//        tutaj może być scanner, zamiast dwóch parametrów
        return new int[]{a, b};
    }


}
