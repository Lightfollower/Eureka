package com.flamexander.cloud.client.controllers;

import com.flamexander.cloud.client.services.ProductService;
import com.flamexander.cloud.common.dto.ProductDto;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

//    @Value("${userValue}")
//    private String username;

    @Override
    @RequestMapping("/products")
    public List<ProductDto> greeting() {
        return productService.findAll();
    }

//    @GetMapping("/parametrized/{id}")
//    public String parametrized(@PathVariable(value = "id") String id) {
//        return "echo: " + id;
//    }
}
