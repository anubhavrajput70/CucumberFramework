Feature: Login into account
  Existing user should be able to login to account using correct credentials

@login
  Scenario: Login into account with valid credentials
    Given User navigates to hackerrank website
    And User clicks on the login button on homepage
    And User clicks on the login for developer button
    And User enter a valid username
    And User enter a valid password
    When User clicks on the login button
    Then User should be taken to the successful login page
