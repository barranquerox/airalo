Feature: Example browser testing

Scenario: Finding some cheese
  Given I am on the Google search page
  Given I close the cookie banner
  When I search for "Cheese!"
  Then the page title should start with "cheese"