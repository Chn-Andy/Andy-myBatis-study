### 这次我们再加入两个依赖

1. `mybatis-spring-boot-starter` spring-boot的mybatis的场景启动
2. `mysql-connector-java` mysql的连接驱动以来
2. 再添加如下数据库连接的配置

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/study-mybatis
    username: root
    password: root
```



### 这里我们用了一个取巧的方式把映射文件和映射接口文件放在了相同的路径下

![image-20220221214621819.png](https://upload-images.jianshu.io/upload_images/5898922-27769fb374b9c015.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

如果在相同的目录下就会得到如下编译后的目录结果

![image-20220221215222770.png](https://upload-images.jianshu.io/upload_images/5898922-a56c418f3beecbba.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

这就造成了我们不需要写mybati.mapper-locations属性就能执行xml的位置

> 注：这里我遇到了一个问题造成了一直没有让UserMapper.xml加载上，就是target编译的问题，解决方式是clean之后重新编译生成，直到出现上图的编译结果。

