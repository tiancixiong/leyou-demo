package com.leyou.userservice.controller;

import com.leyou.userservice.pojo.User;
import com.leyou.userservice.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:43
 */
@RestController
@RequestMapping("consume")
public class UserController2 {
    @Autowired
    private UserService2 userService2;

    @GetMapping
    public List<User> consume(@RequestParam("ids") List<Long> ids){
        return this.userService2.queryUserByIds(ids);
    }
}
