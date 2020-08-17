package com.kodilla.mockito.homeworkV2;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        Subscriber subscriber = new Subscriber("Andrzej");
        Subscriber subscriber1 = new Subscriber("Andrzej1");
        weatherService.addObserver("Warszawa", subscriber);
        weatherService.addObserver("Warszawa", subscriber1);
        System.out.println(weatherService.getWeatherObserversMap().get("Warszawa").size());
//        weatherService.removeObserver(subscriber);
//        System.out.println(weatherService.getWeatherObserversMap().get("Warszawa").size());


    }
}
