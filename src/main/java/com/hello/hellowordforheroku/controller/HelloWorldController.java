package com.hello.hellowordforheroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}