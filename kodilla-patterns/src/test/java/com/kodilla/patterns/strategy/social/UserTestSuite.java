package com.kodilla.patterns.strategy.social;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Give
        User mark = new Millenials("Mark");
        User john = new YGeneration("John");
        User tom = new ZGeneration("Tom");
        //When
        String markPublisher = mark.sharePost();
        String johnPublisher = john.sharePost();
        String tomPublisher = tom.sharePost();
        //Then
        assertEquals("Facebook",markPublisher);
        assertEquals("Twitter", johnPublisher);
        assertEquals("Snapchat", tomPublisher);

    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        User mark = new Millenials("Mark");
        //When
        String markPublisher = mark.sharePost();
        mark.setSocialPublisher(new SnapchatPublisher());
        markPublisher = mark.sharePost();
        //Then
        assertEquals("Snapchat",markPublisher);


    }
}
