#Author: Bharath
#Feature: This is my first feature file using Cucumber
Feature: This is the Login feature of Facebook application

  Background: 
    Given User opened the browser
    When User navigated to the facebook login page

  Scenario: Verify error message when logged in with invalid credentials
    And Enter email id as 'test@edurekha.com' and password as 'welcome123'
    And Click on Login button
    Then the error message is displayed

  Scenario: Verify error message when logged in with invalid credentials
    And Enter email id as 'test1@edurekha.com' and password as 'welcome1234'
    And Click on Login button
    Then the error message is displayed
