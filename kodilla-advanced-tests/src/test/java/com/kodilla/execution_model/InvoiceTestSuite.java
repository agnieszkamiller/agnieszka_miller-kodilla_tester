package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

private Invoice invoice = new Invoice();
private Item milk = new Item("milk", 3.0);
private Item water = new Item("water", 1.0);
private Item eggs = new Item("eggs", 5);


    @Test
    public void shouldAddItemToInvoice() {

        assertEquals(3, invoice.getSize());
    }

    @Test
    public void shouldGetItem() {

        Item item = invoice.getItem(0);

        assertEquals("milk", invoice.getItem(0).getName());
        assertEquals(3.0, item.getPrice());
    }

    @Test
    public void shouldNotGetNotExistingItem() {

        assertNull(invoice.getItem(-10));
    }

    @Test
    public void shouldNotGetNotExistingItemOnTheList() {

        assertNull(invoice.getItem(11));
    }

    @Test
    public void shouldBeZeroIfNoDeletedAllItems(){
        invoice.clear();

        assertEquals(0, invoice.getSize());
    }

    @BeforeEach
    public void addItemsToInvoice(){
        invoice.addItem(milk);
        invoice.addItem(water);
        invoice.addItem(eggs);
    }
    @AfterEach
    public void resetValues(){
        System.out.println("resetting values");
    }
    @BeforeAll
    public static void displayIntro(){
        System.out.println("starting testing");
    }
    @AfterAll
    public static void displayGoodbye(){
        System.out.println("finishing testing");
    }



}