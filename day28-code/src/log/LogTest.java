package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    public static void main(String[] args) {
        // 获取日志对象
        Logger logger = LoggerFactory.getLogger(LogTest.class);

        // 五个级别
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");

        logger.info("记录了一条日志");
    }
}
