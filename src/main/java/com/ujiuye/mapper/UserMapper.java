package com.ujiuye.mapper;

import com.ujiuye.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAll();
}
