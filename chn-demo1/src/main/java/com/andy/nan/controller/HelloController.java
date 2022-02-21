package com.andy.nan.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caohu
 */
@RestController
@RequestMapping("/andy")
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello(){
        logger.trace("It is a trace logger.");
        logger.debug("It is a debug logger.");
        logger.info("It is a info logger.");
        logger.warn("It is a warn logger.");
        logger.error("It is an error logger.");
        logger.fatal("It is a fatal logger.");
        return "Hello~  Andy";
    }
}
