package com.company.technicalassessment.repository;

import com.company.technicalassessment.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PriceCalculationRepository extends JpaRepository<Products, Integer> {
}
