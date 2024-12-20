package com.carlosacademic.springtestplayground.todo.controllers;

import com.carlosacademic.springtestplayground.todo.service.TodoService;
import com.carlosacademic.springtestplayground.todo.model.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getAll(){
        return new ResponseEntity<>(todoService.getAll(), HttpStatus.OK);
    }
}
