
Feature: Search functionality scenarios
 
@search
  Scenario:Verify user is able to search for the products
    Given I want to launch the application
    When I search for a product "Samsung Galaxy Tab 10.1"
    Then I should see the product in search result

  @search
  Scenario:Verify whether the user is informed when the product being searched is not available
    Given I want to launch the application
    When I search for a product "cellphone"
    Then I should get the msg informing "There is no product that matches the search criteria."
  