package com.flamexander.cloud.client.feign;

import com.flamexander.cloud.common.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;

@Controller
public class FrontController {
    private FrontClient frontClient;

    @Autowired
    public void setGreetingClient(FrontClient frontClient) {
        this.frontClient = frontClient;
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) throws IOException {
        List<ProductDto> productDtos = frontClient.greeting();
        model.addAttribute("products", productDtos);
        return "all_products";
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_product_form";
    }

    @PostMapping("/add")
    public String saveNewProduct(@ModelAttribute ProductDto product) {
        frontClient.saveOrUpdate(product);
        return "redirect:/get-greeting";
    }

    @GetMapping("delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        frontClient.deleteById(id);
        return "redirect:/get-greeting";
    }
}