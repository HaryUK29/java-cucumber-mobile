@login
Feature: Login

  @login @positive
  Scenario: As a user i should be able to login
    Given entry valid credential
    When tap login button
    Then user should be able to login