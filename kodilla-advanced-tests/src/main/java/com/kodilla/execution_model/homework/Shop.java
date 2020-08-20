package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public static void main(String[] args) {
        Shop shop = new Shop();

        Order order1 = new Order(15, LocalDate.of(2020, 6, 5), "audio");
        Order order2 = new Order(50, LocalDate.of(2020, 6, 10), "audio");
        Order order3 = new Order(20, LocalDate.of(2020, 6, 15), "audio");
        Order order4 = new Order(10, LocalDate.of(2020, 6, 20), "audio");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        List<Order> chosenOrdersList = shop.getOrdersFromDateRange(LocalDate.of(2020, 6, 4),
                LocalDate.of(2020, 6, 6));


        for (Order order : chosenOrdersList) {
            System.out.println(order);
        }

    }

    public void addOrder(Order order) {
        orders.add(order);

    }

    public int getOrdersSize() {
        return orders.size();
    }

    public List<Order> getOrdersFromDateRange(LocalDate localDate1, LocalDate localDate2) {
        List<Order> chosenOrders = new ArrayList<>();

        for (Order order : orders) {
            if (order.getOrderDate().isAfter(localDate1) && order.getOrderDate().isBefore(localDate2)) {
                chosenOrders.add(order);
            }
        }
        return chosenOrders;
    }

    public List<Order> getOrdersFromValueRange(double orderValue1, double orderValue2) {
        List<Order> chosenOrdersByValue = new ArrayList<>();
        for (Order order : orders) {
            if (orderValue1 < order.getOrderValue() && order.getOrderValue() < orderValue2 ){
                chosenOrdersByValue.add(order);
            }
        }
        return chosenOrdersByValue;
    }

    public double ordersTotalValue() {
        double totalValue = 0;
        for (Order order : orders) {
            totalValue += order.getOrderValue();
        }
        return totalValue;
    }


}