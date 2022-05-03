package com.kodilla.stream.array;

import java.util.Arrays;



public interface ArrayOperations {
    static double getAverage(int[] numbers){
        Arrays.stream(numbers)
                .forEach(System.out::println);

        double asDouble = Arrays.stream(numbers)
                .average()
                .getAsDouble();

        return asDouble;
    }
}
