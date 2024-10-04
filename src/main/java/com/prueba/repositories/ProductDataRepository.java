package com.prueba.repositories;

import com.prueba.entities.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDataRepository extends JpaRepository<ProductData, Long> {
}
