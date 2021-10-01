package com.company.technicalassessment.controller;

import com.company.technicalassessment.domain.Product;
import com.company.technicalassessment.dto.ProductDto;
import com.company.technicalassessment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("product")
    public @ResponseBody
    ResponseEntity<Product> addProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.status(HttpStatus.OK).body(this.productService.addProduct(productDto));
    }

    @GetMapping("products")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(this.productService.getProducts());
    }

}
