package com.example.cs3500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    void testApp(){
        assertTrue(true);
    }

    @Test
    void testAddNegativeNumber() { 
        assertEquals(-5, App.add(-2, -3));
    }
        @Test
    void testAddNegativeNumber1() { 
        assertEquals(-6, App.add(-3, -3));
    }
}