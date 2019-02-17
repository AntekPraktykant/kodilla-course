package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int [] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Assert.assertEquals(9.5, ArrayOperations.getAverage(array), 0.001);
    }
}
