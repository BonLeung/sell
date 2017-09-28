package com.imooc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liangweibang on 2017/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {
    private final Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
    }
}
