package com.sbsecuritydb.service;

import java.util.List;

import com.sbsecuritydb.model.Product;

//ctrl+shift+O---order all the packages import
public interface ProductService {
	public abstract List<Product> listAll();

	public abstract Product save(Product product);

	public abstract Product get(Long id);

	public abstract Long delete(Long id);
}
