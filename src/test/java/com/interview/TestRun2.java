package com.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun2 {
	
	WebDriver driver = new ChromeDriver();
	// driver comes from ChromeDriver()
	// List obj = new List(); //Not possible list is an interface 
	
	public void getListPractice() {
	//USA, UK --> Data type --> String
	List <String> myArrayList = new ArrayList<>();
	
	//add value = add()
	myArrayList.add("USA");
	myArrayList.add("UK");
	myArrayList.add("Canada");
	
	System.out.println("Whole List Values = " + myArrayList);
	System.out.println("1st List Values = " + myArrayList.get(0));
	System.out.println("Last List Values = " + myArrayList.get(myArrayList.size()-1));
	
	//List obj = new ArrayList();
	List obj1 = new LinkedList();
	List obj2 = new Vector();
	List obj3 = new Stack();
}

}