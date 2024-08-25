@Login
Feature: Login

  @Login-Valid
  Scenario: User successfully login with valid credentials
    Given User is on login page
    And User input "user001" as userID
    And User input "Password_0" as password
    When User click on login button
    Then User is on home page

  @Login-Invalid
  Scenario: User successfully login with valid credentials
    Given User is on login page
    And User input "user002" as userID
    And User input "Password_0" as password
    When User click on login button
    Then User get error login message