package com.mybatis.test.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Date;


import com.mybatis.test.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //测试生成代码,方法名然后alt+回车即可生成
    List<User> findByAll(User user);


}