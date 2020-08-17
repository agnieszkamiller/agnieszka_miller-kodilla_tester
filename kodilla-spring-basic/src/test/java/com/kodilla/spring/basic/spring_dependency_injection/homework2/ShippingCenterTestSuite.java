package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Not;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfPackageWeightSmallerThan30(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = applicationContext.getBean(DeliveryService.class);
        assertTrue(bean.deliverPackage("Polna 1", 25));
    }

    @Test
    public void shouldReturnNotNullValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        assertNotNull(bean.fail("Polna 1"), "Package not delivered to: Polna 1");
        assertEquals(bean.fail("Polna 1"), "Package not delivered to: Polna 1");
        assertNotNull(bean.success("Polna 1"));
        assertEquals(bean.success("Polna 1"), "Package delivered to: Polna 1");
    }

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean((ShippingCenter.class));
        assertNotNull(bean.sendPackage("Polna 1", 100));
        assertEquals(bean.sendPackage("Polna 1",25), "Package delivered to: Polna 1");
        assertEquals(bean.sendPackage("Polna 1", 35), "Package not delivered to: Polna 1");
    }

}