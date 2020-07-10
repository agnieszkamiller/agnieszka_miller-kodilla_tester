package com.kodilla.exeption.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class WarehouseTestSuite extends TestCase {

    @Test(expected = OrderDoesntExistException.class)
    public void test1() {
        //given
        Order order = new Order("1");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order);
        //when
        //then
        try {
            warehouse.getOrder("5");
        } catch (OrderDoesntExistException e) {
            assertEquals(OrderDoesntExistException.class, e.getClass());
        }
    }

}