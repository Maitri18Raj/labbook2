package com.mycompany.app;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;


@Component
public class Employee 
{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	//private String unit;
	private int age;
	
	public int getEmployeeId() 
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() 
	{
		return employeeName;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	/*public String getUnit() 
	{
		return unit;
	}
	
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	*/
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
}


