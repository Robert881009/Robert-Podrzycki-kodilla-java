package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void log(){
        logger = Logger.INSTANCE;
        logger.log("10.07.2022");
    }
    @Test
    void getLastLog(){
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println(lastLog);
        //Then
        assertEquals("10.07.2022", lastLog);
    }

}
