package com.example.demo.itpguidebackend.todos.controllers;

import com.example.demo.itpguidebackend.todos.services.TodoService;
import com.example.demo.itpguidebackend.todos.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping(path = "/todos/get")
    public List<Todo> getAllTodos() {
        return todoService.getTodos();
    }

    @PostMapping(path = "/todo/post")
    public String createTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @DeleteMapping(path = "/todo/delete/{id}")
    public String deleteTodo(@PathVariable int id) {
        return todoService.deleteTodo(id);
    }

    @PutMapping(path = "todo/update")
    public String updateTodo(@RequestBody Todo todo) {
        return todoService.updateTodo(todo);
    }


}
