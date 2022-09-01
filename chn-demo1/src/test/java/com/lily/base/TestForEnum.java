package com.lily.base;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author caohu
 * @since 2022/5/24
 * MyBatis
 */
public class TestForEnum {

    public enum business{
        finish,
        success
    }

    public enum capital{
        finish
    }

    public static void main(String[] args) {
//        judgeIsBusinessFinish("com.lily.base.TestForEnum$business");
        Arrays.stream(business.values())
                .forEach(enumValue -> justPrint(enumValue.getClass().getName()+"#"+enumValue.name()));
    }

    public static void justPrint(String value){
        System.out.println(value);
    }


    public static void judgeIsBusinessFinish(String clazz){
        Arrays.stream(business.values())
                .filter(enumValue -> Objects.equals(enumValue.getClass().toString(),clazz))
                .findAny()
                .ifPresent(enumValue -> System.out.println("传递过来的class类型被找到，"+enumValue.getClass()));
    }


}
