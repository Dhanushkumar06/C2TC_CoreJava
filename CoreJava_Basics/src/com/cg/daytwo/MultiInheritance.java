package com.cg.daytwo;

public class MultiInheritance {

	public static void main(String[] args) {
		MethodClasses mc= new MethodClasses();
		SubClass sc= new SubClass();
		ChildClass cc= new ChildClass();
		
        System.out.println(mc.a);
        System.out.println(sc.b);
        System.out.println(cc.c);
	}

}
