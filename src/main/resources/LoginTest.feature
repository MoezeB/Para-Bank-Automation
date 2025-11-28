@Smoke @Regression @Functional
Feature: Login Function Test 
Background: 
Given Open the browser
And Go to the Para Bank Application

	@Positive @TC_BOL12
	Scenario: As a Para Bank user, login should be successful with valid credentials

		When Insert valid username
		And Insert valid password
		And Click the login button
		Then Login should pass, with logout button visible

	@Negative @TC_BOL13
	Scenario: As a Para Bank user, login should fail with invalid credentials

		When Insert valid username
		And Insert invalid password
		And Click the login button
		Then Login should fail, with logout button not visible

	@Negative @TC_BOL14
	Scenario: As a Para Bank user, login should fail with invalid credentials

		When Insert null value in username
		And Insert valid password
		And Click the login button
		Then Login should fail, with logout button not visible
	
	
	
	
	