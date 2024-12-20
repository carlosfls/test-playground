package com.carlosacademic.springtestplayground.todo.assertions;

import com.carlosacademic.springtestplayground.todo.model.Todo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TodoJunitTest {

    @Test
    void shouldCreateTodo(){
        //arrange
        var test = new Todo("Test 1", true);

        //assert
        assertEquals("Test 1", test.name());
        assertTrue(test.completed());
    }
}
