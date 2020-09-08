package com.flamexander.cloud.client.controllers;

import com.flamexander.cloud.common.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ProductController {
    @RequestMapping("/products")
    List<ProductDto> greeting();

//    @GetMapping("/parametrized/{id}")
//    String parametrized(@PathVariable(value = "id") String id);
}
