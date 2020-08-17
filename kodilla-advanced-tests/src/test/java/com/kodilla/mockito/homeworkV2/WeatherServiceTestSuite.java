package com.kodilla.mockito.homeworkV2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTestSuite {
    private WeatherService weatherService = new WeatherService();
    private WeatherObserver weatherObserver = Mockito.mock(WeatherObserver.class);
    private String defaultLocation = "Gdańsk";
    private WeatherNotification weatherNotification = new WeatherNotification(25);

    @BeforeEach
    public void addingObserverToMap() {
        weatherService.addObserver(defaultLocation, weatherObserver);
    }

    @Test
    public void shouldObserverBeAddedToLocation() {
        assertEquals(1, weatherService.getWeatherObserversMap().size());
    }

    @Test
    public void shouldObserverBeRemovedFromLocation() {
        weatherService.removeObserver(defaultLocation, weatherObserver);
        assertEquals(0, weatherService.getWeatherObserversMap().get(defaultLocation).size());
    }
    @Test
    public void shouldObserverBeRemovedFromAllLocations(){
        weatherService.removeObserver( weatherObserver);
        assertEquals(0, weatherService.getWeatherObserversMap().get(defaultLocation).size());
    }
    @Test
    public void shouldOnlyLocationObserversGetNotification(){
        weatherService.sendNotificationToLocationObservers(defaultLocation, weatherNotification);
        Mockito.verify(weatherObserver).update(weatherNotification);
    }
    @Test
    public void shouldAllObserversGetNotification(){
        weatherService.sendNotificationToAllObservers("Zmiana regulaminu.");
        Mockito.verify(weatherObserver).receiveNotification("Zmiana regulaminu.");
    }

    @Test
    public void shouldLocationBeRemoved(){
        weatherService.removeLocation(defaultLocation);
        assertEquals(0, weatherService.getWeatherObserversMap().size() );
    }






}