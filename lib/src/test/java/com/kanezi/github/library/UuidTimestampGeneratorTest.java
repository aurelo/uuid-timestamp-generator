package com.kanezi.github.library;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class UuidTimestampGeneratorTest {
    @Test
    void generatesUniqueValues() {
        String firstValue = UuidTimestampGenerator.generate();
        String secondValue = UuidTimestampGenerator.generate();

        assertNotEquals(firstValue, secondValue);

    }
}
