package com.kodilla.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        //dodaj kilka zamówień do hurtowni przy pomocy metody addOrder()
        // a następnie spróbuj wyszukać jakieś nieistniejące zamówienie.
        // Przygotuj odpowiednią obsługę błędów.
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        try {
            System.out.println(warehouse.getOrder("6"));

        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }


    }
}

