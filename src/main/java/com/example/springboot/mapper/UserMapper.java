package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM testvue.sys_vue")
    List<User> findAll();

@Insert("INSERT INTO sys_vue  (username,password,nickname,email,phone,address) values(#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    int insert(User user);



    int update(User user);
@Delete("delete from sys_vue where id =#{id}")
    Integer deleteByid(@Param("id") Integer id);
}
