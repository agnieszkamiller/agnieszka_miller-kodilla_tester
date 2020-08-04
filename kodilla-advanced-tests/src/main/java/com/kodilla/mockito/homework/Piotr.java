package com.kodilla.mockito.homework;

import javax.management.Notification;

public class Piotr implements Subscriber {

//    private String info;

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

    @Override
    public String toString() {
        return "Piotr ";
    }
}
