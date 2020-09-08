package com.flamexander.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface FrontClient {
    @RequestMapping("/products")
    String greeting();

//    @GetMapping("/parametrized/{id}")
//    String parametrized(@PathVariable(value = "id") String id);
}
