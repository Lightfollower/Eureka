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

    @Override
    @PostMapping("/add_for_repo")
    public String saveOrUpdate(ProductDto productDto) {
        productService.saveOrUpdate(productDto);
        return "rest ololo";
    }

    @Override
    @GetMapping("/delete_for_repo/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.deleteById(id);
    }
}