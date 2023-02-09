package ru.clevertec.stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void shouldReturnTrue() {
        assertTrue(StringUtils.isPositiveNumber("9595.3"));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(StringUtils.isPositiveNumber("-9595.3"));

    }

    @Test
    void shouldReturnException() {
        assertThrows(NumberFormatException.class, () -> StringUtils.isPositiveNumber("56198few33"));
    }
}
