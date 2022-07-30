package com.silvernine.jwttutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apj")
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String>hello() {
        return ResponseEntity.ok("hello");
    }
}
