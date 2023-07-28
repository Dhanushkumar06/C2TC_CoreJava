package com.cg.daysix;

public class StaticVar {
	static String Name;
    static String Clg = "IFET";
    
    static {
	   Name = "Dhanush";
   }
	void Display() {
    	System.out.println(Name + " " + Clg);
    }
}
