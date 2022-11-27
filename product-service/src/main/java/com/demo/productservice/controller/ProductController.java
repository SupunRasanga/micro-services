package com.demo.productservice.controller;

import com.demo.productservice.dto.ProductDTO;
import com.demo.productservice.model.Product;
import com.demo.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody ProductDTO productDTO) {
        Product product = productService.createProduct(productDTO);
        return product;
    }

    @GetMapping("getAll")
    public List<Product> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return products;
    }
}
