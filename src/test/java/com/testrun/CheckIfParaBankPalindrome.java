package com.testrun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class CheckIfParaBankPalindrome {

	String reverse_title = "";
	
	public void getPalindrome() {
		
		//Open browser
		WebDriver driver = new ChromeDriver();
		//go to the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		//maximize page
		driver.manage().window().maximize();
		//Para bank name
		//String titleName = driver.findElement(By.xpath("//*[@title='ParaBank']")).getText();
		
		//System.out.println("The title = " + titleName);
		
		//Problem = value null 
		//Why?- getText() returns any text but no black text in HTML
		
		String title = driver.findElement(By.xpath("//*[@title='ParaBank']")).getAttribute("title");
		System.out.println("The title = " + title);
		
		//Now can check if it is a palindrome = reverse + condition
		System.out.println();
		System.out.println("Before Reverse = " + title);
		for(int i=title.length()-1; i>=0; i--) {
			reverse_title = reverse_title + title.charAt(i);
		}
		
		System.out.println("After reverse = " + reverse_title);
		if(title.equals(reverse_title)) {
			System.out.println("The title is a palindrome!!!");
		}
		
		else {
			System.out.println("The title is not a palindrome!!!");
		}
		
		//validation
		SoftAssert sf = new SoftAssert();
		sf.assertFalse(false);
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		CheckIfParaBankPalindrome obj = new CheckIfParaBankPalindrome();
		obj.getPalindrome();
	}
}
