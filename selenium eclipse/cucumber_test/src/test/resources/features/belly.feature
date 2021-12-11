@all
Feature: Belly
  @smoke
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  @smoke1
  Scenario: a few cukes1
    Given I have 42 cukes in my belly1
    When I wait 1 hour1
    Then my belly should growl1