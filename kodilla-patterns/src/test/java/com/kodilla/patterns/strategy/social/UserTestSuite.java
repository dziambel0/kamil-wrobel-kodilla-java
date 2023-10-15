package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User szymon = new YGeneration("Szymon");
        User robert = new ZGeneration("Robert");
        User michal = new Millenials("Michal");
        //When
        String szymonShouldPost = szymon.sharePost();
        System.out.println(szymon.getName() + " wysyla posty na " + szymonShouldPost);
        String robertShouldPost = robert.sharePost();
        System.out.println(robert.getName() + " wysyla posty na " + robertShouldPost);
        String michalShouldPost = michal.sharePost();
        System.out.println(michal.getName() + " wysyla posty na " + michalShouldPost);
        //Then
        assertEquals("Snapchat", szymonShouldPost);
        assertEquals("Facebook", robertShouldPost);
        assertEquals("Twitter", michalShouldPost);

    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        User kamil = new Millenials("Kamil");
        //When
        String kamilShouldPost = kamil.sharePost();
        System.out.println(kamil.getName() + " wysyla posty na " + kamilShouldPost);
        kamil.setSocialPublisher(new FacebookPublisher());
        kamilShouldPost = kamil.sharePost();
        System.out.println(kamil.getName() + " po zmianie wysyla posty na " + kamilShouldPost);
        //Then
        assertEquals("Facebook", kamilShouldPost);
    }
}
