package com.kodilla.spring.basic;

import com.kodilla.spring.basic.spring_dependency_injection.MessageService;
import com.kodilla.spring.basic.spring_dependency_injection.SimpleApplication;
import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicRunner {
    public static void main(String[] args) {
       MessageService messageService = new SkypeMessageService();
        SimpleApplication simpleApplication = new SimpleApplication();

    }
}
