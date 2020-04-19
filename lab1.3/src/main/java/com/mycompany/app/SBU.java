package com.mycompany.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value("${sbucode}")
	private String sbuCode;
	
	@Value("${sbuName}")
	private String sbuName;
	
	@Value("${sbuHead}")
	private String sbuHead;
	
	private List<Employee> empList;
	
	public List<Employee> getEmpList()
	{
		return empList;
	}
	
	@Autowired
	public void setEmpList(List<Employee> empList) 
	{
		this.empList=empList;
	}
	
	public String getSbuCode() 
	{
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) 
	{
		this.sbuCode = sbuCode;
	}
	
	public String getSbuName()
	{
		return sbuName;
	}
	public void setSbuName(String sbuName)
	{
		this.sbuName = sbuName;
	}
	
	public String getSbuHead() 
	{
		return sbuHead;
	}
	public void setSbuHead(String sbuHead)
	{
		this.sbuHead = sbuHead;
	}
	
	public SBU() 
	{
		
	}
	
	public void display() 
	{
		System.out.println("sbuCode = "+sbuCode+","+" "+"sbuHead = "+sbuHead+","+" "+"sbuName = "+sbuName);
	}

	
	
}