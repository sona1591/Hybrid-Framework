Feature: Registration functionality scenario
 
    
 @Two
Scenario: Verify wheather the user is not allowed to register on skipping mandatory fields 
 
    Given I want to launch the application
    And I navigate to account registration page
    When I click on continue button
    Then I should see that the user Account is not created
    And I should see the error msgs informing the user to fill the mandatory fields
    
 
 
    
  @Four  
 Scenario:Verify wheather use is restricted from creating a duplicate account
 
  Given I want to launch the application
    And I navigate to account registration page
    When I fill the below duplicate details
    |FirstName | Sonal   							  |
    |LastName | Agrawal								  |
    |Email    | sonal.agrawal193@gmail.com |
    |Telephone| 1234567890							|   
    |Password | sona@123    					  |
    And I select the privacy policy
    Then I should subscribe to newsletter
    And I click on continue button
    Then I should see that Email id already registered
    
    
    @one
 Scenario: Verify user is able to register after filling all the details in the fields
 
  Given I want to launch the application
    And I navigate to account registration page
    When I fill all the valid details
    |FirstName | Sonal   							  |
    |LastName | Agrawal								  |
    |Email    | sonal.agrawal194@gmail.com |
    |Telephone| 1234567890							|   
    |Password | sona@123    					  |
    And I select the privacy policy
    And I click on continue button
    Then I should see that the user Account has successfully created
    @Three
 Scenario:Verify wheather use is able to register into the application after clicking on subscribe radio button as yes
 
  Given I want to launch the application
    And I navigate to account registration page
    When I fill all the valid details
    |FirstName | Sonal   							  |
    |LastName | Agrawal								  |
    |Email    | sonal.agrawal193@gmail.com |
    |Telephone| 1234567890							|   
    |Password | sona@123    					  |
    And I select the privacy policy
    Then I should subscribe to newsletter
    And I click on continue button
    Then I should see that the user Account has successfully created