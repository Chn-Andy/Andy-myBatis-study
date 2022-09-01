package com.lily.base;

import com.andy.nan.entity.Order;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.invoker.Invoker;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author caohu
 * @since 2022/5/12
 * Andy-myBatis-study
 */
public class MetaClassTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MetaClass metaClass = MetaClass.forClass(Order.class, new DefaultReflectorFactory());
        // 获取所有有 Getter方法的属性名
        System.out.println(Arrays.toString(metaClass.getGetterNames()));
        // 是否有默认的构造方法
        System.out.println(metaClass.hasDefaultConstructor());
        // address属性是否有setter方法
        System.out.println(metaClass.hasSetter("address"));
        // 获取orderNo的get方法的返回值类型
        System.out.println(metaClass.getGetterType("orderNo"));
        // 获取orderNo的 getOrderNo可执行方法
        Invoker getOrderNoInvoker = metaClass.getGetInvoker("orderNo");
        // 执行getOrderNo方法
        System.out.println(getOrderNoInvoker.invoke(new Order("PPK003", "同源"), null));
    }

}
