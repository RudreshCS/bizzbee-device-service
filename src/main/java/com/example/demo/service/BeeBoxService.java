package com.example.demo.service;

import com.example.demo.model.BeeBox;
import com.example.demo.repository.BeeBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeeBoxService {

    @Autowired
    private BeeBoxRepository repository;

    public BeeBox createBeeBox(BeeBox beeBox) {
        return repository.save(beeBox);
    }

    public List<BeeBox> getAllBeeBoxes() {
        return repository.findAll();
    }

    public Optional<BeeBox> getBeeBoxById(String id) {
        return repository.findById(id);
    }
}