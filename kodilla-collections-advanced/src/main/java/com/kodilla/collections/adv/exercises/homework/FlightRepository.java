package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
//    Map<String, String> flights = new HashMap<>(); //klucze - odloty, wartości - przyloty

//    public static List<FlightsTable> getFlightsTable(String departure, String arrival){ //metoda statyczna
//        // getFlightsTable(), która zwraca listę lotów obsługiwanych przez dane lotnisko
//        // (wypełnij tę listę przykładowymi lotami)
//        List<FlightTable> flightTableList = flights.getOrDefault(departure, new ArrayList<>();
//        departure.add(departure);
//        arrival.add(arrival);
//        flights.put(departure, arrival);
//
//    }



    public static List<Flight> getFlightsTable(){
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Amsterdam", "Paryż"));
        flightsTable.add(new Flight("Wiedeń", "Paryż"));
        flightsTable.add(new Flight("Amsterdam", "Praga"));
        flightsTable.add(new Flight("Amsterdam", "Lizbona"));
        return flightsTable;

    }
}
