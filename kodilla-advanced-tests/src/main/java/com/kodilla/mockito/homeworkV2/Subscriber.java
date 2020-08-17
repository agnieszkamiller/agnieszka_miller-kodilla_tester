package com.kodilla.mockito.homeworkV2;

import java.util.Objects;

public class Subscriber implements WeatherObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherNotification weatherNotification) {
        System.out.println(name + ": w Twoim mieście będzie dziś" + weatherNotification);
    }

    @Override
    public void receiveNotification(String notification) {
        System.out.println(name + " : ważna informacja dla Ciebie: " + notification);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
