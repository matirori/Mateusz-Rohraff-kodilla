package com.kodilla.testing.forum.statistics;

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
    public void test1() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(0.01, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(100, forumStatistics.getAvgQuantityOfPostsPerUser());
    }

    @Test
    public void test2() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfPostsPerUser());
    }

    @Test
    public void test3() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfPostsPerUser());
    }

    @Test
    public void test4() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(0.1, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfPostsPerUser());
    }

    @Test
    public void test5() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();
        for(int i=0; i<10; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(10, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(1, forumStatistics.getAvgQuantityOfPostsPerUser());
    }

    @Test
    public void test6() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(0.1, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfPostsPerUser());
    }

    @Test
    public void test7() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> fakeUsers = new LinkedList<>();

        for(int i=0; i<100; i++){
            fakeUsers.add("blablabla");
        }

        when(statisticsMock.usersNames()).thenReturn(fakeUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //when
        forumStatistics.calculateAdvanceStatistics(statisticsMock);
        //then
        Assert.assertEquals(0.1, forumStatistics.getAvgQuantityOfCommentsPerPost());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(0, forumStatistics.getAvgQuantityOfPostsPerUser());
    }
}
