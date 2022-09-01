package com.lily.base;

import com.andy.nan.entity.Order;
import com.andy.nan.entity.User;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author caohu
 * @since 2022/5/12
 * Andy-myBatis-study
 */
public class MeteObjectTest {

    public static void main(String[] args) {
        User user = initUser();
        MetaObject metaObject = SystemMetaObject.forObject(user);
        // orderList列表，获取第一个的orderNo值
        System.out.println(metaObject.getValue("orderList[0].orderNo"));
        //判断user对象是否有orderNo的get方法
        System.out.println(metaObject.hasGetter("orderNo"));
        System.out.println(metaObject.hasGetter("orderList[1].name"));
        System.out.println(user.getName());
        metaObject.setValue("name","andy");
        System.out.println(user.getName());
    }

    public static User initUser(){
        User user = new User(1L);
        Order orderOne = new Order("PK001","上海");
        Order orderTow = new Order("PK002","北京");
        user.setOrderList(Stream.of(orderOne,orderTow).collect(Collectors.toList()));
        return user;
    }

}
