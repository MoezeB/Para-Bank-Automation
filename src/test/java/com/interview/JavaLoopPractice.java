package com.interview;

public class JavaLoopPractice {
	
	// 0 to 100
	// end position
		//String end = name.length()
		//Array end = name.length()
		//Whenever a String no --> =
		//System.out.println(obj.charAt(i));
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
			
			//Nested loop, change int
			//for(int j=0; j<=100; j++) {
			//System.out.println(i);
		//}
		}
	}
	
	public void getStarValue(int num) {
		for(int i=1;i<=num; i++) {// number of rows ln
			for(int j=1;j<=i; j++) {// number of $ according to each row
				System.out.print("$");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//to call other method(s) or variable(s) => runs code
		JavaLoopPractice obj = new JavaLoopPractice();
		obj.getStarValue(4);; //static = Y/N -> N
		System.out.println();
		
	}

}
