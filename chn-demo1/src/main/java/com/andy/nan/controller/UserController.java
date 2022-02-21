package com.andy.nan.controller;

import com.andy.nan.entity.User;
import com.andy.nan.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author caohu
 * @since 2022/2/20
 * Andy-myBatis-study
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/")
    public Object index(){
        User user = new User();
        user.setSchoolName("Sunny School");
        List<User> users = userMapper.queryUserBySchoolName(user);
        return users;
    }

}
