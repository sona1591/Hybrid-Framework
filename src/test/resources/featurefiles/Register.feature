Feature: Registration functionality scenario
 
 Scenario: Verify user is able to register afte filling all the details in the fields
 
    Given I want to launch the application
    And I navigate to account registration page
    When I fill all the valid details
    |FirstName | Sonal   							  |
    |LastName | Agrawal								  |
    |Email    | sonal.agrawal100@gmail.com |
    |Telephone| 1234567890							|   
    |Password | sona@123    					  |
    And I select the privacy policy
    Then I click on continue button
    And I should see that the user Account has successfully created

 