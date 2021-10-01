package com.company.technicalassessment.controller;

import com.company.technicalassessment.domain.Products;
import com.company.technicalassessment.service.PriceCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PriceCalculationController {

    @Autowired
    PriceCalculationService priceCalculationService;

    public List<Products> getAllPrices() {
        return priceCalculationService.findAllPrices();
    }
}
