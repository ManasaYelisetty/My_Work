package com.sbsecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbsecuritydb.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
