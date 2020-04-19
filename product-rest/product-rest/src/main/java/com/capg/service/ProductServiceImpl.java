package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IProductDao;
import com.capg.entities.Product;
@Service
public class ProductServiceImpl implements IProductService{
	
	
	private IProductDao productDao;
	

	public IProductDao getProductDao() 
	{
		return productDao;
	}
	
	@Autowired
	public void setProductDao(IProductDao productDao) 
	{
		this.productDao = productDao;
	}

	@Override
	public Product findProductById(int id)
	{
		return productDao.findProductById(id);
	}

	@Override
	public Product save(Product product)
	{
		return productDao.save(product);
	}

	@Override
	public List<Product> showAllProducts() 
	{
		return productDao.showAllProducts();
	}

	@Override
	public boolean remove(int id)
	{
		return productDao.remove(id);
	}

}