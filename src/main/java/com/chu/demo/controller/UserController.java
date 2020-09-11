package com.chu.demo.controller;

import com.chu.demo.entity.User;
import com.chu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping(value = "/CRUD", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
    @RequestMapping("/ListUser")
    @ResponseBody
    public List<User> ListUser(){
        return userservice.ListUser();
    }
    //对数据库进行查找操作
    @RequestMapping("/ListUserByname")
    @ResponseBody
    public List<User> ListUserByname(String name){
        return userservice.findByName(name);
    }
    @Autowired
    private UserService userservice;
    //对数据库进行的删除操作
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userservice.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user)
    {
        return userservice.insertUser(user);
    }
}
