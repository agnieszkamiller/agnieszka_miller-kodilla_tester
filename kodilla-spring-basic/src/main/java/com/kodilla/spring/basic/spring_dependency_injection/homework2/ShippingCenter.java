package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {
    // tutaj dodaj odpowiednie wstrzykiwanie zależności

    @Autowired
    @Qualifier(value = "deliveryService")
    private DeliveryService deliveryService;
    @Resource(name = "notificationService")
    private NotificationService notificationService;


    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}

