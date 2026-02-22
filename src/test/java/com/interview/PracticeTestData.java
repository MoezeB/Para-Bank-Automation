package com.interview;

import java.util.Arrays;

public class PracticeTestData {
	
	int[] array = {5,7,9};
	int f=5; //global instance variable
	static int b=6; //global static variable 
		
	//best option: local in method parameter
	public void getValue (int d){//(local) method parameter, pass value in main method {
		//int c=8; //local
		System.out.println(Arrays.toString(array));//Y
		System.out.println();
		//loop
		for(int i=0; i<=array.length-1; i++) {
			//whole array loop: System.out.println(Arrays.toString(array));
			System.out.println(array[i]); //each value
		}
		
		System.out.println();
		System.out.println(b);//Y
		System.out.println();
	}
	
	public static void getData(int [] c) {//static variables don't need object to be called
		
		System.out.println("First Array (c) Value: "+ c[0]);
		System.out.println();
		System.out.println(Arrays.toString(c));
		//need always a global static, but with parameters anything is usable
	}
	
	
	public static void main(String[] args) {
		
		int [] c = {44,77,99};
		
		PracticeTestData obj = new PracticeTestData();
		obj.getValue(5);
		PracticeTestData.getData(c); //(static method-calling)
	}
}
