package com.dawn.bgSys.dao;

import com.dawn.bgSys.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {
    int deleteByPrimaryKey(List<String> ids);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    List<User> selectByUserType(@Param("userType")String userType,@Param("searchStr")String searchStr);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}