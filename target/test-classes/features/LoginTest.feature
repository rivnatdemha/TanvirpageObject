Feature: Login test for flight booking

  @flightbooking_Login
  Scenario: User can log in correct credential
    When User navigate to flightbooking site
    And User enter correct user name
    And User enter correct password
    And User click login button