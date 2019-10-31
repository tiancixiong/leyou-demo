package com.leyou.userservice.service;

import com.leyou.userservice.pojo.User;

import java.util.List;

public interface UserService2 {
    List<User> queryUserByIds(List<Long> ids);
}
