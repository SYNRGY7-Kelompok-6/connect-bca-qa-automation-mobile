@Profile
  Feature: Profile

    Background: User already logged in
      Given User is on login page
      And User input "user001" as userID
      And User input "Password_0" as password
      When User click on login button
      Then User is on home page

    @Edit-Name
    Scenario: User edit their name
      Given User is on the profile page
      When User click edit button
      And User fill the name with "Muh Sabili"
      Then User sucessfully edit the name