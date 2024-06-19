Feature: Customers
 
  Scenario: Add a new Customer
    Given User Launch Chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then User can view dashboard
    When User click on customers menu
    And click on customers menu item
    And click on add new button
    Then user can view add new customer page
    When user enter customer info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully"
    And close browser
    
    
 