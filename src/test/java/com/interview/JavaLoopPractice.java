package com.interview;

public class JavaLoopPractice {
	
	// 0 to 100
	
	//reverse "DAD"
	String name = "DAD"; // global (instance)
	String reverse_name = "";
	
	public void getValue() {
		
		for(int i=0; i<=100; i++) {
			System.out.println(i);
			System.out.println();
		}
		
		String country = "Canada";
		for(int i=0; i<country.length(); i++) {
			System.out.println("Every letter = " + country.charAt(i));
		}
	}
	
	public void getPalindrome() {
		System.out.println("Before reverse = " + name);
		for(int i=name.length()-1; i>=0; i--) {
			reverse_name = reverse_name + name.charAt(i);
		}
		
		System.out.println("After reverse = " + reverse_name);
		if(name.equals(reverse_name)) {
			System.out.println("DAD is a palindromeeeeee!!!");
		}
		
		else {
			System.out.println("DAD is not a palindromeeeeee!!!");
		}
	}
	
	public void getNegcountryValue() {
		
		String country = "Canada";
		for(int i=country.length()-1; i>=0; i--) { //length method reads as 7, string index reads 6
			System.out.println("Every letter = " + country.charAt(i));
		}
	}
	
	public void getValue22() {
		
		for(int i=1; i<=22; i++) {
			System.out.println(i);
		}
	}
	
	public void getNegValue() {
		
		for(int i=100; i>=0; i--) {
			System.out.println(i);
			System.out.println();
		}
	}
	
	public void getNegValue10() {
		
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		JavaLoopPractice obj = new JavaLoopPractice();
		obj.getPalindrome(); //static = Y/N -> N
		System.out.println();
		
	}

}
