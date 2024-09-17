
Feature: Login functionality scenarios
  I want to use this template for my feature file
Background:  Given I want to launch the application
   And I navigate to login page
   
  
 
  
  @Login
 Scenario: Verify that user is not able to login with invalid scenarios
 
   When I will login into the application using valid Email "sonal.agrawal99@gmail.com" and password "sona@99"
   Then I should see an error msg that the credentials are invalid

  
 @Login 
 Scenario: Verify that user is not able to login without providing credentials
  
   When I will login into the application using valid Email "" and password ""
   Then I should see an error msg that the credentials are invalid
 
 @Login 
 Scenario: Verify wheather the user is able to reset the forgotten password
  
   When I click on the forgotten password and given the email "sonal.agrawal193@gmail.com"
   Then I should see an msg that the confirmation link has been sent to your email address.
   
   @Login
  Scenario: Verify that user is able to login with valid scenarios
 
   When I will login into the application using valid Email "sonal.agrawal193@gmail.com" and password "sona@123"
   Then I should be able to login successfully
   And i should Logout