package com.atguigu.myrole;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 定义一个新的负载规则
 */
@Configuration
public class MySelfRole {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
