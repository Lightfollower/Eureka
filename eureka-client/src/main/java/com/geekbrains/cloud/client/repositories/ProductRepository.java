package com.geekbrains.cloud.client.repositories;

import com.geekbrains.cloud.client.entities.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
        products.add(new Product(1L, "Banan", new BigDecimal(100500)));
        products.add(new Product(2L, "Kivi", new BigDecimal(30)));
    }

    public Product save(Product product) {
        product.setId(products.size() + 1L);
        products.add(product);
        return product;
    }

    public Product findById(Long id) {
        for (Product p :
                products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public List<Product> findAll() {
        return products;
    }

    public void deleteById(Long id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id)
                products.remove(i);
        }
    }

    public void deleteAll() {
        products.clear();
    }
}