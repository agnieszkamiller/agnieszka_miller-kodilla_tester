package com.kodilla.exeption.homework;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void shouldGetOrder() throws OrderDoesntExistException{
//        given
        Warehouse warehouse = new Warehouse();
//        when
        warehouse.getOrder("1");
//        then
    }

    //  poprzednia wersja
    //  uwaga mentora: Jeśli dodajesz @Test(expected = to try/catch nie jest potrzebny
//    @Test(expected = OrderDoesntExistException.class)
//    public void test1() {
//        given
//        Order order = new Order("1");
//        Warehouse warehouse = new Warehouse();
//        warehouse.addOrder(order);
//        when
//        then
//        try {
//            warehouse.getOrder("5");
//        } catch (OrderDoesntExistException e) {
//            assertEquals(OrderDoesntExistException.class, e.getClass());
//        }

    @Test
    public void shouldAddOrder() {
//        given
        Warehouse warehouse = new Warehouse();
        Order order = new Order("1");
//        when
//        then
        warehouse.addOrder(order);
    }
}