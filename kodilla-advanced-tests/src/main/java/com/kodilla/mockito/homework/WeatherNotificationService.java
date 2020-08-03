package com.kodilla.mockito.homework;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherNotificationService {
    private Map<Location, List<Subscriber>> locationListMap = new HashMap<>();
    private Map<Subscriber, List<Location>> subscriberListMap = new HashMap<>();


    public static void main(String[] args) {
        WeatherNotificationService weatherNotification = new WeatherNotificationService();
        Warszawa warszawa = new Warszawa();
        Poznan poznan = new Poznan();
        weatherNotification.addLocation(warszawa);
        weatherNotification.addLocation(poznan);
        Map<Location, List<Subscriber>> locationListMap = weatherNotification.getLocationListMap();

        Bogdan bogdan = new Bogdan();
        Krystyna krystyna = new Krystyna();
        weatherNotification.addSubscriberToLocation(warszawa, bogdan);
        weatherNotification.addSubscriberToLocation(warszawa, new Jolanta());
        weatherNotification.addSubscriberToLocation(warszawa, krystyna);
        weatherNotification.addSubscriberToLocation(poznan, krystyna);
        weatherNotification.addSubscriberToLocation(poznan, new Piotr());

//        weatherNotification.removeSubscriberFromLocation(warszawa, bogdan);
        weatherNotification.removeSubscriberFromAllLocations(krystyna);

        for (Map.Entry<Location, List<Subscriber>> locationListEntry : locationListMap.entrySet()) {
            System.out.println(locationListEntry);
        }
    }

    void addLocationToSub(Subscriber subscriber, Location location){

    }


    public void addLocation(Location location) {
        List<Subscriber> subscriberList = new ArrayList<>();

        locationListMap.put(location, subscriberList);
    }

    public void addSubscriberToLocation(Location location, Subscriber subscriber) {

        for (Map.Entry<Location, List<Subscriber>> locationListEntry : locationListMap.entrySet()) {
            if (location.equals(locationListEntry.getKey())) {
                locationListEntry.getValue().add(subscriber);

            }
        }
    }

    public void removeSubscriberFromLocation(Location location, Subscriber subscriber) {
        locationListMap.get(location).remove(subscriber);
    }

    public Map<Location, List<Subscriber>> getLocationListMap() {
        return locationListMap;
    }

    public void removeSubscriberFromAllLocations(Subscriber subscriber){
        for (Map.Entry<Location, List<Subscriber>> locationListEntry : locationListMap.entrySet()) {
            locationListEntry.getValue().remove(subscriber);
        }
    }

//    public void sendingNotificationAccordingToLocation(Location location, WeatherNotification weatherNotification){
//        for (Subscriber subscriber : locationListMap.get(location)) {
//            subscriber.receiveNotification(weatherNotification);
//        }
//    }
//    public void sendingNotificationToAll(WeatherNotification weatherNotification){
//        for (Map.Entry<Location, List<Subscriber>> locationListEntry : locationListMap.entrySet()) {
//            for (Subscriber subscriber : locationListEntry.getValue()) {
//                subscriber.receiveNotification(weatherNotification);
//            }
//        }
//    }

    public void removeLocation(Location location){
        locationListMap.remove(location);
    }
}
