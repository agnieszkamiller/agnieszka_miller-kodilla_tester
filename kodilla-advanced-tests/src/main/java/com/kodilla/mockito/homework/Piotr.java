package com.kodilla.mockito.homework;

import javax.management.Notification;

public class Piotr implements Subscriber{
    @Override
    public String toString() {
        return "Piotr";
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
