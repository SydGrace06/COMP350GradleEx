package edu.gcc.comp350;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        Calculator c = new Calculator();
        assertEquals(7, c.add(4, 3));
    }
}