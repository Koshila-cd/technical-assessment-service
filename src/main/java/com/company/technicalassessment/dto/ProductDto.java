package com.company.technicalassessment.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {

    private Long id;
    private String productName;
    private int cartonUnits;
    private BigDecimal cartonPrice;
    private BigDecimal unitPrice;
}
