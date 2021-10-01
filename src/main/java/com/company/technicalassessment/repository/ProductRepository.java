package com.company.technicalassessment.repository;

import com.company.technicalassessment.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
