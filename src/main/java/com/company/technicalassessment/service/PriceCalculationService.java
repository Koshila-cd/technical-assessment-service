package com.company.technicalassessment.service;

import com.company.technicalassessment.domain.Product;
import com.company.technicalassessment.dto.OrderDto;
import com.company.technicalassessment.repository.PriceCalculationRepository;
import com.company.technicalassessment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PriceCalculationService {

    @Autowired
    PriceCalculationRepository priceCalculationRepository;

    @Autowired
    private ProductRepository productRepository;

    /**
     *
     * @param orderDto
     * @return
     */
    public OrderDto findOrderPrice(OrderDto orderDto) {

        Optional<Product> productOptional = productRepository.findById(orderDto.getProductId());

        if (productOptional.isPresent()) {

            Product product = productOptional.get();

            int numberOfCartons = orderDto.getUnits() / product.getUnitsPerCarton();

            int overUnits = orderDto.getUnits() % product.getUnitsPerCarton();

            BigDecimal unitPrice = product.getCartonPrice().divide(BigDecimal.valueOf(product.getUnitsPerCarton())).multiply(BigDecimal.valueOf(130).divide(BigDecimal.valueOf(100)));
//            unitPrice = unitPrice
//                    .add(unitPrice.multiply(BigDecimal.valueOf(30)).divide(BigDecimal.valueOf(100)));

            BigDecimal purchaseSingleUnitsPrice = unitPrice.multiply(BigDecimal.valueOf(overUnits));

            BigDecimal purchaseCartonsPrice = product.getCartonPrice()
                    .multiply(BigDecimal.valueOf(numberOfCartons));

            if (numberOfCartons >= 3) {
                purchaseCartonsPrice = purchaseCartonsPrice.add(
                        purchaseCartonsPrice.multiply(BigDecimal.valueOf(10)).divide(
                                BigDecimal.valueOf(100)));
            }

            orderDto.setPrice(purchaseSingleUnitsPrice.add(purchaseCartonsPrice));
        }

        return orderDto;
    }

}
