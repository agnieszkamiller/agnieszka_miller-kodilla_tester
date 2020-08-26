package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarConfigurationTestSuite {
        private final ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    @Test
    public void shouldCreateRandomCar(){

        LocalTime localTime = LocalTime.of(23,0);
        Car car = (Car) context.getBean("choseCar", localTime);
        String carType = car.getCarType();
        List<String> carTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(carTypes.contains(carType));

    }

    @Test
    public void  test(){
        LocalTime localTime = LocalTime.of(23,0);
        Car car = (Car) context.getBean("choseCar", localTime);

        assertTrue(car.hasHeadlightsTurnedOn());

    }


}