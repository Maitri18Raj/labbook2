package com.capg.service;

import java.util.List;

import com.capg.entities.Product;

public interface IProductService
{
	Product findProductById(int id);

	Product save(Product product);
	
	List<Product> showAllProducts();
	
	boolean remove(int id);
}
