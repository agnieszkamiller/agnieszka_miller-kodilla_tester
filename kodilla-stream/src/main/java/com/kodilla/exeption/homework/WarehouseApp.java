package com.kodilla.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

//        try {
//            System.out.println(warehouse.getOrder("4"));
//        } catch (OrderDoesntExistException e) {
//            System.out.println(e.getMessage());
//        }


    }
}

