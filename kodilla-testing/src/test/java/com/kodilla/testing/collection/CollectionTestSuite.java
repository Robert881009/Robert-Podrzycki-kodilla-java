package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Checks list when is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        List<Integer> result1 = new ArrayList<>();
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        numbersExterminator.exterminate(result1);
        List<Integer> expectedResult = new ArrayList<>();
        Assertions.assertEquals(expectedResult,result1);
    }
    @DisplayName("Checks methode with normal numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        List<Integer> result2 = new ArrayList<>();
        result2.add(1);
        result2.add(2);
        result2.add(3);
        result2.add(4);
        result2.add(5);
        result2.add(6);

        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        List<Integer> result = numbersExterminator.exterminate(result2);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        Assertions.assertEquals(expectedResult,result);
    }
}
