package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTestSuite {

@Test
    public void shouldCreatedClocksRepresentDifferentHours(){
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Clock firstClockTime = context.getBean(Clock.class);
    Clock secondClockTime = context.getBean(Clock.class);
    Clock thirdClockTime = context.getBean(Clock.class);
    assertNotEquals(firstClockTime, secondClockTime);
    assertNotEquals(firstClockTime, thirdClockTime);
    assertNotEquals(thirdClockTime, secondClockTime);
}
}