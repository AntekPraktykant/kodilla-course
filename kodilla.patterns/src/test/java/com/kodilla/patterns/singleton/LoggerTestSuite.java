package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //given
        Logger logger = Logger.getInstance();
        //when
        String message = "abc";
        logger.log(message);
        //then
        Assert.assertEquals(message, logger.getLastLog());
    }

}
