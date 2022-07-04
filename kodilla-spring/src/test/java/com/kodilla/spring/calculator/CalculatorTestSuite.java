package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        //When
        double add = calculator.add(5,5);
        double sub = calculator.sub(10,5);
        double mul = calculator.mul(5,5);
        double div = calculator.div(10,5);
        //Then
        assertEquals(10,add);
        assertEquals(5,sub);
        assertEquals(25,mul);
        assertEquals(2,div);
    }
}
