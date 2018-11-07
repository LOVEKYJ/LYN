package com.lyn.controller;

import com.lyn.mapper.UserMapper;
import com.lyn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
@EnableAutoConfiguration
public class LynController {

    @Autowired
    private UserMapper userMapper;
    //所有用户
    @GetMapping("selectUserAll")
    public List<User> selectUserAll(){
        List<User> users = userMapper.selectUserAll();
        return users;
    }
    //用户注册(有问题)
    @PostMapping("insertUser")
    public void insertUser(@RequestBody User user){
        int insert = userMapper.insert(user);
    }
    //用户登录
    @GetMapping("selectUserByName")
    public void selectUserByName(@RequestParam String userName,@RequestParam String userPassword) throws Exception {
        User user = userMapper.selectUserByName(userName);
        if(user.getEncryptedPassword().equals(userPassword)){
            System.out.printf("欢迎您，成功登录！");
        }else {
            System.out.printf("用户名或密码错误，请重新输入！");
            throw new Exception("用户名或密码错误，请重新输入！");
        }
    }
    //用户注销
    @PostMapping("loginOutUser")
    public void loginOutUser(@RequestParam String userName){
        User user = userMapper.selectUserByName(userName);
        user.setIsDelete(true);
        userMapper.updateByPrimaryKey(user);
    }
    //用户的基本信息
    @GetMapping("selectUserToName")
    public User selectUserToName(@RequestParam String userName){
        User user = userMapper.selectUserByName(userName);
        return user;
    }
    //修改用户信息
    @PostMapping("updateUserByName")
    public void updateUserByName(@RequestBody User user){
        User userByName = userMapper.selectUserByName(user.getUsername());
        if(user.getEncryptedPassword()!=null && !user.getEncryptedPassword().equals("")){
            userByName.setEncryptedPassword(user.getEncryptedPassword());
        }else if(user.getRealname()!=null && !user.getRealname().equals("")){
            userByName.setRealname(user.getRealname());
        }else if(user.getBirthday()!=null && !user.getBirthday().equals("")){
            userByName.setBirthday(user.getBirthday());
        }else if(user.getEmail()!=null && !user.getEmail().equals("")){
            userByName.setEmail(user.getEmail());
        }else if(user.getMobile()!=null && !user.getMobile().equals("")){
            userByName.setMobile(user.getMobile());
        }
        userMapper.updateByPrimaryKey(userByName);
    }
    //修改用户密码
    @PostMapping("/updatePassword")
    public void updatePassword(@RequestBody User user){
        Map<String,String> map=new HashMap<String,String>();
        map.put("userName",user.getUsername());
        map.put("userPassword",user.getEncryptedPassword());
        userMapper.updatePassword(map);
    }
}