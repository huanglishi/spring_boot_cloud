package com.yunshi.order.controller;

import com.yunshi.order.feign.ProductFeignService;
import com.yunshi.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;

    @Autowired
    ProductFeignService productFeignService;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String msg  = stockFeignService.reduct();

        String pstr = productFeignService.get(1);
        return  "你好feign:"+msg+",商品："+pstr;
    }
}
