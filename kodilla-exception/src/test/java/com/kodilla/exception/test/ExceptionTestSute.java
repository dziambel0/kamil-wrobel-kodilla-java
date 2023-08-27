package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTestSute {

    @Test
    public void testReadFileWithName() {
        // Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2)),
                () -> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(2,2)),
                () -> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(0,2)),
                () -> assertThrows(Exception.class, ()-> secondChallenge.probablyIWillThrowException(1,1.5))
        );
    }
}
