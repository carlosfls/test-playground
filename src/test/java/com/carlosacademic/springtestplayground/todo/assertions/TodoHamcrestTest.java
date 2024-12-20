package com.carlosacademic.springtestplayground.todo.assertions;

import com.carlosacademic.springtestplayground.todo.model.Todo;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TodoHamcrestTest {

    @Test
    void shouldCreateTodo(){
        //arrange
        var test = new Todo("Test 1", true);

        //assert
        assertThat(test.name(), equalTo("Test 1"));

        assertThat(test.completed(), equalTo(true));
    }
}
