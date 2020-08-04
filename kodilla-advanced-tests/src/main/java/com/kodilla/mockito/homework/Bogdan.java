package com.kodilla.mockito.homework;

import javax.management.Notification;

public class Bogdan implements Subscriber {

//    private String info;

    @Override
    public String toString() {
        return "Bogdan: ";
    }

    @Override
    public boolean receiveNotification(WeatherNotification weatherNotification) {
        if (weatherNotification == null) {
            return false;
        }
        System.out.println(weatherNotification.info());
        return true;
    }

    @Override
    public boolean removeNotification(WeatherNotification weatherNotification) {
        return false;
    }
}
