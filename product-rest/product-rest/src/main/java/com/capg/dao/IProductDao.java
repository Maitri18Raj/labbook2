package com.capg.dao;


import java.util.List;

import com.capg.entities.Product;

public interface IProductDao 
{
	Product findProductById(int id);

	Product save(Product product);
	
	List<Product> showAllProducts();
	
	boolean remove(int id);
	

}