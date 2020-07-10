package com.kodilla.exeption;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
//tworzymy obiekt klasy AirportRepository, a następnie wywołujemy metodę isAirportInUse
        //     boolean isViennaInUse = false;
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            //     airportNotFoundExeption.printStackTrace();
            System.out.println("Sorry, this airport cannot be served by our airlines.");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }

    }
}
