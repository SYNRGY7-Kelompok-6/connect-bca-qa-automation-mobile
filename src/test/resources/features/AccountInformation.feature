@AccountInformation
  Feature: Account Information

    Background: User already logged in
      Given User is on login page
      And User input "user001" as userID
      And User input "Password_0" as password
      When User click on login button
      Then User is on home page

    @View-Balance
    Scenario: Viewing balance
      Given User click eye button
      Then User should be able see balance amount

    @Copy-Account-Number
    Scenario: Copying account number
      Given User click copy icon
      Then User should be able copied account number