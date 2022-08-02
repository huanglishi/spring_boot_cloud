package com.yunshi.order.intercptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomFeignInterceptor implements RequestInterceptor {
    Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("tonks","t1234");
        requestTemplate.query("id","123");
        requestTemplate.uri("/9");
        logger.info("Feign拦截器");
    }
}
