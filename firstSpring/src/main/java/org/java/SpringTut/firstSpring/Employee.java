package org.java.SpringTut.firstSpring;

import java.util.*;

public class Employee {
	int id;
	String name;
	List<Companies> Companies;
	
	
	Employee ()
	{
		System.out.println("Conssturctor invoked");
	}
	Employee(int id ,String name ,List<Companies> Companies)
	{
		super();
		this.id=id;
		this.name=name;
		this.Companies= Companies;
	}
	
	void Display()
	{
		System.out.println(id+" "+ name);
Iterator<Companies> itr= Companies.iterator();
while(itr.hasNext()){  
    System.out.println(itr.next());  
}  
	}


}
