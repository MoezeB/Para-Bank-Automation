package com.testrun;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class MenuBar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com");
		driver.manage().window().maximize();
		//implicit wait = HTML page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//List<String> myList = new ArrayList<>();
		List<WebElement>menuBar = driver.findElements(By.xpath("//*[@class='MuiBox-root mui-w9apd5']//a"));
		
		System.out.println("Menu Bar Total Count = " + menuBar.size());
		System.out.println();
		
		List<String> myList = new ArrayList<>();
			
		for(int i=0;i<menuBar.size();i++) {//
			//positive
			System.out.println(menuBar.get(i).getText());
			System.out.println();
			myList.add(menuBar.get(i).getText());

		}//
		
		System.out.println(myList);
		
		SoftAssert sf = new SoftAssert();
		//positive
		sf.assertTrue(myList.contains("Pharmacy"));

		//negative
		sf.assertTrue(! myList.contains("City"));
		
	}
}
