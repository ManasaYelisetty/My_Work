package com.sbsecuritydb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbsecuritydb.model.Product;
import com.sbsecuritydb.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public List<Product> listAll() {
		
		return  productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product get(Long id) {
		
		return productRepository.getById(id);
	}

	@Override
	public Long delete(Long id) {
		
		 productRepository.deleteById(id);
		 return id;
	}

}
