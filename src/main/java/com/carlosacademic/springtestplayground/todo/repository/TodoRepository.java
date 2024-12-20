package com.carlosacademic.springtestplayground.todo.repository;

import com.carlosacademic.springtestplayground.todo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    private final List<Todo> todos = List.of(new Todo("test1", true),new Todo("test2", true));

    public List<Todo> findAll(){
        return todos;
    }
}
