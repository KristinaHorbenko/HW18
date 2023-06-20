package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.Averages.averagesNumber;
import static org.example.Filter.filter;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double average = averagesNumber(numbers);
        System.out.println("Среднее значение: " + average);

        //Task 2

        List <String> strings = List.of("one", "two", "three");
        List<Pair> upperCasePairs = Uppercase.createUpperCasePairs(strings);

        for(Pair pair : upperCasePairs) {
            System.out.println(pair.getICase() + ":" + pair.getuCase());
        }

        //Task 3

        List <String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("Orange");
        collection.add("pear");
        collection.add("Banana");
        collection.add("kiwi");

        List<String> filteredList = filter(collection);

        for (String str : filteredList) {
            System.out.println(str);
        }
        }
    }
