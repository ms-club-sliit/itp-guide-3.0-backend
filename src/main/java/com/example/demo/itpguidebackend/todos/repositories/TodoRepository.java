package com.example.demo.itpguidebackend.todos.repositories;

import com.example.demo.itpguidebackend.todos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
