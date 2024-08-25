@Transfer
Feature: Transfer

  Background: User already logged in
    Given User is on login page
    And User input "user001" as userID
    And User input "Password_0" as password
    When User click on login button
    Then User is on home page

  @Transfer-Listed-Account
  Scenario: User transfers money to a listed account
    Given User is on the transfer page
    When User select list of account
    And User click lanjutkan button
    And User enter amount transaction with "12300"
    And User click proses transaksi button
    And User input pin
    Then User successfully transfer

  @Transfer-IncorrectPin-Listed-Account
  Scenario: User transfers money to a listed account with incorrect pin
    Given User is on the transfer page
    When User select list of account
    And User click lanjutkan button
    And User enter amount transaction with "12300"
    And User click proses transaksi button
    And User input incorrect pin
    Then User get an error message
