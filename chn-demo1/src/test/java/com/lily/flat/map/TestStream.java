package com.lily.flat.map;

import com.andy.nan.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author caohu
 * @since 2022/5/6
 * Andy-myBatis-study
 */
public class TestStream {

    public static void main(String[] args) {
        initUserList();
        findOneUser().ifPresent(user -> user.setName("andy"));
        findTwoUser().ifPresent(user -> user.setEmail("caohuanan123@126.com"));
        System.out.println(USER_LIST_LOCAL.get());
    }

    private static Optional<User> findOneUser(){
        return USER_LIST_LOCAL.get().stream().filter(user -> user.getId().equals(1L)).findAny();
    }

    private static Optional<User> findTwoUser(){
        return USER_LIST_LOCAL.get().stream().filter(user -> user.getId().equals(2L)).findAny();
    }

    private static void initUserList(){
        List<User> users = USER_LIST_LOCAL.get();
        users.add(new User(1L));
        users.add(new User(2L));
    }




    private static final ThreadLocal<List<User>> USER_LIST_LOCAL = ThreadLocal.withInitial(ArrayList::new);

}
