package com.flamexander.cloud.client.feign;

import com.flamexander.cloud.common.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("eureka-client")
public interface FrontClient {
    @RequestMapping("/products")
    List<ProductDto> greeting();

    @PostMapping("/add_for_repo")
    String saveOrUpdate(ProductDto product);

    @GetMapping("/delete_for_repo/{id}")
    void deleteById(@PathVariable Long id);
}