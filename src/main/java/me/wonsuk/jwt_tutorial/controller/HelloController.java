package me.wonsuk.jwt_tutorial.controller;

import me.wonsuk.jwt_tutorial.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private HelloService service;
    @GetMapping("/{id}")
    public ResponseEntity<String> hello(@PathVariable String id) {

        service.call(id);
        return ResponseEntity.ok("hello");
    }

}
