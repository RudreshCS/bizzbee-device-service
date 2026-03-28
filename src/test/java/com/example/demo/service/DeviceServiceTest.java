package com.example.demo.service;

import com.example.demo.model.Device;
import com.example.demo.repository.DeviceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) 
public class DeviceServiceTest {

    @Mock
    private DeviceRepository repository; 

    @InjectMocks
    private DeviceService service; 

    @Test
    public void testCreateDevice() { 
    	
        Device newDevice = new Device(); 
        newDevice.setUnitId("DEVICE_TEST_01"); 
        
        when(repository.save(any(Device.class))).thenReturn(newDevice); 
        
        Device savedDevice = service.createDevice(newDevice); 
        
        assertNotNull(savedDevice, "The saved device should not be null");
        assertEquals("DEVICE_TEST_01", savedDevice.getUnitId(), "The IDs should match");
        
        verify(repository, times(1)).save(newDevice);
    }

    @Test
    public void testGetDeviceById_Found() { 
        Device existingDevice = new Device(); 
        existingDevice.setUnitId("DEVICE_TEST_02"); 
        
        when(repository.findById("DEVICE_TEST_02")).thenReturn(Optional.of(existingDevice));

        Optional<Device> result = service.getDeviceById("DEVICE_TEST_02"); 
        
        assertTrue(result.isPresent(), "Device should be found");
        assertEquals("DEVICE_TEST_02", result.get().getUnitId());
    }
}