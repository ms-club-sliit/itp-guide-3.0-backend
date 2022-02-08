package com.example.demo.itpguidebackend.todos.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos")
public class Todo {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private Boolean status;

}
