package com.company.technicalassessment.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Data
public class OrderDto {

    @NotBlank(message = "Product id is mandatory")
    private Long productId;

    @NotBlank(message = "Number of units mandatory")
    private int units;

    private BigDecimal price;

}
