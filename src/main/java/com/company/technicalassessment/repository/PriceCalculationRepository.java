package com.company.technicalassessment.repository;

import com.company.technicalassessment.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceCalculationRepository extends JpaRepository<Product, Long> {
}
