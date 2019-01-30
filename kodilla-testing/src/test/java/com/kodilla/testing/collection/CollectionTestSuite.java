package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Starting collection tests");
    }
    @After
    public void after() {
        System.out.println("Collection tests ended");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        ArrayList<Integer> empty = new ArrayList<Integer>();
        //when
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(empty);
        //then
        Assert.assertEquals(empty, result);

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer i = 0; i < 10; i++) {
            list.add(i);
        }
        //when
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        //then
        for (Integer i : result) {
            Assert.assertEquals(0, i % 2);
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList2() {
        //given
        int numberOfElements = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (Integer i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        //when
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        //then
        for (Integer i = 0; i < numberOfElements; i += 2) {
            evenList.add(i);
        }
        Assert.assertEquals(evenList, result);
    }
}
