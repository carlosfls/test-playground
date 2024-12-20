package com.carlosacademic.springtestplayground.todo.controller;

import com.carlosacademic.springtestplayground.todo.model.Todo;
import com.carlosacademic.springtestplayground.todo.controllers.TodoController;
import com.carlosacademic.springtestplayground.todo.service.TodoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@WebMvcTest(value = TodoController.class)
class TodoControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    TodoService todoService;

    @Test
    public void whenMethodCall_ShouldReturnTodos() throws Exception {
        //arrange
        var todos = List.of(new Todo("test1", true),new Todo("test2", true));
        Mockito.when(todoService.getAll())
                .thenReturn(todos);

        //act & assert
        mockMvc.perform(MockMvcRequestBuilders.get("/todos"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(objectMapper.writeValueAsString(todos)));
    }

}