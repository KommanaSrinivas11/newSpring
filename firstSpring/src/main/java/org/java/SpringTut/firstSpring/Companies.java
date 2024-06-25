package org.java.SpringTut.firstSpring;

public class Companies {
	 int year;
	 String name;
	 
	 Companies()
	 {
		 
	 }
	 Companies(int year, String name)
	 {
		 this.year=year;
		 this.name=name;
	 }
	 public String toString()
	 {
		 return year+" "+name;
	 }
	 

}
