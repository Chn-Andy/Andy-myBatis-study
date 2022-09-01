package com.mapper;

import com.entity.UserEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author caohu
 * @since 2022/9/1
 * Andy-myBatis-study
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return 所有用户列表
     */
    List<UserEntity> listAllUser();

    /**
     * 根据用户id获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    @Select("select * from user where id = #{id}")
    UserEntity findUserById(Long id);

}
