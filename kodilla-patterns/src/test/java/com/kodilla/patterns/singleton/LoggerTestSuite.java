package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void testgetLastLog(){
        //Given
        Logger logger = Logger.INSTANT;
        logger.log("Test");
        //When
        String s = logger.getLastLog();
        //Then
        assertEquals("Test", s);
    }
}
