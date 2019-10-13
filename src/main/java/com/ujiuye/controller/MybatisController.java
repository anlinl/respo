package com.ujiuye.controller;

import com.ujiuye.mapper.UserMapper;
import com.ujiuye.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
