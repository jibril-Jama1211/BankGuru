Feature: Adding New customer
  As a bank manager
  I want to add a new customer

# first scenario: create new customer

  Scenario Outline: bank manager can adds a new customer with a valid information
    Given I navigate to banakDemo
    And   I click on accept all button option for privacy management
    When  I enter a valid userId "<UserId>"
    And   I enter a valid password "<Password>"
    And   I click on login button
    And   I click on new customer
    And   I enter a valid customer name "<CustomerName>"
    And   I select gender type
    And   I enter a valid Date of Birth "<DateOfBirth>"
    And   I enter a valid address for customer "<CustomerAddress>"
    And   I enter a valid city name "<City>"
    And   I enter a valid state name "<State>"
    And   I enter a valid PIN number "<Pin>"
    And   I enter a valid mobile number "<Mobile>"
    And   I enter a valid email address "<Email>"
    And   customer creates valid password for his account "<AccountPassword>"
    And   I click on submit button
    Then  manager successfully creates a new customer and "<CustomerRegMsg>" is displayed
    And   I click on continue to return to managerHomepage

    Examples:
      |UserId    |Password|CustomerName|DateOfBirth|CustomerAddress       |City      |State     |Pin |Mobile      |Email            |AccountPassword|CustomerRegMsg|
      |mngr425682|pymYnYm |Mubarak Jama|12/12/1989 |10 oak road m12 3awe|Manchester|Lancashire|197890|07923476589 |j12@gmail.com|jibril1212     |Customer Registered Successfully!!!|






