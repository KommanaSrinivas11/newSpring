package org.java.SpringTut.firstSpring;

public class demoB {

	demoA a;
	
	public demoA geta()
	{
		return a;
	}
	public void seta(demoA a)
	
	{
	this.a=a;	
	}
	public void displayy()
	{
		a.display();
	}
	
}
