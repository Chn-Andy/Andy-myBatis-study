package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author caohu
 * @since 2022/9/1
 * Andy-myBatis-study
 */
@Data
public class UserEntity {

    private Long id;
    private String name;
    private String password;
    private String phone;
    private Date createTime;

    public void printSelf(){
        System.out.println(id + ",name=" + name + ",password=" + password);
    }

}
