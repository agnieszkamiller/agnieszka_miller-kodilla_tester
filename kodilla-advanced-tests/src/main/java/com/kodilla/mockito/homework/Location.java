package com.kodilla.mockito.homework;

import java.util.List;
import java.util.Set;

public interface Location {


    void addSubscriber(Subscriber subscriber, Set<Subscriber> set);

    void removeSubscriber(Subscriber subscriber, Set<Subscriber> set);

    void sendNotification(WeatherNotification weatherNotification, Set<Subscriber> set);

}
