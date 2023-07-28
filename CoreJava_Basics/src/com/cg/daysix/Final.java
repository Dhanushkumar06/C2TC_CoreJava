package com.cg.daysix;

public class Final {
	final int Id = 101;
    final String Clg = "IFET";
    
	void Display() {
    	System.out.println(Id+" " + Clg + " ");
    }
	public static void main(String[] args) {
		 Final fv = new Final();
         fv.Display();
	}

}