package com.kodilla.stream.array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] number = {22,45,31,56,56,73,42,34,56,72,13,42,27,64,84,34,56,75,12,16};
        //When
        double average = ArrayOperations.getAverage(number);
        //Then
        Assertions.assertEquals(45.5,average);
    }


}
