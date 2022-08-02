package com.yunshi.order.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置：当使用@Configuration 会将配置作用所有的服务
 * 局部配置：如果只想针对某一服务进行配置，就不要加@Configuration
 *
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level  feignLoggerLevel(){
        return Logger.Level.FULL;
    }

//    @Bean
//    public Request.Options options(){
//        return new Request.Options(5000,10000);
//    }
}
