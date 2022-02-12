package com.example.demo.itpguidebackend.todos.repositories;

import com.example.demo.itpguidebackend.todos.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends MongoRepository<Todo, Integer> {

    void deleteById(String id);

    Optional<Object> findById(String id);
}
