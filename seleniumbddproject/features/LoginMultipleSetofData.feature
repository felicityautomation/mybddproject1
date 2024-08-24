#Author: Bharath
#Feature: This is my first feature file using Cucumber
Feature: This is the Login feature of Facebook application

  Scenario Outline: Verify error message when logged in with invalid credentials
    Given User opened the browser
    When User navigated to the facebook login page
    And Enter email id as '<emailid>' and password as '<password>'
    And Click on Login button
    Then the error message is displayed

    Examples: 
      | emailid           | password            |
      | test@edurekha.com | welcome123          |
      | mytest@edk.com    | welcome123238749872 |
      
      
    #Scenario: Verify successful user registration on FB page
    #Given user opened the browser
    #And Enter registration details as specified in the file location "filepath.xls" and the sheet "sheet"
