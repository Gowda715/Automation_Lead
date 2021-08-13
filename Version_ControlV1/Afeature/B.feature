@login
Feature: I am the user of Facebook application
  I am testing the Login feature of this application

  @Login1
  Scenario: Testing the login funtion of this application
    Given I am launching the given Facebook URL
    When I am entering the given username
    And I am entering the given password
    Then I am clicking on the login button

  @Login2
  Scenario: Forgotten password
    When Clicked on forgotten password
    Then Page should land on next link
