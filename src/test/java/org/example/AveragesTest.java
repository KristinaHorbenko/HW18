package org.example;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AveragesTest {

    @Test
    void averagesNumberOne() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(30, new Averages().averagesNumber(numbers));
    }

    @Test
    void averagesNumberTwo() {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 4);
        assertEquals(4.5, new Averages().averagesNumber(numbers));
    }
}