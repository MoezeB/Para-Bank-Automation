package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollectionsPractice2 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("USA");
		myList.add("USA");
		myList.add(null);
		myList.add(null);
		System.out.println("My List = " + myList);
		System.out.println("List Total Count = " + myList.size());
		
		Set<String> mySet = new HashSet<>();
		mySet.add("USA");
		mySet.add(null);
		System.out.println("No Duplicates, Set: " + mySet);;
		System.out.println("Set Total Count = " + mySet.size());
		
		Map<String,String> myMap = new HashMap<>(); //internally set -> key duplicates not allowed.
		myMap.put("Name","Moeze");
		myMap.put("City","Bayonne");
		myMap.put("State","New Jersey");
		System.out.println("Map Total Count = " + myMap.size());
	}
	
}
