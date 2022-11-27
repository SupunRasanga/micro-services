package com.demo.priceservice.services;

import com.demo.priceservice.dto.PriceDTO;
import com.demo.priceservice.model.Price;
import com.demo.priceservice.repository.PriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    private PriceRepo priceRepo;

    public Price createPrice(PriceDTO priceDTO) {
        Price price = new Price();
        price.setPrice(priceDTO.getPrice());
        price.setProductCode(priceDTO.getProductCode());

        return priceRepo.save(price);
    }

    public List<Price> getAllPrices(){
        List<Price> prices = priceRepo.findAll();

        return prices;
    }
}
