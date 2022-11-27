package com.demo.productservice.service;

import com.demo.productservice.dto.ProductDTO;
import com.demo.productservice.model.Product;
import com.demo.productservice.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product createProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setProductCode(productDTO.getProductCode());
        product.setProductName(productDTO.getProductName());

        return productRepo.save(product);
    }

    public List<Product> getAllProducts(){
        List<Product> product = productRepo.findAll();

        return product;
    }
}
