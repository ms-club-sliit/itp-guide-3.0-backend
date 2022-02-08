package com.example.demo.itpguidebackend.todos.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Todo {
    @Id
    private int id;
    private String description;
    private Boolean status;
}
