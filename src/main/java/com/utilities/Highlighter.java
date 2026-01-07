package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {

	public void getColor(WebDriver driver, WebElement elem){//parameters (,) =2
		JavascriptExecutor js = (JavascriptExecutor)driver; //help from object = type-casting
		js.executeScript("arguments[0].style.border='3px solid red'",elem);
		
	}

	//OOPs = Polymorphism (reuse same method) ==> overloading (same class)
	public void getColor(WebDriver driver, WebElement elem, String colorName){//parameters =3
		JavascriptExecutor js = (JavascriptExecutor)driver; //help from object = type-casting
		js.executeScript("arguments[0].style.border='3px solid "+colorName+"'",elem);
		
	}
	
	//same method = change parameter = number >> data-type >> position
}
