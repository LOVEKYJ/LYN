package com.lyn.mapper;

import com.lyn.pojo.User;
import org.hibernate.validator.constraints.EAN;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    List<User> selectUserAll();
    User selectUserByName(String username);
    int updatePassword(Map<String,String> map);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}