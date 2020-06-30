package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class OperatingSystem {
    private int year;

    OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("It was turned on");
    }

    public void turnOf() {
        System.out.println("It was turned of: ");
    }

    public int getYear() {
        return year;
    }

    public static String getReleaseYear() {
        String releaseYear = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadź rok wydania systemu operacyjnego");
            releaseYear = scanner.nextLine().trim();
            if (releaseYear.length() > 0) {
                System.out.println(releaseYear);
                break;
            }
            System.out.println("Nieprawidlowe dane. Sprobuj jeszcze raz.");
        }
        return "";
    }
}
