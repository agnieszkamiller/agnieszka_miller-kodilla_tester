package com.kodilla.mockito.homeworkV2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    private Map<String, Set<WeatherObserver>> weatherObserversMap = new HashMap<>();

    public void addObserver(String location, WeatherObserver weatherObserver) {
        if (weatherObserversMap.containsKey(location)) {
            weatherObserversMap.get(location).add(weatherObserver);
        } else {
//            Set<WeatherObserver> observers = new HashSet<>();
//            observers.add(weatherObserver);
            //weatherObserversMap.put(location, observers);
            weatherObserversMap.put(location, new HashSet<>(Set.of(weatherObserver)));
        }
    }

    public void removeObserver(String location, WeatherObserver weatherObserver) {
        if (weatherObserversMap.containsKey(location) && weatherObserversMap.get(location).contains(weatherObserver)) {
            System.out.println("Istnieje");
            weatherObserversMap.get(location).remove(weatherObserver);
        } else {
            System.out.println("Nie ma takiego uzytkownika.");
        }
    }
    public void weatherChanged(String location, WeatherNotification weatherNotification) {
        sendNotificationToLocationObservers(location,weatherNotification);
    }
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObserversMap.forEach((s, weatherObservers) -> weatherObserversMap.get(s).remove(weatherObserver));
    }

    public void sendNotificationToLocationObservers(String location, WeatherNotification weatherNotification ){
        if (!weatherObserversMap.containsKey(location)){
            return;
        }
        for (WeatherObserver weatherObserver : weatherObserversMap.get(location)) {
            weatherObserver.update(weatherNotification);
        }
    }

    public void sendNotificationToAllObservers(String notification){
        weatherObserversMap
                .forEach((s, weatherObservers) -> weatherObserversMap.get(s)
                .forEach(weatherObserver -> weatherObserver.receiveNotification(notification)));
    }

    public void removeLocation(String location){
        weatherObserversMap.remove(location);
    }


    public Map<String, Set<WeatherObserver>> getWeatherObserversMap() {
        return weatherObserversMap;
    }
}
