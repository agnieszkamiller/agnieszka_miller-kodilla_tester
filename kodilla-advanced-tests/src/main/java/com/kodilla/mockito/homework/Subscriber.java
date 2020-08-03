package com.kodilla.mockito.homework;

import javax.management.Notification;

public interface Subscriber {

    public boolean receiveNotification(Notification notification);

    public boolean receiveWeatherNotification(WeatherNotification weatherNotification);

    public void addSubscription(Location location);

    public void cancelSubscription(Location location);

    public void cancelAllSubscriptions(Location location);
}
