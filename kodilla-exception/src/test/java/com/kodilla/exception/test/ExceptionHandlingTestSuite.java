package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {
    @Test
    void probablyIWillThrowException(){
        //Give
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When & Then
        assertDoesNotThrow(()-> exceptionHandling.probablyIWillThrowException(1.5,2));
        assertThrows(Exception.class, ()-> exceptionHandling.probablyIWillThrowException(3,5));
        assertThrows(Exception.class, ()-> exceptionHandling.probablyIWillThrowException(1.5,1.5));
        assertThrows(Exception.class, ()-> exceptionHandling.probablyIWillThrowException(0.5,3));
        assertThrows(Exception.class, ()-> exceptionHandling.probablyIWillThrowException(3,1.5));

    }
}
