package com.interview;

import java.util.Arrays;

public class JavaArrayPractice2 {
	
	static int[] myArray = {7,2,8,5,3,6,9};
	//maxValue = 1) each value (loop) >>
	//2) filter/condition with if (each value>maxValue)
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(myArray)); //Array
		System.out.println(myArray[0]); //1st value
		System.out.println(myArray[myArray.length-1]); //last value
		System.out.println(myArray.length); //total # values count
		//How to find any specific value from array => arrayName[index]
		
		Arrays.sort(myArray);//ASC smallest -> biggest
		
		int maxValue = myArray[0]; //1st value is max
		int secondMax = myArray[0]; //1st value
		
		for(int i=0;i<myArray.length;i++) {
			//System.out.println(myArray[i]); => prints each value one-by-one
			//filter ==> condition if & else
			if(myArray[i]>maxValue) { // started with maxValue = 7; only true at 8>7 & finally true at 9>8
				secondMax = maxValue;
				maxValue = myArray[i];
			}
			
		}
		System.out.println();
		System.out.println("Second max value: " + secondMax);;
		System.out.println("Final max value: " + maxValue); 
		
	}
	

}
