//package com.flamexander.cloud.client.controllers;
//
//import com.flamexander.cloud.client.entities.Product;
//import com.flamexander.cloud.client.services.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/products")
//public class ProductsController {
//    private ProductService productService;
//
//    @Autowired
//    public ProductsController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping("/products")
//    public String showAll(Model model) {
//            List<Product> products;
//
////            products = productService.findAll();
////            model.addAttribute("products", products);
//        return "all_products";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm() {
//        return "add_product_form";
//    }
//
//    @PostMapping("/add")
//    public String saveNewProduct(@ModelAttribute Product product) {
//        productService.saveOrUpdate(product);
//        return "redirect:/products/";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable Long id, Model model) {
//        model.addAttribute("product", productService.findById(id));
//        return "edit_product_form";
//    }
//
//    @PostMapping("/edit")
//    public String modifyProduct(@ModelAttribute Product product) {
//        productService.saveOrUpdate(product);
//        return "redirect:/products/";
//    }
//}