Feature: Login
  I want to use this template for my feature file

 Scenario: Successful login with valid credentials
    Given User Launch Chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Logout link
    Then Page Title should be "Your store. Login"
    And Close browser
    
Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and password as "<password>"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Logout link
    Then Page Title should be "Your store. Login"
    And Close browser
    
    Examples:
    | email                        |     password             |
    |  admin@yourstore.com         |       admin              |
    |   admin@yourstore.com        |       admin23            |

 