package com.capg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.entities.Product;

@Repository
public class ProductDaoImpl implements IProductDao 
{
	private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    
    @PersistenceContext //this is equal to autowired
    public void setEntityManager(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
    
    
	@Override
	public Product findProductById(int id)
	{
		Product product=entityManager.find(Product.class, id);
		return product;
	}
	
	@Override
	public Product save(Product product) 
	{
		product=getEntityManager().merge(product);
		return product;
	}
	
	@Override
	public List<Product> showAllProducts()
	{
		String jql="from Product";
		TypedQuery<Product> query=entityManager.createQuery(jql, Product.class);
		List<Product> list=query.getResultList();
		return list;
	}
	
	@Override
	public boolean remove(int id) {
		Product product=findProductById(id);
		entityManager.remove(product);
		return true;
	}

}
