package com.geekbrains.cloud.client.services;

import com.geekbrains.cloud.client.entities.Product;
import com.geekbrains.cloud.client.repositories.ProductRepository;
import com.geekbrains.cloud.common.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductsRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    public Product saveOrUpdate(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getTitle(), productDto.getPrice());
        return productRepository.save(product);
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product p :
                products) {
            productDtos.add(new ProductDto(p.getId(), p.getTitle(), p.getPrice()));
        }
        return productDtos;
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void deleteAll() {
        productRepository.deleteAll();
    }
}
