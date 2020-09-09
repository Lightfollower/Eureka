package com.geekbrains.cloud.client.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

//@Getter
@Data
@NoArgsConstructor
public class Product {
    private Long id;

    private String title;

    private BigDecimal price;

    public Product(Long id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
