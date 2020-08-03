package com.kodilla.mockito.homework;

import javax.management.Notification;

public class Krystyna implements Subscriber{
    @Override
    public String toString() {
        return "Krystyna";
    }


    @Override
    public boolean receiveNotification(Notification notification) {
        return false;
    }

    @Override
    public boolean receiveWeatherNotification(WeatherNotification weatherNotification) {
        return false;
    }

    @Override
    public void addSubscription(Location location) {

    }

    @Override
    public void cancelSubscription(Location location) {

    }

    @Override
    public void cancelAllSubscriptions(Location location) {

    }
}
