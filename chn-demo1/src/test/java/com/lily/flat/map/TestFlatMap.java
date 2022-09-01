package com.lily.flat.map;

import com.andy.nan.entity.User;
import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author caohu
 * @since 2022/4/27
 * Andy-myBatis-study
 */
public class TestFlatMap {

    public static void main(String[] args) {
        List<User> andy = Stream.of(new User())
                .peek(user -> user.setName("andy"))
                .collect(Collectors.toList());
        System.out.println(andy.get(0));

    }

    private static List<User> queryUserList(){
        return null;
    }

    private static String findName(){
        return "caohn";
    }

}
