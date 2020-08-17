package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component;


public interface MessageService {

    String send(String message, String receiver);
}
