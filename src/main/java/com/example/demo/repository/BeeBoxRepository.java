package com.example.demo.repository;

import com.example.demo.model.BeeBox;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeeBoxRepository extends MongoRepository<BeeBox, String> {
}