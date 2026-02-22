package com.interview;

import java.util.Arrays;

public class TestRun {

	public static void main(String[] args) {
		int[] myArray = { 2,3,4,5,6,7 }; //1 (Declare)
		Arrays.sort(myArray); //ASCending order 2
		int maxValue = myArray[0]; //before loop
		int secondMaxValue = myArray[0]; //before loop
		int thirdMaxValue = myArray[0]; //before loop
		
		for(int i=0; i<myArray.length;i++) {//start loop 3
			System.out.println("Each number = " + myArray[i]);
			if(myArray[i]>maxValue) { //condition 4
				thirdMaxValue = secondMaxValue;
				secondMaxValue = maxValue;
				maxValue = myArray[i];
			}
			
		} //loop end
		System.out.println();
		System.out.println();
		System.out.println("Max value = " + maxValue);
		System.out.println("2nd Max Value = " + secondMaxValue);
		System.out.println("3rd Max Value = " + thirdMaxValue);
		System.out.println();
		
		
		
		

		
		
		//static = Y
		System.out.println();
		JavaVariablePractice.getValue2();
		System.out.println(JavaVariablePractice.price_2);
		
		//static = N
		JavaVariablePractice obj = new JavaVariablePractice();
		obj.getValue(13);
	}
}
