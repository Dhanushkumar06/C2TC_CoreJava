package com.cg.daytwo;

public class MethodClasses {
	    int a;  
	
	MethodClasses(){
		a= 10;
	   }
    }
	class SubClass extends MethodClasses{
		int b;
		
	SubClass(){
		b=10;
		}
	}
	class ChildClass extends SubClass{
		int c;
		
		ChildClass(){
		c=10;
		}
	}
	
	