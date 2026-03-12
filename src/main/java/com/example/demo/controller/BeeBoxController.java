package com.example.demo.controller;

import com.example.demo.model.BeeBox;
import com.example.demo.service.BeeBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/beeboxes")
public class BeeBoxController {

    @Autowired
    private BeeBoxService service;

    @PostMapping
    public ResponseEntity<BeeBox> createBeeBox(@RequestBody BeeBox beeBox) {
        BeeBox savedBox = service.createBeeBox(beeBox);
        return new ResponseEntity<>(savedBox, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BeeBox>> getAllBeeBoxes() {
        return new ResponseEntity<>(service.getAllBeeBoxes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BeeBox> getBeeBoxById(@PathVariable String id) {
        Optional<BeeBox> box = service.getBeeBoxById(id);
        return box.map(ResponseEntity::ok)
                  .orElseGet(() -> ResponseEntity.notFound().build());
    }
}