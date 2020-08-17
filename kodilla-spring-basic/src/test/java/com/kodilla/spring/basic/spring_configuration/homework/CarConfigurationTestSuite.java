package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarConfigurationTestSuite {

    @Test
    public void shouldCreateRandomCar(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("choseCar");
        String carType = car.getCarType();
        List<String> carTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(carTypes.contains(carType));
    }

}