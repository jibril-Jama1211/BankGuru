Feature: User credentials Login
  As a bank manager
  I want to login to bank demo

# first Scenario

  Scenario: Bank Manager can login with valid userId and Password
    Given I navigate to banakDemo
    And   I click on accept all button option for privacy management
    When  I enter valid userId as "mngr415866"
    And   I enter valid password as "YmabupU"
    And   I click on login button
    Then  manager is successfully logged in and manager Id is displayed as "Manger Id : mngr415866"