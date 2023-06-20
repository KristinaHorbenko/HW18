package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UppercaseTest {

    @Test
    void createUpperCasePairsTestOne() {
        Pair pair = new Pair("apple", "APPLE");
        List<String> strings = new ArrayList<>();
        strings.add(pair.getICase());
        List<Pair> result = Uppercase.createUpperCasePairs(strings);
        String actualUpperCaseString = result.get(0).getuCase();
        String expectedUpperCaseString = pair.getuCase();

        assertEquals(expectedUpperCaseString, actualUpperCaseString);
    }


    @Test
    void createUpperCasePairsTestTwo() {
        Pair pair = new Pair("orange", "ORANGE");
        List<String> strings = new ArrayList<>();
        strings.add(pair.getICase());
        List<Pair> result = Uppercase.createUpperCasePairs(strings);
        String actualUpperCaseString = result.get(0).getuCase();
        String expectedUpperCaseString = pair.getuCase();

        assertEquals(expectedUpperCaseString, actualUpperCaseString);
    }

    @Test
    void createUpperCasePairsTestThree() {
        Pair pair = new Pair("pear", "PEAR");
        List<String> strings = new ArrayList<>();
        strings.add(pair.getICase());
        List<Pair> result = Uppercase.createUpperCasePairs(strings);
        String actualUpperCaseString = result.get(0).getuCase();
        String expectedUpperCaseString = pair.getuCase();

        assertEquals(expectedUpperCaseString, actualUpperCaseString);
    }
}