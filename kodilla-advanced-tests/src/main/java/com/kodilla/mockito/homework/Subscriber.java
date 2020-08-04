package com.kodilla.mockito.homework;



public interface Subscriber {

    public boolean receiveNotification(WeatherNotification weatherNotification );

    public boolean removeNotification(WeatherNotification weatherNotification);
}
