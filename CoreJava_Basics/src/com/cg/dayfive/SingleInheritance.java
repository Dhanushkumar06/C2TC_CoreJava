package com.cg.dayfive;

public class SingleInheritance {
	void one(){
		System.out.println("parent method");
	}
	}
	class Inheritance extends SingleInheritance{  
	void two(){
		System.out.println("Child method");
		}  
	} 
	
	class test{
	public static void main(String args[]){  
	Inheritance d=new Inheritance();  
	d.two();  
	d.one();
	}
}
