package com.kodilla.mockito.homework;

import java.util.List;
import java.util.Set;

public class Poznan implements Location{

    @Override
    public String toString() {
        return "Poznań";
    }


    @Override
    public void addSubscriber(Subscriber subscriber,  Set<Subscriber> set) {
        set.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber, Set<Subscriber> set) {
        set.remove(subscriber);

    }

    @Override
    public void sendNotification(WeatherNotification weatherNotification,  Set<Subscriber> set) {
        set.forEach(subscriber -> subscriber.receiveNotification(weatherNotification));
    }


}
