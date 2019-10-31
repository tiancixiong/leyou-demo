package com.leyou.consumerdemo.service.impl;

import com.leyou.consumerdemo.pojo.User;
import com.leyou.consumerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:41
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;// Eureka客户端，可以获取到服务实例信息

    @Override
    public List<User> queryUserByIds(List<Long> ids) {
        List<User> users = new ArrayList<>();
        // String baseUrl = "http://localhost:8081/user/";

        // 根据服务名称，获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        // 因为只有一个UserService，因此我们直接get(0)获取
        ServiceInstance instance = instances.get(0);
        // 获取ip和端口信息
        String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/";
        ids.forEach(id -> {
            // 我们测试多次查询
            users.add(this.restTemplate.getForObject(baseUrl + id, User.class));
            // 每次间隔500ms
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        return users;
    }
}
