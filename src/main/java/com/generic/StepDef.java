package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	WebDriverWait wait;
	SeleniumPF pf;
	SoftAssert sa;
	
	@Given("Open the browser")
	public void open_the_browser() {//java method=void
	    driver = new ChromeDriver(); //help from class = upcasting
	    driver.manage().window().maximize();
	}
	@Given("Go to the Para Bank Application")
	public void go_to_the_para_bank_application() 	{
	    driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	    // implicit = HTML Load
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    pf = new SeleniumPF(driver); // initialize once here
	    // page Load timeout --> GUI
	    // ✅ Initialize wait object here
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@When("Insert valid username")
	public void insert_valid_username() {
		wait.until(ExpectedConditions.visibilityOf(pf.getUsername())); // ✅ wait is initialized now
		pf.getUsername().sendKeys("student"); //related object
	}
	@When("Insert valid password")
	public void insert_valid_password() {
		wait.until(ExpectedConditions.visibilityOf(pf.getPassword()));
		pf.getPassword().sendKeys("qa1234");
	}
	@When("Click the login button")
	public void click_the_login_button() {
		wait.until(ExpectedConditions.elementToBeClickable(pf.getLoginBtn()));
		pf.getLoginBtn().click();
	}
	@Then("Login should pass, with logout button visible")
	public void login_should_pass_with_logout_button_visible() {
		System.out.println("Test PASSED!");
		wait.until(ExpectedConditions.visibilityOf(pf.getLogoutBtn()));
		//check if visible
		//pf.getLogoutBtn().isDisplayed();
		// Condition to check --> Logout button should be visible
		//hard assert
		//Assert.assertTrue(condition);
		//Soft assert
		sa = new SoftAssert();
		sa.assertTrue(pf.getLogoutBtn().isDisplayed());
		sa.assertAll();
		driver.quit();
	}
	@When("Insert null value in username")
	public void insert_null_value_in_username() {
		wait.until(ExpectedConditions.visibilityOf(pf.getUsername()));
		pf.getUsername().sendKeys("");
	}
	@When("Insert invalid password")
	public void insert_invalid_password() {
		wait.until(ExpectedConditions.visibilityOf(pf.getPassword()));
		pf.getPassword().sendKeys("qa1233");
	}

	@Then("Login should fail, with logout button not visible")
	public void login_should_fail_with_logout_button_not_visible() {
		wait.until(ExpectedConditions.visibilityOf(pf.getErrorMsgwinvalidCredentials()));
		System.out.println("Login FAILED!");
		sa = new SoftAssert();
		sa.assertTrue(pf.getErrorMsgwinvalidCredentials().isDisplayed());
		sa.assertAll();
		driver.quit();
    }
	
}
