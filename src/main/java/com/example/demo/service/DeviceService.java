package com.example.demo.service;

import com.example.demo.model.Device; 
import com.example.demo.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository repository;

    public Device createDevice(Device device) {
        return repository.save(device);
    }

    public List<Device> getAllDevices() {
        return repository.findAll();
    }

    public Optional<Device> getDeviceById(String id) {
        return repository.findById(id);
    }
}