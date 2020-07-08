package com.kodilla.collections.adv.exercises.homework;

public class FlightApplication {


    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        for (Flight flight : flightFinder.findFlightsFrom("Wiedeń")) {
            System.out.println(flight);
            }
        System.out.println("************");
        for (Flight flight : flightFinder.findFlightsFrom("Amsterdam")) {
            System.out.println(flight);
        }
        System.out.println("************");
        for (Flight flight : flightFinder.findFlightsTo("Paryż")) {
            System.out.println(flight);
        }
    }
}
