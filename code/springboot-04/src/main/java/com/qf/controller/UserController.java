package com.qf.controller;


import com.qf.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
//@Api(description="用户操作")
@Api(tags="用户操作")
public class UserController {


    @ApiOperation("删除用户")
    @RequestMapping("deleteUser")
    public String deleteUser(String id){
        System.out.println("deleteUser："+id);
        return "success";
    }

    @ApiOperation("查询单个用户")
    @GetMapping("findById")
    public String findById(@RequestParam @ApiParam("用户编号") String id){
        System.out.println("findById："+id);
        return "success";
    }

    @ApiOperation("查询所有用户")
    @PostMapping("findAll")
    public List<User> findAll(){
        System.out.println("findAll");

        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1001,"张三","123"));
        list.add(new User(1002,"李四","456"));
        list.add(new User(1003,"王五","789"));

        return list;
    }
}
