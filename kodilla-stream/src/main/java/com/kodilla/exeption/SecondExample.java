package com.kodilla.exeption;

public class SecondExample {
    public static void main(String[] args) {
        int numberOfRounds = UserDialogs.getNumberOfRounds();
        //Metoda getNumberOfRounds() została zdefiniowana jako metoda statyczna,
        // wobec czego można ją wywołać wprost "na klasie" UserDialogs
        System.out.println("Number of rounds: "  + numberOfRounds);
    }
}
