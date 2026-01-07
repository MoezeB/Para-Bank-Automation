@Smoke @Regression @Functional
Feature: Login Function – Data Driven Validation

  # This feature tests the login functionality using multiple sets of data
  # The test data DOES NOT live here
  # Instead, placeholders are used and real values come from Excel

  @Positive @DataDriven
  Scenario Outline: As a user of the Para Bank application, the login should behave based on Excel-driven credentials

    # Step 1: Launch the browser (ChromeDriver)
    Given Open the browser

    # Step 2: Navigate to the ParaBank application URL
    # The URL is pulled from BaseConfigurations, NOT hardcoded
    And Go to the Para Bank Application

    # Step 3: Insert username
    # Example: Row1_Col1
    # This value is sent to StepDef, then translated to Excel row/column
    When Insert valid username "<username>"

    # Step 4: Insert password
    # Example: Row1_Col2
    # StepDef converts this token into actual Excel data
    And Insert valid password "<Password>"

    # Step 5: Click Login button
    And Click the login button

    # Step 6: Validate login result
    # This step currently expects a SUCCESSFUL login
    # Only Excel row with correct credentials will pass
    Then Login should pass, with logout button visible

    # ================================
    # Examples Table Explanation
    # ================================
    # The values below are NOT credentials
    # They are POINTERS to Excel cells
    #
    # Row1_Col1 -> Excel Row 1, Column 1 (Username)
    # Row1_Col2 -> Excel Row 1, Column 2 (Password)
    #
    # HandleExampleTableData converts these into numbers
    # ExcelManager reads the actual value
    #
    # This keeps real data hidden and secure
    Examples:
      | username   | Password   |
      | Row1_Col1 | Row1_Col2 |
      | Row2_Col1 | Row2_Col2 |
      | Row3_Col1 | Row3_Col2 |
