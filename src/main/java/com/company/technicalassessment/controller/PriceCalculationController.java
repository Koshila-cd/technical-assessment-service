package com.company.technicalassessment.controller;

import com.company.technicalassessment.domain.Product;
import com.company.technicalassessment.service.PriceCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api")
public class PriceCalculationController {

    @Autowired
    PriceCalculationService priceCalculationService;
}
