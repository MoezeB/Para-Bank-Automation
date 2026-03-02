package com.interview;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionsPractice {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("USA");
		myList.add("UK");
		myList.add("CAN");
		
		System.out.println(myList);
		//print list
		System.out.println(myList.get(0));
		//1st value printed
		System.out.println(myList.get(myList.size()-1));
				
	}
	
}
