package org.example;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void filter() {
        List<String> strings = Arrays.asList("apple", "pear", "Mango", "kiwi");
        List<String> expected = List.of( "pear", "kiwi");
        List<String> actual = strings.stream().filter(s -> s.length() == 4 && s.equals(s.toLowerCase())).
                collect(Collectors.toList());

         assertEquals(expected, actual);

    }
}