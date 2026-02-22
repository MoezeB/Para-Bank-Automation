package com.interview;

import java.util.Arrays;

public class JavaArrayPractice {

	//10,20
	
	 //int a = 10;
	int [] a = {10};
	
	//USA, UK
	
	static String [] array = {"USA","UK"};
	
	public static void getArray2 () {
//		int [] array2 = {2,3,4,5,6,7,8,9};
//		int maxValue = array2[0]; //array 1st value
//		for (int i=0; i<array2.length;i++) {
//			System.out.println(array2[i]);
//			
//		if (array2[i] > maxValue) {//condition = each>maxValue =True
//			maxValue = array2[i]; //update max value
//		}
//	
//		
//		}// loop end 
//		
//			System.out.println("Max value = " + maxValue);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(array)); //initial error, declare object
								   // for non-static methods/variables
		//1st value
		System.out.println(); 
		System.out.println(array[0]);
		//last value
		System.out.println(array[array.length-1]);
		//array loop
		for (int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		int [] array2 = {2,3,4,5,6,7,8,9};
		int maxValue = array2[0]; //array 1st value
		for (int i=0; i<array2.length;i++) {
			System.out.println(array2[i]);
			
		if (array2[i] > maxValue) {//condition = each>maxValue =True
			maxValue = array2[i]; //update max value
		}
	
		
		}// loop end 
		
			System.out.println("Max value = " + maxValue);
	}
	
}
