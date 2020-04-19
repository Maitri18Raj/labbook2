package com.capg.app.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.capg.app.entities.Employee;

@Component
public class EmployeeDaoImpl implements IEmployeeDao{

	private Map<Integer,Employee>store=new HashMap<>();
	
	 public EmployeeDaoImpl()
	 {      
		     //add elements to map
	        store.put(100,new Employee(100,"Rama",12345.67));
	       
	    }
	 
	 @Override
	 public Employee fetchById(int id) {
		 Employee employee = null;
		 if(store.containsKey(id)) 
		 {
			  employee=store.get(id);
		 }
		 return employee;
	 }
	 


}
