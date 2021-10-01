package com.company.technicalassessment.domain;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "carton_units")
    private int cartonUnits;

    @Column(name = "carton_price")
    private BigDecimal cartonPrice;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;
}
