package com.lily.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.andy.nan.entity.User;

import java.nio.charset.StandardCharsets;

/**
 * @author caohu
 * @since 2022/5/24
 * Andy-myBatis-study
 */
public class TestParseJson {

    public static void main(String[] args) {
        parse(JSON.toJSONString(new User(1L)).getBytes(StandardCharsets.UTF_8));
    }

    public static void parse(byte[] bytes){
        User user = JSONObject.parseObject(bytes, User.class);
        System.out.println(JSON.toJSONString(user));
        System.out.println(user.getName());
    }

}
