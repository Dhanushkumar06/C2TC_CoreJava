package com.cg.dayfive;

public class Multiple {
	void one(){
		System.out.println("parent1 method");
	}
	}
	class Inheri1 extends Multiple{  
	void two(){
		System.out.println("parent2 method");
		}  
	} 
	class Inheri2 extends Inheri1{  
		void three(){
			System.out.println("child method");
			}  
		} 
	
	class test1{
	public static void main(String[] args) {
		Inheri2 Lh = new Inheri2();
		Lh.one();
		Lh.two();
		Lh.three();

	}

}
