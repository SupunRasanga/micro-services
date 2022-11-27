package com.demo.priceservice.repository;

import com.demo.priceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository <Price, Long> {
}
