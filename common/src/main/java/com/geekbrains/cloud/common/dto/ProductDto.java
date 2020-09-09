package com.geekbrains.cloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProductDto {
    Long Id;
    String title;
    BigDecimal price;
}
