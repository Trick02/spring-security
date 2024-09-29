package com.trick02.spring_security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
public class HelloWorldResource {

    @GetMapping("/hello-world")
    public String helloWorld(Principal principal) {
        log.info(principal.getName());
        return "Hello World";
    }

}