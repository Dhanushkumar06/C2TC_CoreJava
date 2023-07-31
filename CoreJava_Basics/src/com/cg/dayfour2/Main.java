package com.cg.dayfour2;

import com.cg.dayfour1.*;

public class Main {

	public static void main(String[] args) {
		 Access obj=new Access();  
		 System.out.println(obj.data);//Compile Time Error  
		 obj.msg1();
		 obj.msg2();
		 obj.msg3();
	}

}
