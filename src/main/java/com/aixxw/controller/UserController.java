package com.aixxw.controller;


import com.aixxw.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
//@Api(description = "用户管理")
@Api(tags = "用户管理")
public class UserController {

    @RequestMapping("deleteUser")
    public String delete(String id) {
        System.out.println("deleteUser" + id);
        return "success";
    }
    @GetMapping("find")
    public String find() {
        return "success";
    }
    @ApiOperation("增加用户")
    @PostMapping("addUser")
    public String addUser(@RequestParam @ApiParam("用户名") String name, Integer age) {
        System.out.println(name);
        System.out.println(age);
        return "success";
    }
    @ApiOperation("查找所有用户")
    @GetMapping("findAll")
    public List<User> findAll() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"name1","222"));
        users.add(new User(2,"name2","333"));
        users.add(new User(3,"name3","444"));
        users.add(new User(4,"name4","4555"));
        return users;
    }

}
