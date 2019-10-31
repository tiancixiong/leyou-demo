package com.leyou.userservice.service.impl;

import com.leyou.userservice.mapper.UserMapper;
import com.leyou.userservice.pojo.User;
import com.leyou.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:09
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
