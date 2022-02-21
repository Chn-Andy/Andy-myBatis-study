package com.andy.nan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 * @author caohu
 */
@SpringBootApplication
public class ApplicationStart {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationStart.class,args);
    }
}
