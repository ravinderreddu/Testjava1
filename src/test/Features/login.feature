Feature: loginFeature
  This feature deals with the login functionality of the applcation

  Scenario: Login with correct username and password'
    Given navigate to the login page
    And enter the username  as admin and password as admin
    And click login button
    Then should see the user form page
