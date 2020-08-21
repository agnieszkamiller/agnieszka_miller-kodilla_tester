package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarConfiguration {
    private final static int SPRING = 1;
    private final static int SUMMER = 2;
    private final static int AUTUMN = 3;
    private final static int WINTER = 4;


    private Random random = new Random();
    private boolean lightsOn;

    @Bean
    public Car choseCar() {
        Car chosenCar = suiteCarToSeason();
        LocalTime localTime = giveRandomTime();
        lightsOn = chosenCar.hasHeadlightsTurnedOn(localTime);
        return chosenCar;
    }

    private LocalTime giveRandomTime() {
        LocalTime[] localTimes = {LocalTime.of(12, 0), LocalTime.of(0, 0)};
       LocalTime localTime =  localTimes[random.nextInt(localTimes.length)];
        System.out.println(localTime);
        return localTime;
    }

    private Car suiteCarToSeason() {
        Car car = null;
        switch (random.nextInt(4) + 1) {
            case SPRING:
            case AUTUMN:
                Car sedan = new Sedan();
                car = sedan;
                break;
            case SUMMER:
                Car cabrio = new Cabrio();
                car = cabrio;
                break;
            case WINTER:
                Car suv = new SUV();
                car = suv;
                break;
        }
        return car;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }
}
