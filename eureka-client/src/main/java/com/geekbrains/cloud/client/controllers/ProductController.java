package com.geekbrains.cloud.client.controllers;

import com.geekbrains.cloud.common.dto.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {
    @RequestMapping("/productsREST")
    List<ProductDto> getProductsREST();

    @PostMapping("/add_for_repo")
    String saveOrUpdate(@RequestBody ProductDto productDto);

    @GetMapping("/delete_for_repo/{id}")
    void deleteById(@PathVariable Long id);
}