package com.kodilla.exeption.homework;

public class Order {
    private String number;

    public Order(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }
}
