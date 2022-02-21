package com.andy.nan.mapper;

import com.andy.nan.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author caohu
 * @since 2022/2/20
 * Andy-myBatis-study
 */
@Mapper
public interface UserMapper {

    /**
     * 查询一个学校的所有用户列表
     * @param user 用户查询对象
     * @return 查询到的用户列表
     */
    List<User> queryUserBySchoolName(User user);

}
