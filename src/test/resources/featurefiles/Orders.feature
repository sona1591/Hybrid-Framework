Feature: End to End scenarios for placing orders
  
  @tag1
  Scenario: Verify whether the user is able to place orders
    Given I want to login into the application
    When I add a product to bag and checkout
    And I place an order
    Then I should see that the oder is successfully placed
   
  