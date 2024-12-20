package com.carlosacademic.springtestplayground.todo.assertions;

import com.carlosacademic.springtestplayground.todo.model.Todo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoAssertJTest {

    @Test
    void shouldCreateTodo(){
        //arrange
        var test = new Todo("Test 1", true);

        //assert
        assertThat(test.name())
                .isEqualTo("Test 1");

        assertThat(test.completed())
                .isTrue();
    }
}
