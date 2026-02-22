package com.interview;

import java.util.Arrays; 

public class PracticeArrays {

	public void getValue(String [][] array, String []user, String []password) {
		
		//System.out.println("All Credentials: " + Arrays.toString(array));
		//System.out.println("Only username: " + array[0]);
		//System.out.println("Only password: " + array[1]);
		System.out.println("1st username: " + array[0][0]);
		System.out.println("1st password: " + array[0][1]);
		System.out.println("2nd username: " + array[1][0]);
		System.out.println("2nd password: " + array[1][1]);
		
		System.out.println();
		
		System.out.println("Correct username: " + user[0]);
		System.out.println("Correct password: " + password[0]);
		
	}
	
	public static void main(String[] args) {//two set credentials
	String [][] array = {{"student", "qa1234"}, {"stude", "qa1233"}};
	String [] user = {"student", "stude"};
	String [] password = {"qa1234","qa1233"};
	
	PracticeArrays obj = new PracticeArrays();
	obj.getValue(array,user,password);
		
	}
	
}
