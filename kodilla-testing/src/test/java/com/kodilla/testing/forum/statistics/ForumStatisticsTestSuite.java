package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    public ForumStatisticsTestSuite() {
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        ++testCounter;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
        System.out.println("-------------------------------------");
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0L, (long)forumStatistics.averagePostsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhen1000Posts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(1000L, (long)forumStatistics.averagePostsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(123);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0L, (long)forumStatistics.averageCommentsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhenMorePostsThanComments() {
        Statistics statisticsMock =  mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0.01D, (double)forumStatistics.averageCommentsPerPost, 0.1D);
    }

    @Test
    public void testCalculateAdvStatisticsWhenMoreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(100L, (long)forumStatistics.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0L, (long)forumStatistics.averageCommentsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhen100Users() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(10L, (long)forumStatistics.averageCommentsPerUser);
    }
}


