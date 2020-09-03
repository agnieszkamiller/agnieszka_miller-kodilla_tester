package com.kodilla.rest.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @MockBean
    private BookController bookController;

    @Test
    public void shouldFetchBooks() throws Exception {
        //given
//        List<BookDto> booksList = new ArrayList<>();
//        booksList.add(new BookDto("title 1", "author 1"));
//        booksList.add(new BookDto("title 2", "author 2"));
//        Mockito.when(bookService.getBooks()).thenReturn(booksList);
//        //when&then
//        mockMvc.perform(get("/books").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().is(200))
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shouldAddBooks() throws Exception {

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json = gson.toJson(new BookDto("title 1", "author 1"));
//
//        mockMvc.perform(post("/books")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(json).accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andDo(print());

    }

}
