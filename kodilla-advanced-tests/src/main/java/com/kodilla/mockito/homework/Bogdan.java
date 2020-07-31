package com.kodilla.mockito.homework;

import javax.management.Notification;

public class Bogdan implements Subscriber {
    @Override
    public String toString() {
        return "Bogdan";
    }

    @Override
    public boolean receiveNotification(Notification notification) {
        return false;
    }

    @Override
    public boolean removeNotification(Notification notification) {
        return false;
    }
}
