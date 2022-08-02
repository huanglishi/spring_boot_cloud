package com.yunshi.order;

//import com.yunshi.ribbon.RibbonRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@RibbonClients(value = {
//        @RibbonClient(name = "stock-service",configuration = RibbonRuleConfig.class)
//})

public class OrderApplication {
   public static void main(String[] args){
       SpringApplication.run(OrderApplication.class,args);
   }

   @Bean
   @LoadBalanced //负载均衡器
    public RestTemplate restTemplate(RestTemplateBuilder builder){
      RestTemplate restTemplate= builder.build();
      return restTemplate;
   }
}
