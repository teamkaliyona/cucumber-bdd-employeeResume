# Documenting all Professional Details related scenarios of an employee provided in resume
@professional
Feature: Capturing Professional Details
  

  @office
  Scenario Outline: Office Check
    Given Employee Application is submitted
    When Need to crosscheck office or employee details in "<OfficeName>"
    Then Call the <Contact Number> and verify the details

    Examples: 
      | OfficeName  | Contact Number | 
      | Company A   | 12345          | 
      | Company B   | 67890          | 

      
  @name
  Scenario: Office Name Length Check
    Given Employee Application is Submitted
    When Office Name Check is invoked
    Then Ensure that Name is Less Than "50" Characters