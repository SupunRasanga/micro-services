package com.demo.priceservice.controller;

import com.demo.priceservice.dto.PriceDTO;
import com.demo.priceservice.model.Price;
import com.demo.priceservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping("/create")
    public Price createProduct(@RequestBody PriceDTO priceDTO) {
        Price price = priceService.createPrice(priceDTO);
        return price;
    }

    @GetMapping("getAll")
    public List<Price> getAllProducts(){
        List<Price> prices = priceService.getAllPrices();
        return prices;
    }
}
