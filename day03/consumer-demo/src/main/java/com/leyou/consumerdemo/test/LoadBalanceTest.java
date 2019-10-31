package com.leyou.consumerdemo.test;

import com.leyou.consumerdemo.UserConsumerDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: TianCi.Xiong
 * @Description: 测试Robbin负载均衡策略
 * @Date: Created in 2019-10-31 12:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserConsumerDemoApplication.class)
public class LoadBalanceTest {
    @Autowired
    RibbonLoadBalancerClient client;

    @Test
    public void test() {
        for (int i = 0; i < 100; i++) {
            ServiceInstance instance = this.client.choose("user-service");
            System.out.println(instance.getHost() + ":" + instance.getPort());
        }
    }
}
