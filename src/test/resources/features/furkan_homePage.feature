Feature:
  Background: I am on homepage
    When User clicked on sign in button
    Then User enter credentials and click on login button

  Scenario: HomePage Test
    When User is on homepage of Kayak
    Then User click on two for room number, four adult and two children for Hotels search
    Then User enter Austin for location
    Then User verify results contains Austin in it