
Feature: Login Test
Successful login

  Scenario Outline: Title of your scenario
    Given to check the login
    When the user wants to use app click login in the field
    Then the user wants to enter the name as "AlexUser" in the field
    Then the user wants to enter the password as "Alex@123" in the field
	  And click the login in the field
	  
	  
    Examples: 
      | name  | password | 
      | AlexUser |   Alex@123   | 

