# Documenting all Personal Details related scenarios of an employee provided in resume

@personal
Feature: Capturing Personal Details
  
  @name
  Scenario: Employee Name Length Check
    Given Employee Application is Submitted
    When Employee Name Check is invoked
    Then Ensure that Name is Less Than "30" Characters
    
  @mobile @number
  Scenario: Mobile Number Check 
    Given Employee Application is Submitted
    When Mobile Number Check is invoked
    Then Ensure that Mobile Number provided is valid
    
  @postcode @number
  Scenario: PostCode Check
    Given Employee Application is Submitted
    When PostCode Check is invoked
    Then Ensure that Post Code Number provided is valid  