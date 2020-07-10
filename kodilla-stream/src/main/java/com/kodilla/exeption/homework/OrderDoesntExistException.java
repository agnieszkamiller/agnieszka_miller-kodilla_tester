package com.kodilla.exeption.homework;

public class OrderDoesntExistException extends Exception {

    public OrderDoesntExistException() {
        super("To zamówienie nie istnieje!");
    }
}
