Feature: Adding New customer
  As a bank manager
  I want to add a new customer

# first scenario

  Scenario Outline: bank manager can adds a new customer with a valid information
    Given I navigate to banakDemo
    When  I enter a valid userId
    And   I enter a valid password
    And   I click on login button
    And   I click on new customer
    And   I enter a valid customer name
    And   I select gender type
    And   I enter a valid Date of Birth
    And   I enter a valid address for customer
    And   I enter a valid city name
    And   I enter a valid state name
    And   I enter a valid PIN number
    And   I enter a valid mobile number
    And   I enter a valid email address
    And   customer creates valid password for his account






    Examples:
      |  |





