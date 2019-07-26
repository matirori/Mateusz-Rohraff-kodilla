package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Mark");
        User andrew = new ZGeneration("Andrew");
        User mathew = new YGeneration("Mathew");
        //When
        String marksPost = mark.sharePost();
        String adnrewsPost = andrew.sharePost();
        String mathewsPost = mathew.sharePost();
        //Then
        Assert.assertEquals("Snapchat publisher", marksPost);
        Assert.assertEquals("Twitter publisher", adnrewsPost);
        Assert.assertEquals("Facebook publisher", mathewsPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mark = new Millenials("Mark");
        //When
        mark.setSocialPublisher(new FacebookPublisher());
        String marksPost = mark.sharePost();
        //Then
        Assert.assertEquals("Facebook publisher", marksPost);
    }
}
