package com.company.technicalassessment.controller;

import com.company.technicalassessment.domain.Product;
import com.company.technicalassessment.dto.OrderDto;
import com.company.technicalassessment.service.PriceCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api")
@CrossOrigin
public class PriceCalculationController {

    @Autowired
    PriceCalculationService priceCalculationService;

    @PostMapping("findOrderPrice")
    public OrderDto findOrderPrice(@RequestBody OrderDto orderDto) {
        return priceCalculationService.findOrderPrice(orderDto);
    }
}
