package com.codecool.spingboot_tasks.request_counter.controller;

import com.codecool.spingboot_tasks.request_counter.service.RequestCountStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestCounterController {

    @GetMapping("/api/requests")
    public ResponseEntity<Void> get() {
        System.out.println("Inside get");
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/requests")
    public ResponseEntity<Void> post() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/api/requests")
    public ResponseEntity<Void> put() {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/requests")
    public ResponseEntity<Void> delete() {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/api/requests")
    public ResponseEntity<Void> patch() {
        return ResponseEntity.ok().build();
    }

}