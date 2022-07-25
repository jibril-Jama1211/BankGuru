Feature: Edit existing bank Customer
  As a bank manager
  I want the ability to edit existing bank customers

  Scenario Outline:

    Given I navigate to banakDemo
    And   I click on accept all button option for privacy management
    When  I enter a valid userId "<UserId>"
    And   I enter a valid password "<Password>"
    And   I click on login button
    And   I click on edit customer
    And   I enter customerId as "<CustomerId>"
    And   I click on submit button
    And   I change pin as "<NewPin>"
    And   I click on submit button
    Then  manager updates customer details and an update message is displayed as "<UpdateMessage>"


    Examples:
    |UserId    |Password|CustomerId|NewPin|UpdateMessage                   |
    |mngr425682|pymYnYm |38063     |654321|Changes made to Customer records|