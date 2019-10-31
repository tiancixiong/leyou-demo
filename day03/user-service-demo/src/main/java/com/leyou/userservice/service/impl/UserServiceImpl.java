package com.leyou.userservice.service.impl;

import com.leyou.userservice.mapper.UserMapper;
import com.leyou.userservice.pojo.User;
import com.leyou.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

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
    public User queryById(Long id) throws InterruptedException {
        // 为了演示超时现象，我们在这里然线程休眠,时间随机 500~2500毫秒
        Thread.sleep(new Random().nextInt(2000));

        return this.userMapper.selectByPrimaryKey(id);
    }
}
