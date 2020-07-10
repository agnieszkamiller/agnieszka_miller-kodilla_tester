package com.kodilla.exeption;

public class FirstExample {
    public static void main(String[] args) {
        String username = "Willy Wonka";//zmienna username
    //    String username = "WillyWonka";//Wyjątek ArrayIndexOutOfBoundsException = brak spacji, czyli miejsca do dzielenia Stringa
   //     String username = null;//Wyjątek NullPointerException, prowadzi do błędu(wyjątek) = brak czegokolwiek
        String[] nameParts = username.split(" ");//dzielenie przy pomocy metody split() klasy String na elementy składow
        //miejsce rozdzielające to argument metody split() - tu spacja
        //Wyniki wpisywane są do tablicy nameParts

        System.out.println("Firstname: " + nameParts[0]);//wywołujemy, podając w kwadratowych nawiasach jego indeks
        System.out.println("Lastname: " + nameParts[1]);

    }
}
