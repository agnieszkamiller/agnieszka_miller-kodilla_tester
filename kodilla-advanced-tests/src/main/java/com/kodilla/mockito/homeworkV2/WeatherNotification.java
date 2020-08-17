package com.kodilla.mockito.homeworkV2;

public class WeatherNotification {
    private int tempCelcius;

    public WeatherNotification(int tempCelcius) {
        this.tempCelcius = tempCelcius;
    }

    @Override
    public String toString() {
        return tempCelcius + "stopni Celcjusza";
    }
}
