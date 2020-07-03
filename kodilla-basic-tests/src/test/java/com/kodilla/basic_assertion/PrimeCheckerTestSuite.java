package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//shift + f6 - zmiana nazwy + aktualizacja
public class PrimeCheckerTestSuite {
// każda metoda testowa otrzymuje nowy obiekt klasy PrimeCheckerTestSuite
// i wszystkich wartości niestatycznych, znajdujących się w tej klasie.
    private PrimeChecker checker = new PrimeChecker();
   // Gdy chcemy wyświetlić liczbę testów, musimy użyć zmiennej statycznej, która należy do klasy
   private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber(){
//        given

//        when
        boolean result = checker.isPrime(14);
        count++;
        checker.incrementCount();

//        then
        System.out.println("Count:" + checker.getCount());
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber(){
        boolean result = checker.isPrime(13);
        count++;
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        count++;
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        System.out.println("Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        count++;
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        count++;
        checker.incrementCount();
        System.out.println("Count:" + checker.getCount());
        System.out.println("Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        count++;
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        System.out.println("Test number " + count);
        assertFalse(result);
    }
}
