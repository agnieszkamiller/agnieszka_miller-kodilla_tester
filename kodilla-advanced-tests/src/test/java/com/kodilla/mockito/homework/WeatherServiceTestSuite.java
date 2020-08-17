package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anySet;

public class WeatherServiceTestSuite {
    private WeatherService weatherService = new WeatherService();
    private Subscriber subscriber = Mockito.mock(Subscriber.class);
    private WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
    private RainyDayNotification rainyDayNotification = new RainyDayNotification();
    private Location location = Mockito.mock(Location.class);
    private Location location1 = Mockito.mock(Location.class);
    private Location location2 = Mockito.mock(Location.class);


    @BeforeEach
    void addingLocation() {
        Set<Subscriber> subscriberSet = new HashSet<>();
        subscriberSet.add(subscriber);
        weatherService.addLocation(location);
        weatherService.addLocation(location1);
        weatherService.addLocation(location2, subscriberSet);


    }

    @Test
    public void shouldAddSubscriberToLocation() {
        weatherService.addSubscriberToLocation(location, subscriber);
        Mockito.verify(location).addSubscriber(subscriber, weatherService.getLocationListMap().get(location));
    }

    @Test
    public void shouldRemoveSubscriberFromLocation() {
        weatherService.removeSubscriberFromLocation(location, subscriber);
        Mockito.verify(location).removeSubscriber(subscriber, weatherService.getLocationListMap().get(location));
    }

    @Test
    public void shouldRemoveSubscriberFromAllLocation() {
        weatherService.removeSubscriberFromAllLocations(subscriber);
        Mockito.verify(location).removeSubscriber(subscriber, weatherService.getLocationListMap().get(location));
    }

    @Test
    public void areOnlySelectedSubscribersOnTheListOfLocalNotification() {

    }

    @Test
    public void shouldAllSubscribersGetNotification() {
        weatherService.sendingNotificationToAll(weatherNotification);
        Mockito.verify(location2, Mockito.times(1)).sendNotification(any(WeatherNotification.class),
                anySet());
        //ale działa na boolean:
//        Mockito.when(subscriber.receiveNotification(weatherNotification)).thenReturn(true);
//        assertTrue(subscriber.receiveNotification(weatherNotification));

    }

    @Test
    void shouldSubscriberReceivedNotification() {//to działa

        weatherService.sendingNotificationToSubscriber(subscriber, weatherNotification);
        Mockito.verify(subscriber).receiveNotification(weatherNotification);
    }

    @Test
    public void shouldLocationBeRemoved() {
        assertEquals(3, weatherService.getLocationListMap().size());
        weatherService.removeLocation(location);
        assertEquals(2, weatherService.getLocationListMap().size());

    }
}
