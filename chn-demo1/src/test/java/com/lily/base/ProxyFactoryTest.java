package com.lily.base;

import com.andy.nan.entity.Order;
import org.apache.ibatis.executor.loader.ProxyFactory;
import org.apache.ibatis.executor.loader.ResultLoaderMap;
import org.apache.ibatis.executor.loader.javassist.JavassistProxyFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionManager;

import java.util.Arrays;

/**
 * @author caohu
 * @since 2022/5/13
 * MyBatis
 */
public class ProxyFactoryTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new JavassistProxyFactory();
        Order order = new Order("P12841", "北京");
        ObjectFactory objectFactory = new DefaultObjectFactory();
        Object proxyOrder = proxyFactory.createProxy(order
                , new ResultLoaderMap()
                , new Configuration()
                , objectFactory
                , Arrays.asList(String.class, String.class)
                , Arrays.asList(order.getOrderNo(), order.getAddress()));
        System.out.println(proxyOrder.getClass());
        System.out.println(((Order) proxyOrder).getOrderNo());
    }

}
