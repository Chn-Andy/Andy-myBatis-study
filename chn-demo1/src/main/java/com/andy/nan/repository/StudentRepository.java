package com.andy.nan.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author caohu
 * @since 2022/2/20
 * Andy-myBatis-study
 */
public class StudentRepository {

    private static final Logger logger = LogManager.getLogger(StudentRepository.class);

    /**
     * ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        logger.debug("It is a debug logger.");
        logger.error("It is an error logger.");
        logger.fatal("It is a fatal logger.");
        logger.info("It is a info logger.");
        logger.trace("It is a trace logger.");
        logger.warn("It is a warn logger.");
    }
}
