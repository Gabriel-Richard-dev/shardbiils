package com.shardbiils.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping(value = "/health")
@Tag(name= "health")
public class HealthController {

    @GetMapping
    public ResponseEntity<String> getHealth(){
        return ResponseEntity.ok().body("Application online! Hehe");
    }
}
