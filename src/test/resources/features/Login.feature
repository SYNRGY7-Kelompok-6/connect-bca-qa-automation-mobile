@Login
Feature: Login

  @Login-Valid
  Scenario: User successfully login with valid credentials
    Given User is on login page
    And User input "zg6kx3FFrDatGLHG" as username
    And User input "Password_0" as password
    When User click on login button
    Then User is on home page