
@tag
Feature: adding two numbers

  @tag1
  Scenario: add two integers
    Given two numbers 1 and 10
    When add 1 and 10
    Then some should be 11

  @tag2
   Scenario: add two doubles
    Given two numbers 1 and 10
    When add 1 and 10
    Then some should be 11

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
