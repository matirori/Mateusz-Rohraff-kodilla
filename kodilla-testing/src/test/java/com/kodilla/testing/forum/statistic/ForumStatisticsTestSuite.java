package com.kodilla.testing.forum.statistic;

import org.junit.*;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void conditionPostQuantity1000() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(0.01, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(100, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }

    @Test
    public void conditionPostQuantity0() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }

    @Test
    public void conditionCommnetsQuantity0() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }

    @Test
    public void conditionCommentsQuantityLessThanPostQuantity() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(0.1, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }

    @Test
    public void conditionCommentsQuantityGreaterThanPostQuantity() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }

    @Test
    public void conditionUserQuantity0() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<0; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }

    @Test
    public void conditionUserQuantity100() {
        //given
       Statistic statisticsMock = mock(Statistic.class);
        List<String> fakeUsers = new LinkedList<>();

        for(int i=0; i<100; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics();
        //then
        Assert.assertEquals(0.1, forumStatistics.getAvgQuantityOfCommentsPerPost(), 0.001);
        Assert.assertEquals(0.1, forumStatistics.getAvgQuantityOfCommentsPerUser(), 0.001);
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfPostsPerUser(), 0.001);
    }
}
