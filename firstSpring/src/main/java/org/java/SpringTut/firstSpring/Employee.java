package org.java.SpringTut.firstSpring;

import java.util.*;

public class Employee {
	private int id;
	private String name;
	private int salary;
	Employee(int id,String name,int salary)
	
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
public int getId()
{
	return id;
	
}  

public int getSalary()
{
	return salary;
	
} 
public String getName()
{
	return name;
	
}
public void setId(int id)
{
	this.id=id;

	}
public void setName(String name)
{
	this.name=name;

	}
public void setSalary(int salary)
{
	this.salary=salary;

	}

}
