package com.kodilla.exeption;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports(){
//zadaniem tej metody jest zwrócenie true lub false w zależności od tego,
// czy dane lotnisko ma ustawioną flagę typu Boolean
// (w mapie wewnątrz metody getListOfAirports()) na true czy na false
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
        return airports;
    }
//gdy lotniska o nie ma w mapie, rzucony zostanie nasz definiowany wyjątek linia 22
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
//throws ... deklaracja metody isAirportInUse rozszerzona o informację, że
// nasza metoda może rzucać wyjątkiem
        if (getListOfAirports().containsKey(airport))
            return getListOfAirports().get(airport);
        throw new AirportNotFoundException();
//Do rzucania wyjątku polecenie throw - jako argument obiekt wyjątku, który ma zostać rzucony
    }
}
