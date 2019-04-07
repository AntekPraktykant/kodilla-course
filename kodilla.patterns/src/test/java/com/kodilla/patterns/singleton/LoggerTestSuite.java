package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //given
        Logger logger = new Logger();
        //when
        String message = "abc";
        logger.log(message);
        //then
        Assert.assertEquals(message, logger.getLastLog());
    }

}
