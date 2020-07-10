package com.kodilla.exeption.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {//metoda addOrder(Order order) – dodającą zamówienie do kolekcji
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
//        for (Order order1 : orderList) {
//            if (order1.getNumber().equals(number)) {
//                return order1;
//            }
//        }
        Order order = orderList
                .stream()
                .filter(order1 -> order1.getNumber().equals(number))
                .findFirst()
                .get();

        if (order == null) {
            throw new OrderDoesntExistException();
        }

        return order;
    }
    // metoda Order getOrder(String number), która wyszuka w kolekcji
    // zamówienie o podanym numerze (użyj Stream) i je zwróci.
    // W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.

}
