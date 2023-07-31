package com.cg.daytwo;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {      //cut 4
			    break;
			  }
			  System.out.println("Break :"+ i);
			}
		for (int j = 0; j < 10; j++) {
			  if (j == 4) {      //4only leaved
			    continue;
			  }
			  System.out.println("Continue :"+ j);
			}
	}

}
