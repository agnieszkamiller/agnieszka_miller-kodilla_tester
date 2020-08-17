package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarConfiguration {
    private Random random = new Random();

    @Bean
    public Car choseCar() {
        LocalTime localTime = giveRandomTime();
        Car chosenCar = suiteCarToSeason();
        chosenCar.hasHeadlightsTurnedOn(localTime);
        return chosenCar;
    }

    private LocalTime giveRandomTime() {
        LocalTime[] localTimes = {LocalTime.of(12,0),LocalTime.of(0,0)};
        return localTimes[random.nextInt(localTimes.length)];
    }

    private Car suiteCarToSeason() {
        switch (random.nextInt(4) + 1) {
            case 1:
            case 3:
                Car sedan = new Sedan();
                return sedan;
            case 2:
                Car cabrio = new Cabrio();
                return cabrio;
        }
        Car suv = new SUV();
        return suv;
    }

}
