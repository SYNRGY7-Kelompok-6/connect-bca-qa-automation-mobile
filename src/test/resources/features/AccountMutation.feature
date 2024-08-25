@Mutation
Feature: Account Mutation

  Background: User already logged in
    Given User is on login page
    And User input "user001" as userID
    And User input "Password_0" as password
    When User click on login button
    Then User is on home page

  @Mutation-HariIni
  Scenario: User check mutation for current day
    Given User in on mutation page
    When User click hari ini button
    Then User can see the mutation of current day

  @Mutation-BulanIni
  Scenario: User check mutation for current month
    Given User in on mutation page
    When User click bulan ini button
    And User scroll to "dummy transfer"
    Then User can see the mutation of current month

#  @Mutation-Cari
#  Scenario: User check mutation for current month
#    Given User in on mutation page
#    When User click cari button
#    And User scroll to "cari mutasi"
#    Then User can see the mutation of current month