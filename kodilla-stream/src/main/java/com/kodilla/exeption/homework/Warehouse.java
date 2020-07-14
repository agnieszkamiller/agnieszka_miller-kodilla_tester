package com.kodilla.exeption.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number){
        Order order = orderList
                .stream()
                .filter(order1 -> order1.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);

        return order;
    }
}
