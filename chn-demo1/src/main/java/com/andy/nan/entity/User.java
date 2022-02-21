package com.andy.nan.entity;

import lombok.Data;

/**
 * @author caohu
 * @since 2022/2/20
 * Andy-myBatis-study
 */
@Data
public class User {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private Integer sex;
    private String schoolName;

}
