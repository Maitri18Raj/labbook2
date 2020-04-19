package com.capg.app;

import com.capg.app.config.JavaConfig;
import com.capg.app.entities.Employee;
import com.capg.app.service.IEmployeeService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;

public class EmployeeMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);//System.in is a standard i/p stream
		//Scanner class is used to get user i/p and is found in java.util package
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		

        //registering configuration class 
		 Class configurationClass= JavaConfig.class;
	     context.register(configurationClass);
	     context.refresh();
	   //context.refresh->container scans the bean class, get object and then inject dependency

	   
	     IEmployeeService service = context.getBean(IEmployeeService.class);
	   //fetching bean by type
	     
	     System.out.println("Input:");

	     System.out.println("Employee ID :");
	     int id = sc.nextInt();
	     //Read user i/p
	     
	     Employee employee = service.fetchById(id);
	    	     
	     System.out.println("Output:");
	     
	     System.out.println("Employee Info :");
	     System.out.println("Employee ID :"+employee.getId());
	     System.out.println("Employee Name :"+employee.getName());
	     System.out.println("Employee Salary :"+employee.getSalary());
	        
	        
	}
}