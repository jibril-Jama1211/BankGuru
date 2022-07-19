Feature: User credentials Login
  As a bank manager
  I want to login to bank demo

# first Scenario

  Scenario Outline: Bank Manager can login with valid userId and Password
    Given I navigate to banakDemo
    And   I click on accept all button option for privacy management
    When  I enter a valid userId "<UserId>"
    And   I enter a valid password "<Password>"
    And   I click on login button
    Then  manager is successfully logged in and manager Id is displayed as "<ManagerId>"

    Examples:
    |UserId    |Password|ManagerId            |
    |mngr425682|pymYnYm |Manger Id : mngr41586|