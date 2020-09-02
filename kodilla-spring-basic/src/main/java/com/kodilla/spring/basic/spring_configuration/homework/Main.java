package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        CarConfiguration carConfiguration = new CarConfiguration();
        Car car = carConfiguration.choseCar(LocalTime.now());
        System.out.println(car);
    }

}
