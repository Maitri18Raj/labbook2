
package com.mycompany.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SBUMain {
	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	  //registering configuration class in which configurations are kept
	 Class configurationClass=JavaConfig.class;
     context.register(configurationClass);
     context.refresh();
     //context.refresh->container scans the bean class, get object and then inject dependency
     

     SBU sbu = context.getBean(SBU.class);
     //fetching bean by type
     System.out.println("SBU Details");
     System.out.println("-------------------------------");
     sbu.display();
	
	List<Employee> empList=sbu.getEmpList();
	for(Employee employee :empList) 
	{
		System.out.println("Employee Details:---------");
		System.out.println("["+"Employee"+" "+"["+"empAge = "+employee.getAge()+","+" "+"empId = "+employee.getEmployeeId()+","+" "+"empName = "+employee.getEmployeeName()+","+" "+"empSalary"+employee.getSalary());
	}
	
  
	}
}