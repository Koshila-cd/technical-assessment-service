package com.company.technicalassessment.service;

import com.company.technicalassessment.domain.Product;
import com.company.technicalassessment.repository.PriceCalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculationService {

    @Autowired
    PriceCalculationRepository priceCalculationRepository;

}
