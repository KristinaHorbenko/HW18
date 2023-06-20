package org.example;

import java.util.List;

public class Averages {
    public static double  averagesNumber(List<Integer> numbers) {
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение: " + average);
        return average;

    }
}
