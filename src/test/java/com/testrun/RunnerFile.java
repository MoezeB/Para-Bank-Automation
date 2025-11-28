package com.testrun;

//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

//import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    plugin = {"pretty", "json:target/cucumber.json"}, 
	    features = {"src/main/resources/LoginTest.feature"},
	    glue = {"com.generic"},
	    tags = "@Smoke or @Positive",
	    monochrome = true,
	    dryRun = false
	)

public class RunnerFile extends AbstractTestNGCucumberTests {
	//cucumber hook
	
//	@Before
//	public void setup() {
//		
//	}
//	
//	@BeforeTest
//	public void setup1() {
//		
//	}
//	
//	@Test
//	public void setup3() {
//		
//	}
//	
//  @AfterTest
//	public void setup4() {
//
//	}
	
}

