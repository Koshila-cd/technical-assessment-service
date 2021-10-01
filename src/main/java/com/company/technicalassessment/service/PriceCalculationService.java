package com.company.technicalassessment.service;

import com.company.technicalassessment.domain.Products;
import com.company.technicalassessment.repository.PriceCalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PriceCalculationService {

    @Autowired
    PriceCalculationRepository priceCalculationRepository;

    public List<Products> findAllPrices() {
        return priceCalculationRepository.findAll();
    }
}
