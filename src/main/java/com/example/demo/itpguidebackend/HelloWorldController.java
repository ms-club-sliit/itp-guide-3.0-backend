package com.example.demo.itpguidebackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/get/message")
    public String message() {
        return "Hello World!";
    }

}
