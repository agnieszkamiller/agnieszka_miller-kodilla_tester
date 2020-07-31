package com.kodilla.mockito.homework;

import javax.management.Notification;

public interface Subscriber {

    public boolean receiveNotification(Notification notification);

    public boolean removeNotification(Notification notification);
}
