## 创建一个Spring boot的web项目，并且启动完成有如下几个步骤：

1. 在pom文件中加入依赖包的引用

   > ```xml
   > <parent>
   >     <groupId>org.springframework.boot</groupId>
   >     <artifactId>spring-boot-starter-parent</artifactId>
   >     <version>2.6.3</version>
   > </parent>
   > 
   > <dependencies>
   >     <dependency>
   >         <groupId>org.springframework.boot</groupId>
   >         <artifactId>spring-boot-starter-web</artifactId>
   >     </dependency>
   > </dependencies>
   > ```
   >
   > 从上面添加的依赖可以看到，整个项目的启动只需要`spring-boot-starter-web`这么一个依赖包
   >
   > 然后我们用了一个`parent`标签，来管理下面所有的spring-boot相关包的版本号

2. 加入项目的启动类

   > ```java
   > /**
   >  * 项目启动类
   >  * @author caohu
   >  */
   > @SpringBootApplication
   > public class ApplicationStart {
   > 
   >     public static void main(String[] args) {
   >         SpringApplication.run(ApplicationStart.class,args);
   >     }
   > }
   > ```
   >
   > - 这里用的是复合注解`@SpringBootApplication`
   > - 然后用的`SpringApplication`类的静态方法`run()`来启动项目

3. 我们在resource目录下加入了配置文件`application.yml`

==以上就可以启动整个项目了==

