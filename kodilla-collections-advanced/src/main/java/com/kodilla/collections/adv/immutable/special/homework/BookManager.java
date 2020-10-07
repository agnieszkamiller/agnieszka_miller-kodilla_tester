package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManager {
    private List<Book> bookList = new ArrayList<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        return book;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addToList(Book book1) {
//        boolean result = bookList.contains(book);
//        if (result)
//            System.out.println("Lista zawiera tę ksiązke.");
//        else {
//            System.out.println("Lista nie zawiera tej książki.");
//            bookList.add(book);
//        }
        if (!bookList.contains(book1)) {
            bookList.add(book1);
        } else {
            System.out.println("Książka już istnieje.");
        }


    }


}
