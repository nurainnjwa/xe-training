package com.example.xeTraining.controller;

import brave.Tracer;
import com.example.xeTraining.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    private final UserRepository userRepo;

    Tracer tracer;

    public DemoController(UserRepository userRepo, Tracer tracer) {
        this.userRepo = userRepo;
        this.tracer=tracer;
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?> test(@PathVariable(value = "id") long id) {
        System.out.println(tracer.currentSpan().context().traceIdString());
        return ResponseEntity.ok(userRepo.findById(id).get());
    }
}
