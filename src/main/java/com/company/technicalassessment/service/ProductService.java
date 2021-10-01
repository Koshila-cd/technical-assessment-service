/*
 *   Copyright © 2021 Koshila Dissanayake,
 *   All Rights Reserved.
 */

package com.company.technicalassessment.service;

import com.company.technicalassessment.domain.*;
import com.company.technicalassessment.dto.ProductDto;

import java.util.List;

public interface ProductService {


    /**
     * Add one product
     *
     * @param productDto a new Movie to be added from {@link Product}
     * @return Products
     */
    public Product addProduct(ProductDto productDto);

    /**
     * Retrieve all products
     *
     * @return List<Product>
     */
    public List<Product> getProducts();
}
