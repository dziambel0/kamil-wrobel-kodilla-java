package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class HomeworkTestSuite {
    @Test
    public void test(){
        //Given
        Homevork studentAbelardGiza = new HomeworkAbelardGiza();
        Homevork studentJanKowalski = new HomeworkJanKowalski();
        Mentor mentorJohnSmith = new Mentor("John Smith");
        Mentor mentorZbigniewNowak = new Mentor("Zbigniew Nowak");
        studentJanKowalski.registerObserver(mentorJohnSmith);
        studentAbelardGiza.registerObserver(mentorZbigniewNowak);
        //When
        studentJanKowalski.addHomework("Zadanie domowe 1");
        studentJanKowalski.addHomework("Zadanie domowe 2");
        studentJanKowalski.addHomework("Zadaniw domowe 3");
        studentAbelardGiza.addHomework("Zadanie domowe 1");
        //Then
        assertEquals(3,mentorJohnSmith.getUpdateCount());
        assertEquals(1,mentorZbigniewNowak.getUpdateCount());
    }
}
