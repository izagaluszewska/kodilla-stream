package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(number -> System.out.println(numbers[number]));
        double result = IntStream.range(0, numbers.length)
                .map(number -> numbers[number])
                .average().orElse(0);
        System.out.println("\nThe average equals: " + result);
        return result;
    }
}