1. 在项目里添加log4j2的spring-boot启动包

   > ```xml
   > <dependency>
   >     <groupId>org.springframework.boot</groupId>
   >     <artifactId>spring-boot-starter-log4j2</artifactId>
   > </dependency>
   > ```

2. 根据log4j2的日志级别 `ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL`，打印出来的日志可以知道spring-boot默认的日志级别为INFO,对于日志级别你可以这么理解：日志级别比自己高的都会被打印出来。因为日志级别越低那么打印出来的东西将会越详细。

   >log4j2的默认配置如下(log4j2.xml)：
   >
   >```xml
   ><?xml version="1.0" encoding="UTF-8"?>
   ><configuration status="OFF">
   >    <appenders>
   >        <Console name="Console" target="SYSTEM_OUT">
   >            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
   >        </Console>
   >    </appenders>
   >    <loggers>
   >        <root level="error">
   >            <appender-ref ref="Console"/>
   >        </root>
   >    </loggers>
   ></configuration>
   >```

3. 因为用的spring-boot-starter-log4j2的依赖包默认日志级别为INFO，可用通过配置logging.level.root = DEBUG来调整为DEBUG级别

   > ```yaml
   > logging:
   >   level:
   >     root: info
   > ```
   >
   > - 这里要注意的是logging.level就是配置项，要需要的值是：Map<String,LogLevel>类型的值，这里我们填的是`root: info`
   >
   > - 而且log4j2.xml的配置也不会再生效了
   > - 当我们把日志设置为trace的时候会有惊喜发现，打印除了很多spring和spring-boot加载数据的过程信息。

4. 通过官方文档可知如果是直接用的log4j2-core，他们的默认级别为ERROR，所以用如下代码打印出来的只会是ERROR和FATAL的日志。

   > ```java
   > logger.trace("It is a trace logger.");
   > logger.debug("It is a debug logger.");
   > logger.info("It is a info logger.");
   > logger.warn("It is a warn logger.");
   > logger.error("It is an error logger.");
   > logger.fatal("It is a fatal logger.");
   > ```