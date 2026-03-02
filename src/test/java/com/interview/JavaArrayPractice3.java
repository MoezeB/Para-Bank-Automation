package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaArrayPractice3 {

	public static void main(String[] args) {
		
		Integer[] myArray = {2,3,2,3,4};
		//remove duplicates by using set
		//convert array into list => first change data type to non-primitive
								//=> Arrays.asList(myArray);
		//In order to preserve order => LinkedHashSet
		
		Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray)); //only allows other Java collections (JCF)
		System.out.println(mySet);	
		
		String[] myArray2 = {"USA","UK","USA","UK"};
		System.out.println(Arrays.toString(myArray2));
		// remove duplicates & preserve insertion order by using Set
		Set<String> mySet2 =new LinkedHashSet<>(Arrays.asList(myArray2));
		
		System.out.println("No dupes = " + mySet2);
	}
	
}
