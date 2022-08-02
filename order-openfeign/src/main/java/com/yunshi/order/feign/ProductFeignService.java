package com.yunshi.order.feign;

import com.yunshi.order.config.FeignConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service",path = "/product")
public interface ProductFeignService {

    @RequestLine("GET /{id}")
    public String get(@Param("id") Integer id);
}
