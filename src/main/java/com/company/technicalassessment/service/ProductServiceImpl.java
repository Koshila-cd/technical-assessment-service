package com.company.technicalassessment.service;

import com.company.technicalassessment.domain.Product;
import com.company.technicalassessment.dto.ProductDto;
import com.company.technicalassessment.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Product addProduct(ProductDto productDto) {

        log.info("adding new product : {}", productDto.getProductName());

        return productRepository.save(Product.builder()
                .productName(productDto.getProductName())
                .cartonPrice(productDto.getCartonPrice())
                .cartonUnits(productDto.getCartonUnits())
                .unitPrice(productDto.getCartonPrice().divide(BigDecimal.valueOf(productDto.getCartonUnits())))
                .build());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getProducts() {

        log.info("retrieve all products : {}");

        return productRepository.findAll();
    }
}
