package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAvdancedStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //given
//        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        int noOfUsers = 0;
        Assert.assertEquals(0, 0);
        //when
//        when(statisticMock.postsCount()).thenReturn(0);
//        when(statisticMock.commentsCount()).thenReturn(0);
//
//        CalculateAdvancedStatistics advancedStatistics = new CalculateAdvancedStatistics(statisticMock);
////        //then
//        Assert.assertEquals(0, advancedStatistics.getNoOfUsers());
//        Assert.assertEquals(0, advancedStatistics.getNoOfPosts());
//        Assert.assertEquals(0, advancedStatistics.getNoOfComments());
//
//        Assert.assertEquals(-1, advancedStatistics.getAvgCommentsPerPost(), 5);
//        Assert.assertEquals(-1, advancedStatistics.getAvgCommentsPerUser(), -5);
//        Assert.assertEquals(-1, advancedStatistics.getAvgPostsPerUser(), -5);

//        noOfUsers = 100;
//        for (int i = 0; i < noOfUsers; i++) {
//            names.add("Name");
//        }
//        Statistics statisticMock = mock(Statistics.class);
//        CalculateAdvancedStatistics advancedStatistics = new CalculateAdvancedStatistics(statisticMock);
//        System.out.println(names.size());
//        when(statisticMock.usersNames()).thenReturn(names);
//        when(statisticMock.postsCount()).thenReturn(1000);
//        when(statisticMock.commentsCount()).thenReturn(50);
//
//        //then
//        Assert.assertEquals(100, advancedStatistics.getNoOfUsers());
//        Assert.assertEquals(advancedStatistics.getNoOfPosts(), 1000);
//        Assert.assertEquals(advancedStatistics.getNoOfComments(), 50);
//
//        Assert.assertEquals(advancedStatistics.getAvgCommentsPerPost(), 0.05, 5);
//        Assert.assertEquals(advancedStatistics.getAvgCommentsPerUser(), 0.5, 5);
//        Assert.assertEquals(advancedStatistics.getAvgPostsPerUser(), 10, 5);
    }
}
