package com.example.demo.service;

import com.example.demo.model.BeeBox;
import com.example.demo.repository.BeeBoxRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // Tells JUnit to enable Mockito
public class BeeBoxServiceTest {

    @Mock
    private BeeBoxRepository repository; // This creates a "fake" database

    @InjectMocks
    private BeeBoxService service; // This injects the fake database into your real service

    @Test
    public void testCreateBeeBox() {
        // 1. ARRANGE (Set up the fake data and rules)
        BeeBox newBox = new BeeBox();
        newBox.setUnitId("BEEBOX_TEST_01");

        // Tell the fake repository: "If anyone calls save(), just return newBox"
        when(repository.save(any(BeeBox.class))).thenReturn(newBox);

        // 2. ACT (Call the actual method you want to test)
        BeeBox savedBox = service.createBeeBox(newBox);

        // 3. ASSERT (Check if the result is exactly what you expected)
        assertNotNull(savedBox, "The saved box should not be null");
        assertEquals("BEEBOX_TEST_01", savedBox.getUnitId(), "The IDs should match");
        
        // Verify that the repository's save() method was actually called exactly 1 time
        verify(repository, times(1)).save(newBox);
    }

    @Test
    public void testGetBeeBoxById_Found() {
        // 1. ARRANGE
        BeeBox existingBox = new BeeBox();
        existingBox.setUnitId("BEEBOX_TEST_02");
        
        when(repository.findById("BEEBOX_TEST_02")).thenReturn(Optional.of(existingBox));

        // 2. ACT
        Optional<BeeBox> result = service.getBeeBoxById("BEEBOX_TEST_02");

        // 3. ASSERT
        assertTrue(result.isPresent(), "BeeBox should be found");
        assertEquals("BEEBOX_TEST_02", result.get().getUnitId());
    }
}