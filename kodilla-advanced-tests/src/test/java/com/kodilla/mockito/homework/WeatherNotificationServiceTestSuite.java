package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class WeatherNotificationServiceTestSuite {
    private WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    private Subscriber subscriber = Mockito.mock(Subscriber.class);
    private WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

//    @Test
//    public void shouldSubscriberGetNotification(){
//    assertFalse(subscriber.receiveNotification(weatherNotification));
//     when(subscriber.receiveNotification(weatherNotification)).thenReturn(true);
//     assertTrue(subscriber.receiveNotification(weatherNotification));
//
//    }

    @Test
    public void shouldSubscriberCancelSubscription(){

    }

    @Test
    public void canSubscriberCancelAllNotificationsAndBeNoSubscriber(){

    }

    @Test
    public void areOnlySelectedSubscribersOnTheListOfLocalNotification(){

    }

    @Test
    public void shouldAllSubscribersGetGeneralNotification(){

    }

    @Test
    public void couldLocationBeCancelled(){

    }

}
