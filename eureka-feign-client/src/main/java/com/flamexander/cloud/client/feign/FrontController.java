package com.flamexander.cloud.client.feign;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flamexander.cloud.common.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontController {
    private FrontClient frontClient;

    @Autowired
    public void setGreetingClient(FrontClient frontClient) {
        this.frontClient = frontClient;
    }

//    @ResponseBody
    @RequestMapping("/get-greeting")
    public String greeting(Model model) throws IOException {
        String product = frontClient.greeting();
//        product = "{\"id\":1, \"title\":\"ololo\", \"price\":200}";
        ObjectMapper mapper = new ObjectMapper();
        List<ProductDto> products = mapper.readValue(product, ArrayList.class);
//        ProductDto product1 = mapper.readValue(product, ProductDto.class);
        System.out.println(products);
//        System.out.println(product);
//        System.out.println(product1.getTitle().getClass());
//        String answer = greetingClient.greeting();
//         answer = greetingClient.parametrized("ololo");
//        model.addAttribute("greeting", answer);
//        List<Product> products;

//        products = productService.findAll();
        model.addAttribute("products", products);
        return "all_products";
//        Product product = new Product(1L, "Хуй", new BigDecimal(100590));
//        return product;
    }
}
