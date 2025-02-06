package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class test_log4j {
    private static final Logger logger = LogManager.getLogger(test_log4j.class);

    public static void main(String[] args) {
        logger.info("This is an info message.");
        logger.error("This is an error message.");
    }
}
