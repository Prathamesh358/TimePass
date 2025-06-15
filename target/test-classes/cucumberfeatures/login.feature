#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Feature
  I want to test login functionality in this feature
  
  #Background: 
  #Given Launch Application

  @tag1
  Scenario: Verify valid admin credentials
  
    When Enter valid Username
    And Enter Valid Password
    And Click on submit button
    Then Verify Login Successful Message
    #And Close Browser


  @tag2
  Scenario Outline: Verify Non-valid admin & user Credentials
  
    When Enter valid Uname <username>
    And Enter Valid Pass <password>
    And Click on submit button
    Then Verify Message <msg>
    #And Close Browser
    
    Examples: 
    |username|password      |msg                                     |
    |admin   |admin@12345678|Enter your userName and password correct|
    |user1   |user1@12345678|Enter your userName and password correct|
    
    
   @tag3 
   Scenario: Verify login for Invalid Credentials
   	When Enter Username and Password and verify message
   	|Username|Password      |Message                                 |
   	|user1   |user1@12345678|Enter your userName and password correct|
   #	And Close Browser
   	
   
    
    

   