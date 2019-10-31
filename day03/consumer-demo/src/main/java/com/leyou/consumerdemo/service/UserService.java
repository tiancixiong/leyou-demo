package com.leyou.consumerdemo.service;

import com.leyou.consumerdemo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryUserByIds(List<Long> ids);
}
