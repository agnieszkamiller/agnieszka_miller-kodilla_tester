package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    public void shouldCreateBookWithCorrectTitleAndAuthor() {
        //Given
        String title = "Burza";
        String author = "Adam Kowalski";
        //When
        Book book = new Book(title, author);
        //Then
        Assertions.assertEquals(title, book.getTitle());
        Assertions.assertEquals(author, book.getAuthor());
    }

    @Test
    public void equal() {
        //Given
        String title = "Burza";
        String author = "Adam Kowalski";
        //When
        Book book = new Book(title, author);
        Book book1 = new Book(title, author);
        //Then
        Assertions.assertTrue(book.equals(book1));

    }
}