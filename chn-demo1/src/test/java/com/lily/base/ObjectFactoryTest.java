package com.lily.base;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;

import java.util.List;
import java.util.Map;

/**
 * @author caohu
 * @since 2022/5/13
 * MyBatis
 */
public class ObjectFactoryTest {

    public static void main(String[] args) {
        ObjectFactory objectFactory = new DefaultObjectFactory();
        List<Integer> list = objectFactory.create(List.class);
        list.add(1);
        System.out.println(list);
        Map<String,String> map = objectFactory.create(Map.class);
        map.put("test","test");
        System.out.println(map);
    }
}
