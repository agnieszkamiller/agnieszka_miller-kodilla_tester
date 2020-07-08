package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

            //metoda statyczna getFlightsTable(), która zwraca listę lotów obsługiwanych przez dane lotnisko
            //(wypełnij tę listę przykładowymi lotami)
    public static List<Flight> getFlightsTable(){
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Amsterdam", "Paryż"));
        flightsTable.add(new Flight("Wiedeń", "Paryż"));
        flightsTable.add(new Flight("Amsterdam", "Praga"));
        flightsTable.add(new Flight("Amsterdam", "Lizbona"));
        return flightsTable;
    }
}
