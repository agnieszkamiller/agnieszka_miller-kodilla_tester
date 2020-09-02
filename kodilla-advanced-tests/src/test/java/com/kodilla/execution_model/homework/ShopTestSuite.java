package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    private final Shop shop = new Shop();
    private final Order order1 = new Order(15, LocalDate.of(2020, 6, 5), "audio");
    private final Order order2 = new Order(50, LocalDate.of(2020, 6, 10), "audio");
    private final Order order3 = new Order(20, LocalDate.of(2020, 6, 15), "audio");

    @BeforeEach
    void addingOrdersToShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    void shouldAddOrderToShop(){
        assertEquals(3, shop.getOrdersSize());

    }
    @Test
    void shouldReturnOrderListWithGivenDateRange(){
        assertEquals(1, shop.getOrdersFromDateRange(LocalDate.of(2020,6,1),
                LocalDate.of(2020,6,6)).size());
    }
    @Test
    void shouldReturnOrderListWithGivenValueRange(){
        assertEquals(15, shop.getOrdersFromValueRange(10, 18).get(0).getOrderValue());
    }
    @Test
    void shouldReturnOrdersNumber(){
    assertEquals(3, shop.getOrdersSize());
    }
    @Test
    void shouldReturnOrdersTotalValue(){
    assertEquals(85, shop.ordersTotalValue());
    }

}