package com.flamexander.cloud.client.controllers;

import com.flamexander.cloud.common.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {
    @RequestMapping("/products")
    List<ProductDto> greeting();

    @PostMapping("/add_for_repo")
    String saveOrUpdate(@RequestBody ProductDto productDto);

    @GetMapping("/delete_for_repo/{id}")
    void deleteById(@PathVariable Long id);
}