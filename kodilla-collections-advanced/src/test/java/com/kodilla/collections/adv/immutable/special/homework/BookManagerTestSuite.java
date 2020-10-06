package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTestSuite {

    @Test
    public void shouldNotCreateBookIsAlreadyOnTheList() {
        //given
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Burza", "Adam Kowalski");
        Book book2 = bookManager.createBook("Burza", "Adam Kowalski");

        //when
        bookManager.addToList(book1);
        bookManager.addToList(book2);
        //then
        Assertions.assertEquals(1, bookManager.getBookList().size());
    }

    @Test
    public void shouldCreateBookIfThereAreNoTitleAndNoAuthor() {
        //given
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook(null, null);
        //when
        //then
        Assertions.assertNull(book1.getAuthor());
        Assertions.assertNull(book1.getTitle());
    }
}