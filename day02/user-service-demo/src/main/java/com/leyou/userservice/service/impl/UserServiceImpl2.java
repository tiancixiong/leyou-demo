package com.leyou.userservice.service.impl;

import com.leyou.userservice.mapper.UserDao;
import com.leyou.userservice.pojo.User;
import com.leyou.userservice.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:41
 */
@Service
public class UserServiceImpl2 implements UserService2 {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUserByIds(List<Long> ids){
        List<User> users = new ArrayList<>();
        for (Long id : ids) {
            User user = this.userDao.queryUserById(id);
            users.add(user);
        }
        return users;
    }
}
