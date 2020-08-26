package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

@Configuration

public class CarConfiguration {
    private final static int SPRING = 1;
    private final static int SUMMER = 2;
    private final static int AUTUMN = 3;
    private final static int WINTER = 4;
    private Random random = new Random();

    @Bean
    @Scope("prototype")
    public Car choseCar(LocalTime localTime) {
        boolean turned = validatePartOfDay(localTime);
        Car chosenCar = suiteCarToSeason(turned);
        return chosenCar;
    }

    private boolean validatePartOfDay(LocalTime currentHour) {
        boolean turned = currentHour.isAfter(LocalTime.of(20,0, 0)) || currentHour.isBefore(LocalTime.of(6,0, 1));
        return turned;
    }

    private Car suiteCarToSeason(boolean turned) {
        Car car = null;
        switch (random.nextInt(4) + 1) {
            case SPRING:
            case AUTUMN:
                Car sedan = new Sedan(turned);
                car = sedan;
                break;
            case SUMMER:
                Car cabrio = new Cabrio(turned);
                car = cabrio;
                break;
            case WINTER:
                Car suv = new SUV(turned);
                car = suv;
                break;
        }
        return car;
    }
}


