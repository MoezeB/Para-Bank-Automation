package com.interview;

public class JavaVariablePractice {

	//price = 10
	int price =10; //G+Ins
	static int price_2 = 11; // global + static
	
	public void getValue(int price3) {//local
		int price4 = 12; //local
		System.out.println(price3);
		
	}
	
	public static void getValue2() {//method + variable static
		System.out.println(price_2);
	}
	
}
