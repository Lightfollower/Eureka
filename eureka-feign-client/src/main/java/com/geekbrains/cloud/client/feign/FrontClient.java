package com.geekbrains.cloud.client.feign;

import com.geekbrains.cloud.common.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("eureka-client")
public interface FrontClient {
    @RequestMapping("/productsREST")
    List<ProductDto> getProductsREST();

    @PostMapping("/add_for_repo")
    String saveOrUpdate(ProductDto product);

    @GetMapping("/delete_for_repo/{id}")
    void deleteById(@PathVariable Long id);
}