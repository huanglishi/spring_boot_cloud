package com.yunshi.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRuleConfig {
   @Bean
    public IRule iRule(){
       return new RandomRule();//随机的负载均衡策略
   }
}
