package com.leyou.consumerdemo.controller;

import com.leyou.consumerdemo.pojo.User;
import com.leyou.consumerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:43
 */
@RestController
@RequestMapping("consume")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> consume(@RequestParam("ids") List<Long> ids){
        return this.userService.queryUserByIds(ids);
    }
}
