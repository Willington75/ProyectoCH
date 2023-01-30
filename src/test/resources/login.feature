Feature: Login
  Rule: I want to Login successfully
    @Login
    Scenario: Login User Successfully
      Given User want login user to service
      When  The user inputs data for login
      Then  User visualize his name in the page
