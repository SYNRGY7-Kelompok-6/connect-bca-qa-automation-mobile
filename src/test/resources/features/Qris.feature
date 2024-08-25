@Qris
Feature: QRIS

  Background: User already logged in
    Given User is on login page
    And User input "user001" as userID
    And User input "Password_0" as password
    When User click on login button
    Then User is on home page

  @View-QRCode
  Scenario: View QR Code QRIS
    Given User is on the qris page
    When User click tampilkan QR button
    Then QR Code is displayed