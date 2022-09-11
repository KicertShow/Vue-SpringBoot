package com.example.springboot.Controller;

import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
//新增還有修改
    @PostMapping
    public Integer save(@RequestBody User user){
        //insert or update all in
       return userService.save(user);
    }
//查詢所有數據
    @GetMapping
    public List<User> index(){
        List<User> user =  userMapper.findAll();
        return user;
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id){
        return userMapper.deleteByid(id);
    }
}
