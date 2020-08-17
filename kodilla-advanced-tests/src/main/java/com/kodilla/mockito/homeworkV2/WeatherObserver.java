package com.kodilla.mockito.homeworkV2;

public interface WeatherObserver {

    void update(WeatherNotification weatherNotification);

    void receiveNotification(String notification);
}
