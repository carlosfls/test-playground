package com.carlosacademic.springtestplayground.todo.service;

import com.carlosacademic.springtestplayground.todo.model.Todo;
import com.carlosacademic.springtestplayground.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }
}
