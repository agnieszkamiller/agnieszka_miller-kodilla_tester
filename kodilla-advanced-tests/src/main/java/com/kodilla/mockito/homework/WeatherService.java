package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    private Map<Location, Set<Subscriber>> locationListMap = new HashMap<>();


    public static void main(String[] args) {
        WeatherService weatherNotification = new WeatherService();
        Warszawa warszawa = new Warszawa();
        Poznan poznan = new Poznan();
        weatherNotification.addLocation(warszawa);
        weatherNotification.addLocation(poznan);
        Map<Location, Set<Subscriber>> locationListMap = weatherNotification.getLocationListMap();

        Bogdan bogdan = new Bogdan();
        Krystyna krystyna = new Krystyna();
        weatherNotification.addSubscriberToLocation(warszawa, bogdan);
        weatherNotification.addSubscriberToLocation(warszawa, new Jolanta());
        weatherNotification.addSubscriberToLocation(warszawa, krystyna);
        weatherNotification.addSubscriberToLocation(poznan, krystyna);
        weatherNotification.addSubscriberToLocation(poznan, new Piotr());

        weatherNotification.removeSubscriberFromLocation(warszawa, krystyna);
//        weatherNotification.removeSubscriberFromAllLocations(krystyna);

        for (Map.Entry<Location, Set<Subscriber>> locationListEntry : locationListMap.entrySet()) {
            System.out.println(locationListEntry);
        }
        RainyDayNotification rainyDayNotification = new RainyDayNotification();
        weatherNotification.sendingNotificationToAll(rainyDayNotification);

    }

    public void addLocation(Location location) {
        Set<Subscriber> subscriberList = new HashSet<>();
        locationListMap.put(location, subscriberList);
    }

    public void addLocation(Location location, Set<Subscriber> subscribers){
        locationListMap.put(location, subscribers);
    }

    public void addSubscriberToLocation(Location location, Subscriber subscriber) {

        for (Map.Entry<Location, Set<Subscriber>> locationListEntry : locationListMap.entrySet()) {
            if (location.equals(locationListEntry.getKey())) {
                locationListEntry.getKey().addSubscriber(subscriber, locationListEntry.getValue());
            }
        }
    }

    public void removeSubscriberFromLocation(Location location, Subscriber subscriber) {
        for (Map.Entry<Location, Set<Subscriber>> locationListEntry : locationListMap.entrySet()) {
            if (location.equals(locationListEntry.getKey())) {
                locationListEntry.getKey().removeSubscriber(subscriber, locationListEntry.getValue());
            }
        }
    }

    public void removeSubscriberFromAllLocations(Subscriber subscriber) {
        for (Map.Entry<Location, Set<Subscriber>> locationSetEntry : locationListMap.entrySet()) {
            Location location = locationSetEntry.getKey();

            location.removeSubscriber(subscriber, locationSetEntry.getValue());
        }
    }
// nie działa metoda:
    public void sendingNotificationAccordingToLocation(Location location, WeatherNotification weatherNotification) {
        for (Map.Entry<Location, Set<Subscriber>> locationSetEntry : locationListMap.entrySet()) {
            if (locationSetEntry.getKey().equals(location)) {
                System.out.println(locationSetEntry.getValue());
                for (Subscriber subscriber1 : locationSetEntry.getValue()) {
                    subscriber1.receiveNotification(weatherNotification);
                }
            }
        }
    }
//to działa, ale nie o to chodzi?:
    public void sendingNotificationToSubscriber(Subscriber subscriber, WeatherNotification weatherNotification) {

        subscriber.receiveNotification(weatherNotification);

    }

    public void sendingNotificationToAll(WeatherNotification weatherNotification) {

        this.locationListMap.forEach((location, subscribers) -> location.sendNotification(weatherNotification,subscribers));

    }

    public void removeLocation(Location location) {
        locationListMap.remove(location);
    }

    public Map<Location, Set<Subscriber>> getLocationListMap() {
        return locationListMap;
    }

    public void setLocationListMap(Map<Location, Set<Subscriber>> locationListMap) {
        this.locationListMap = locationListMap;
    }
}
