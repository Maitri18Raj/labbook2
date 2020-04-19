package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@ComponentScan("com.mycompany.app")
@PropertySource("classpath:values.properties")

public class JavaConfig 
{
  
	@Bean
	public SBU employee() 
	{
		Employee employee1=new Employee();
		employee1.setEmployeeId(12345);
		employee1.setAge(30);
		employee1.setEmployeeName("Harriet");
		employee1.setSalary(40000);
		
		Employee employee2=new Employee();
		employee2.setEmployeeId(12346);
		employee2.setAge(40);
		employee2.setEmployeeName("Rama");
		employee2.setSalary(60000);
		
		List<Employee> empList=new ArrayList<>();
		empList.add(employee1);
		empList.add(employee2);
		
		SBU employee=new SBU();
		employee.setEmpList(empList);
		return employee;
	}
	
}