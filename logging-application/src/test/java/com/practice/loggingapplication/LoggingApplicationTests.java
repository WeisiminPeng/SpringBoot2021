package com.practice.loggingapplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoggingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads(){
        logger.trace("This is trace...");
        logger.debug("This is debug...");
        logger.info("This is info...");
        logger.warn("This is warn...");
        logger.error("This is error...");
    }

}
