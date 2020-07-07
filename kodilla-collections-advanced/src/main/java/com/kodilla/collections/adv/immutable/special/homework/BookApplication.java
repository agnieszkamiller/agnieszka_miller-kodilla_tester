package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager1 = new BookManager();
        Book book1 = bookManager1.createBook("Mistrz i Malgorzata", "Fiodor Dostojewski");

        bookManager1.addToList(book1);
        Book book2 = bookManager1.createBook("Mistrz i Malgorzata", "Fiodor Dostojewski");
//        Book book2 = book1;

        bookManager1.addToList(book2);
        Book book3 = bookManager1.createBook("Duma i uprzedzenie", "Jane Austin");
        bookManager1.addToList(book3);


    }
}
