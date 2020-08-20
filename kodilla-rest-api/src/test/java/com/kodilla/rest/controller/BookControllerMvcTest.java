package com.kodilla.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean

}
