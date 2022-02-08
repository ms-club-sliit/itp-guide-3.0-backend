package com.example.demo.itpguidebackend.todos.repositories;

import com.example.demo.itpguidebackend.todos.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<Todo, Integer> {

}
